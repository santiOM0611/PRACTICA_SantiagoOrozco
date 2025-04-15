package PRACTICA.PRACTICA.dao;

import PRACTICA.PRACTICA.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroDao extends JpaRepository<Libro, Long> {
    // Puedes agregar métodos personalizados de consulta aquí si los necesitas
}
