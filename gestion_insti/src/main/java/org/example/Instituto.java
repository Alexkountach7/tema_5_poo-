package org.example;

import java.util.ArrayList;

public class Instituto {
    private String nombre;
    private String poblacion;
    private ArrayList<Estudiante> estudiante;
    private ArrayList<Curso> curso;


    public Instituto(String nombre, String poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.estudiante = new ArrayList<>();
        this.curso = new ArrayList<>();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public ArrayList<Curso> getCurso() {
        return curso;
    }

    public void setCurso(ArrayList<Curso> curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Instituto{" +
                "nombre='" + nombre + '\'' +
                ", poblacion='" + poblacion + '\'' +
                ", estudiante=" + estudiante +
                ", curso=" + curso +
                '}';
    }
}