package com.corhuila.BackendNoSql.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.BackendNoSql.Repository.LibroRepository;
import com.corhuila.BackendNoSql.collection.Libro;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> listarLibros() {
        return libroRepository.findAll();
    }

    public Libro listaLibro(int id) {
        return libroRepository.findById(id).orElse(null);
    }

    public Libro crearLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public Libro updateLibro(int id, Libro libro) {
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

    public void delete(int id) {
        libroRepository.deleteById(id);
    }

}