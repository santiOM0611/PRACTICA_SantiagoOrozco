package PRACTICA.PRACTICA.controller;

import PRACTICA.PRACTICA.domain.Libro;
import PRACTICA.PRACTICA.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/libro")
public class LibroController {
    
    @Autowired
    private LibroService libroService;
    
    @GetMapping("/listado")
    public String inicio(Model model) {
        var libros = libroService.getLibros(false);
        model.addAttribute("libros", libros);
        model.addAttribute("totalLibros", libros.size());
        return "/libro/listado";
    }
    
    @GetMapping("/nuevo")
    public String libroNuevo(Libro libro) {
        return "/libro/modifica";
    }
    
    @PostMapping("/guardar")
    public String libroGuardar(Libro libro) {        
        libroService.save(libro);
        return "redirect:/libro/listado";
    }
    
    @GetMapping("/eliminar/{idLibro}")
    public String libroEliminar(Libro libro) {
        libroService.delete(libro);
        return "redirect:/libro/listado";
    }
    
    @GetMapping("/modificar/{idLibro}")
    public String libroModificar(Libro libro, Model model) {
        libro = libroService.getLibro(libro);
        model.addAttribute("libro", libro);
        return "/libro/modifica";
    }   
}
