package com.corhuila.BackendNoSql.Controller;

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

import com.corhuila.BackendNoSql.Service.LibroService;
import com.corhuila.BackendNoSql.collection.Libro;

@RestController
@RequestMapping("/Libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> listarLibros() {
        return libroService.listarLibros();
    }

    @GetMapping("/{id}")
    public Libro listaLibro(@PathVariable int id) {
        return libroService.listaLibro(id);
    }

    @PostMapping
    public Libro crearLibro(@RequestBody Libro libro) {
        return libroService.crearLibro(libro);
    }

    @PutMapping("/{id}")
    public Libro updateLibro(@PathVariable int id, @RequestBody Libro libro) {
        return libroService.updateLibro(id, libro);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        libroService.delete(id);
    }
}
