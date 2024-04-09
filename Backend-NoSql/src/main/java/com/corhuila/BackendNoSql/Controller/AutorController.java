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

import com.corhuila.BackendNoSql.Service.AutorService;
import com.corhuila.BackendNoSql.collection.Autor;

@RestController
@RequestMapping("/Autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> listarAutores() {
        return autorService.listarAutores();
    }

    @GetMapping("/{id}")
    public Autor listaAutor(@PathVariable int id) {
        return autorService.listaAutor(id);
    }

    @PostMapping
    public Autor crearAutor(@RequestBody Autor autor) {
        return autorService.crearAutor(autor);
    }

    @PutMapping("/{id}")
    public Autor updateAutor(@PathVariable int id, @RequestBody Autor autor) {
        return autorService.updateAutor(id, autor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        autorService.delete(id);
    }
}