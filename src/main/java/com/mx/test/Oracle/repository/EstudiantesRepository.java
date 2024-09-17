package com.mx.test.Oracle.repository;

import com.mx.test.Oracle.model.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface EstudiantesRepository extends JpaRepository<Estudiantes, Long> {
}
