package PRACTICA.PRACTICA.dao;

import PRACTICA.PRACTICA.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {
    // Puedes agregar métodos personalizados de consulta aquí si los necesitas
}