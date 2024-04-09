package com.corhuila.BackendNoSql.collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Libros")
public class Libro {

    @Id
    private int id;
    private String titulo;
    private String ISBN;
    private String genero;
    private int anioPublicacion;
    private String sinopsis;
    @DBRef
    private Autor autor;

    public Libro(int id, String titulo, String iSBN, String genero, int anioPublicacion, String sinopsis, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        ISBN = iSBN;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
        this.sinopsis = sinopsis;
        this.autor = autor;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    
}
