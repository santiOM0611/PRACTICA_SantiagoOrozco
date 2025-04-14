package PRACTICA.PRACTICA.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCategoria;
    
    private String nombre;
    private String descripcion;
    private boolean activo;
    
    @OneToMany(mappedBy = "categoria")
    private List<Libro> libros;
    
    public Categoria() {
    }
    
    public Categoria(String nombre, String descripcion, boolean activo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.activo = activo;
    }
}