package com.corhuila.BackendNoSql.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.corhuila.BackendNoSql.collection.Libro;

@Repository
public interface LibroRepository extends MongoRepository<Libro, Integer> {

}

