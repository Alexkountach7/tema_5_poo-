package org.example;

public class personaAPP {
    public static void main(String[] args) {
        persona profe = new persona("Patricia", "100000000A", 50);
        System.out.println(profe.getEdad());

        persona alum = new persona();
        System.out.println(alum.getDni()); // null
        alum.setDni("2000000X");
        System.out.println(alum.getDni());
    }
}
