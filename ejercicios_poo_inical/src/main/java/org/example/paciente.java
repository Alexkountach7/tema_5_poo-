package org.example;

import java.util.Random;

public class paciente {

    private static final char DEF_SEXO = 'X';
    private Random aleatorio = new Random();
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private int altura;

    public paciente(String nombre, int edad, String dni, char sexo, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public paciente() {
        this(null, 0, null, DEF_SEXO, 0, 0);
    }
    public String generarDNI () {
        String dni = "";
        for (int i =0; i<8; i++){
            int num = aleatorio.nextInt(10);
            dni = dni+Integer.toString(num);
        }
    }
}
