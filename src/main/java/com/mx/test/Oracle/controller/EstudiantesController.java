package com.mx.test.Oracle.controller;

import com.mx.test.Oracle.model.Estudiantes;
import com.mx.test.Oracle.services.EstudiantesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {

    @Autowired
    private EstudiantesServices estudiantesServices;

    @GetMapping()
    public List<Estudiantes> findEstudiantes(){
        return estudiantesServices.findEstudiantes();
    }

    @GetMapping("/{idEstudiante}")
    public  Optional<Estudiantes> findEstudianteById(@PathVariable Long idEstudiante){

        return estudiantesServices.estudiantesFindById(idEstudiante);
    }

    @PostMapping
    public Estudiantes saveEstudiantes(@RequestBody Estudiantes estudiantes){
        return estudiantesServices.saveOrUpdateEstudiantes(estudiantes);
    }

}
