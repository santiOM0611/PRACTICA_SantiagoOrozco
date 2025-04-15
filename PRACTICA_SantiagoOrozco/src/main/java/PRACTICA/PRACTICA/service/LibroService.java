package PRACTICA.PRACTICA.service;

import PRACTICA.PRACTICA.domain.Libro;
import java.util.List;

public interface LibroService {
    
    // Se obtiene un listado de libros en un List
    public List<Libro> getLibros(boolean activos);
    
    // Se obtiene un Libro, a partir del id de un libro
    public Libro getLibro(Libro libro);
    
    // Se inserta un nuevo libro si el id del libro está vacío
    // Se actualiza un libro si el id del libro NO está vacío
    public void save(Libro libro);
    
    // Se elimina el libro que tiene el id pasado por parámetro
    public void delete(Libro libro);
}