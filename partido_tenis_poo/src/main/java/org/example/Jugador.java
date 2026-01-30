package org.example;

public class Jugador {
    private String nombre;
    private int ranking;
    private String rival;

    public Jugador(String nombre, int ranking) {
        this.nombre = nombre;
        this.ranking = ranking;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRival() {
        return rival;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRival(String rival) {
        this.rival = rival;
    }

    @Override
    public String toString () {
        return "nombre: "+nombre +
                "ranking: "+ranking;
    }
}
