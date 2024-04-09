package com.corhuila.BackendNoSql.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.BackendNoSql.Repository.AutorRepository;
import com.corhuila.BackendNoSql.collection.Autor;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> listarAutores() {
        return autorRepository.findAll();
    }

    public Autor listaAutor(int id) {
        return autorRepository.findById(id).orElse(null);
    }

    public Autor crearAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public Autor updateAutor(int id, Autor autor) {
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
    public void delete(int id) {
        autorRepository.deleteById(id);
    }

}
