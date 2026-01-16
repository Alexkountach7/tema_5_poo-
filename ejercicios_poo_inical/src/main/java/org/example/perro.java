package org.example;

public class perro {
    private String raza;
    private String pelo;
    private int peso;
    private int patas;
    private String color;

    public perro(String raza, String pelo, int peso, String color) {

        this.raza = raza;
        this.pelo = pelo;
        this.peso = peso;
        this.patas = patas;
        this.color = color;
    }

    public perro() {

    }

    public void imprimirficha() {
        System.out.println("raza: " + raza);
        System.out.println("pelo: " + pelo);
        System.out.println("peso: " + peso);
        System.out.println("patas: " + patas);
        System.out.println("color" + color);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza() {
        raza = raza;
    }

    public void setRaza(String raza) {

        this.raza = raza;
    }

    public String getPelo() {
        return pelo;
    }
    public void setPelo(String pelo){
        pelo = pelo;
    }

}

