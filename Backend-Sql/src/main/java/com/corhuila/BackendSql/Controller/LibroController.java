package com.corhuila.BackendSql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.BackendSql.Entity.Libro;
import com.corhuila.BackendSql.Service.LibroService;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> listarLibro() {
        return libroService.listarLibro();
    }

    @GetMapping("/{id}")
    public Libro buscarLibro(@PathVariable int id) {
        return libroService.buscarLibro(id);
    }

    @PostMapping
    public Libro crearLibro(@RequestBody Libro libro) {
        return libroService.crearLibro(libro);
    }

    @PutMapping("/{id}")
    public Libro actualizarLibro(@PathVariable int id, @RequestBody Libro libro) {
        return libroService.actualizarLibro(id, libro);
    }

    @DeleteMapping("/{id}")
    public void eliminarLibro(@PathVariable int id) {
        libroService.eliminarLibro(id);
    }
}
