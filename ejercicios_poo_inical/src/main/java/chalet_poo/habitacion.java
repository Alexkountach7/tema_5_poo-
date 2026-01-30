package chalet_poo;

import java.util.ArrayList;

public class habitacion {
    private String nombre;
    private double metros;
    private ArrayList<Electrodomestico> electrodomesticos;

    public habitacion(String nombre, double metros) {
        this.metros = metros;
        this.nombre = nombre;
        this.electrodomesticos = new ArrayList<>();
    }

    public void agregarelectrodomestico(String electrodomestico_uno, int consumo_uno) {
        electrodomesticos.add(new Electrodomestico(electrodomestico_uno, consumo_uno));
    }

    public void borrarelectrodomestico(String electrodomestico_uno, int consumo) {
        electrodomesticos.remove(new Electrodomestico(electrodomestico_uno, consumo));

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public void mostrarelectrodomesticos() {
        System.out.println("los electrodomesticos son: " + electrodomesticos);


    }

    public int doublecalcularconsumo() {
        for (int i = 0; i < electrodomesticos.size(); i++) {
            int suma_ = electrodomesticos.get(i);

        }
        return 0;
    }
}