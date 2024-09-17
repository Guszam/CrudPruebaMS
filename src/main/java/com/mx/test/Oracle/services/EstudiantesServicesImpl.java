package com.mx.test.Oracle.services;

import com.mx.test.Oracle.model.Estudiantes;
import com.mx.test.Oracle.repository.EstudiantesRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudiantesServicesImpl implements EstudiantesServices{

    @Autowired
    private EstudiantesRepository estudiantesRepository;

    @Override
    public List<Estudiantes> findEstudiantes() {
        List<Estudiantes> estudiantes = estudiantesRepository.findAll();
        return estudiantes;
    }

    @Override
    public Optional<Estudiantes> estudiantesFindById(Long id){

        return estudiantesRepository.findById(id);
    }

    @Override
    public Estudiantes saveOrUpdateEstudiantes(@NotNull Estudiantes estudiantes){
        Estudiantes st = new Estudiantes();

        st.setIdEstudiante(estudiantes.getIdEstudiante());
        st.setNombre(estudiantes.getNombre());
        st.setApellido(estudiantes.getApellido());
        st.setEdad(estudiantes.getEdad());

        estudiantesRepository.save(st);
        return st;
    }
}
