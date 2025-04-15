package PRACTICA.PRACTICA.service.impl;

import PRACTICA.PRACTICA.dao.LibroDao;
import PRACTICA.PRACTICA.domain.Libro;
import PRACTICA.PRACTICA.service.LibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibroServiceImpl implements LibroService {
    
    @Autowired
    private LibroDao libroDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Libro> getLibros(boolean activos) {
        var lista = libroDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Libro getLibro(Libro libro) {
        return libroDao.findById(libro.getIdLibro()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Libro libro) {
        libroDao.save(libro);
    }
    
    @Override
    @Transactional
    public void delete(Libro libro) {
        libroDao.delete(libro);
    }
}
