package com.corhuila.BackendSql.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.BackendSql.Entity.Autor;
import com.corhuila.BackendSql.Repository.AutorRepository;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> listarAutor() {
        return autorRepository.findAll();
    }

    public Autor buscarAutor(int id) {
        return autorRepository.findById(id).orElse(null);
    }

    public Autor crearAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public Autor actualizarAutor(int id, Autor autor) {
        Autor autorToUpdate = autorRepository.findById(id).orElse(null);
        if (autorToUpdate != null) {
            autorToUpdate.setNombre(autor.getNombre());
            autorToUpdate.setApellido(autor.getApellido());
            autorToUpdate.setNacionalidad(autor.getNacionalidad());
            autorToUpdate.setFechaNacimiento(autor.getFechaNacimiento());
            autorToUpdate.setBiografia(autor.getBiografia());
            return autorRepository.save(autorToUpdate);
        }
        return null;
    }

    public void eliminarAutor(int id) {
        autorRepository.deleteById(id);
    }
}
