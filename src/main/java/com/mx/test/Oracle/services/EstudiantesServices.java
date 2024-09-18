package com.mx.test.Oracle.services;

import com.mx.test.Oracle.model.Estudiantes;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface EstudiantesServices {

    List<Estudiantes> findEstudiantes();

    Optional<Estudiantes> estudiantesFindById(Long id);

    Estudiantes saveOrUpdateEstudiantes(Estudiantes estudiantes);

    ResponseEntity<?> updateEstudiantes (Estudiantes estudiantes);
}
