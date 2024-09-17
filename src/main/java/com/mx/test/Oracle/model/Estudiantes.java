package com.mx.test.Oracle.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import javax.naming.Name;

@Data
@Entity
@Table(name = "ESTUDIANTES")
public class Estudiantes {

    @Id
    @Column(name = "ID_ESTUDIANTE")
    public Long idEstudiante;

    @Column(name = "NOMBRE")
    public String nombre;

    @Column(name = "APELLIDO")
    public String apellido;

    @Column(name = "EDAD")
    public Integer edad;

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
