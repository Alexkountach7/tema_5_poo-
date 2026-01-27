package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lista_compra {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listado = new ArrayList<>();

        System.out.println(" la lista esta vacia "+ listado.isEmpty());

        listado.add("lechuga");
        listado.add("carne");
        listado.add("pan");
    System.out.println(" la lista esta vacia "+ listado.isEmpty());

    listado.addAll(Arrays.asList("pescado","agua","aceite","cereal","melon"));

    System.out.println("la tercera posicion es " +listado.get(3));

    listado.set(1, "queso");

    System.out.println("la lista contiene pan?" +listado.contains("pan"));
    System.out.println("introduce el alimento");
    String alimento = sc.next();
    if (listado.contains(alimento)){
        System.out.print("lo siento no se puede añadir ");
    }else {
        System.out.println("elemento añadido con exito");
        listado.add(alimento);
    }
        int contador =0;
        for (int i =0; i< listado.size(); i++){
            contador++;
        }


        System.out.println(contador);

        listado.clone();
        ArrayList<String> copia_lista = new ArrayList<>(listado);

        boolean sonIguales = listado.equals(copia_lista);

        copia_lista.add("tomates");
        copia_lista.add("patatas");

        ArrayList<String>faltantes = new ArrayList<>(listado);
        faltantes.removeAll(copia_lista);


        Random aleatorio = new Random();
        for (int i =0; i< listado.size(); i++){

        }

        listado.clear();






    }




}
