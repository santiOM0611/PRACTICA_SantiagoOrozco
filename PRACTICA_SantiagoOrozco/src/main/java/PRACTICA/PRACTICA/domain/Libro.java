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
    private Integer anioPublicacion;
    private Double precio;
    private Integer existencias;
    private boolean activo;
    
    @ManyToOne
    @JoinColumn(name="id_Categoria")
    private Categoria categoria;
    
    public Libro() {
    }
}