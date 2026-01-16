package org.example;

public class persona {
    private String nombre;
    private String dni;
    private int edad;

    // Constructor con parámetros
    public persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    // Constructor vacío
    public persona() {
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprimirInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
    }
}
