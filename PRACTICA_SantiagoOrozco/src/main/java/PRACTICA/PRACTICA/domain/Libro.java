package PRACTICA.PRACTICA.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="libro")
public class Libro implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_libro")
    private Long idLibro;
    
    private String titulo;
    private String autor;
    private String editorial;
    
    @Column(name="anio_publicacion")
    private Integer anioPublicacion;
    
    private Double precio;
    private Integer existencias;
    private boolean activo;
    
    public Libro() {
    }
    
    public Libro(String titulo, String autor, String editorial, Integer anioPublicacion, Double precio, Integer existencias, boolean activo) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
        this.existencias = existencias;
        this.activo = activo;
    }
}
