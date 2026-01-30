package chalet_poo;

import java.util.ArrayList;
import java.util.Scanner;

public class casa {
    static Scanner sc = new Scanner(System.in);
    private String direccion;
    private propietario propietario;

    public propietario getPropietario() {
        return propietario;
    }
    public casa(String casa){


    }
    public void setPropietario(propietario propietario) {
        this.propietario = propietario;
    }

    public ArrayList<habitacion> getListahabitacion() {
        return listahabitacion;
    }

    public void setListahabitacion(ArrayList<habitacion> listahabitacion) {
        this.listahabitacion = listahabitacion;
    }

    private ArrayList<habitacion> listahabitacion;

    public casa (String direccion) {
        this.direccion = direccion;
        listahabitacion = new ArrayList<>();
    }

    public void crearhabitacion (String nombre, double metro){
        habitacion habitacion = new habitacion(nombre, metro);
        listahabitacion.add(habitacion);
    }
    public void borrarhabitacion (String nombre) {
        for (habitacion habitacion : listahabitacion) {
            if (habitacion.getNombre().equals(nombre)) {
                listahabitacion.remove(habitacion);
                System.out.println("habitacion " +nombre+ " borrada con exito");
                return;
            }
        }



    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void mostrarhabitacion () {
        for (habitacion habitacion : listahabitacion){

        }


        }
    public habitacion gethabitacionmasgrande () {
        habitacion maximo = listahabitacion.get(0);
        for (habitacion habitacion : listahabitacion) {
            if (maximo.getMetros()<habitacion.getMetros()){
                maximo=habitacion;
            }
        }
        return maximo;
    }
    // dos habitaciones con el mismo nombre


    @Override
    public String toString(){
        return
        "direccion " +direccion;
    }


}
