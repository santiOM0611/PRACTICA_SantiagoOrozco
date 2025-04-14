package PRACTICA.PRACTICA.service;

import PRACTICA.PRACTICA.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    // Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos);
    
    // Se obtiene una Categoria, a partir del id de una categoria
    public Categoria getCategoria(Categoria categoria);
    
    // Se inserta una nueva categoria si el id de la categoria está vacío
    // Se actualiza una categoria si el id de la categoria NO está vacío
    public void save(Categoria categoria);
    
    // Se elimina la categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);
}