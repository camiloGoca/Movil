package com.corhuila.BackendNoSql.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.corhuila.BackendNoSql.collection.Autor;

@Repository
public interface AutorRepository extends MongoRepository<Autor, Integer> {

}
