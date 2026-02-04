package org.example;

import java.time.LocalDate;

public class Invitado {
private String nombre;
private String profesion;
private LocalDate fecha_visita;
private int temporada;

public Invitado(String nombre, String profesion, LocalDate fecha_visita ) {
    this.nombre = nombre;
    this.profesion = profesion;
    this.fecha_visita = fecha_visita;

}
}
