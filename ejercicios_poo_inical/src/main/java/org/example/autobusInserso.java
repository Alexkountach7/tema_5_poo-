package org.example;

import java.util.ArrayList;

public class autobusInserso {
    private String matricula;
    private String destino;
    private ArrayList<abuelo> listaabuelo;

    public autobusInserso(String matricula, String destino) {
        this.matricula = matricula;
        this.destino = destino;
        this.listaabuelo = new ArrayList<>();

    }
    public void mostrarpasajeros () {
        for (abuelo abuelo : listaabuelo){
            System.out.println("-" +abuelo.getNombre());
        }
    }
    public void mostrarmayor (int edad){
        System.out.print("pasajeros mayores a" +edad + "años");
        for (abuelo abuelo : listaabuelo){
            if (abuelo.getEdad()>=edad){
                System.out.println("");
        }
    }

    public void insertarabuelo (abuelo abuelo){
        listaabuelo.add(abuelo);
    }

    public  void borrarabuelo(abuelo abuelo){
        listaabuelo.remove(abuelo);
    }
    public ArrayList<abuelo> getListaabuelo() {
        return listaabuelo;
    }

    public String getDestino() {
        return destino;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setListaabuelo(ArrayList<abuelo> listaabuelo) {
        this.listaabuelo = listaabuelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
