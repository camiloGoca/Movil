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

import com.corhuila.BackendSql.Entity.Autor;
import com.corhuila.BackendSql.Service.AutorService;


@RestController
@RequestMapping("/Autor")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> listarAutor() {
        return autorService.listarAutor();
    }

    @GetMapping("/{id}")
    public Autor buscarAutor(@PathVariable int id) {
        return autorService.buscarAutor(id);
    }

    @PostMapping
    public Autor crearAutor(@RequestBody Autor autor) {
        return autorService.crearAutor(autor);
    }

    @PutMapping("/{id}")
    public Autor actualizarAutor(@PathVariable int id, @RequestBody Autor autor) {
        return autorService.actualizarAutor(id, autor);
    }

    @DeleteMapping("/{id}")
    public void eliminarAutor(@PathVariable int id) {
        autorService.eliminarAutor(id);
    }
}
