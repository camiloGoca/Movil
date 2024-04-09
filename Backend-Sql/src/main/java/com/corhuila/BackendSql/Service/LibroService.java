package com.corhuila.BackendSql.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.BackendSql.Entity.Libro;
import com.corhuila.BackendSql.Repository.LibroRepository;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> listarLibro() {
        return libroRepository.findAll();
    }

    public Libro buscarLibro(int id) {
        return libroRepository.findById(id).orElse(null);
    }

    public Libro crearLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public Libro actualizarLibro(int id, Libro libro) {
        Libro libroToUpdate = libroRepository.findById(id).orElse(null);
        if (libroToUpdate != null) {
            libroToUpdate.setTitulo(libro.getTitulo());
            libroToUpdate.setISBN(libro.getISBN());
            libroToUpdate.setGenero(libro.getGenero());
            libroToUpdate.setAnioPublicacion(libro.getAnioPublicacion());
            libroToUpdate.setSinopsis(libro.getSinopsis());
            libroToUpdate.setAutor(libro.getAutor());
            return libroRepository.save(libroToUpdate);
        }
        return null;
    }

    public void eliminarLibro(int id) {
        libroRepository.deleteById(id);
    }

}
