package com.corhuila.BackendSql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corhuila.BackendSql.Entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {}