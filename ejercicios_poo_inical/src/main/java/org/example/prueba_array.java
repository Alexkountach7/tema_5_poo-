package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class prueba_array {
    static void main() {
        ArrayList<String> listapartesdecoches = new ArrayList<>();
        System.out.println("elementos inseertados" +listapartesdecoches.size());

        listapartesdecoches.add("puertas");
        listapartesdecoches.add("polea");
        listapartesdecoches.add("piston");
        listapartesdecoches.add("alternador");

        listapartesdecoches.add(3, "tubo de escape");

        System.out.println(listapartesdecoches);

        listapartesdecoches.remove("puertas");
        listapartesdecoches.remove(1);

        System.out.println("posicion de alternador en la lista" + listapartesdecoches.indexOf("alternador"));

        System.out.println(listapartesdecoches);

        for (String parte : listapartesdecoches){
            System.out.println("parte" +parte);
        }
        for (int i =0; i<listapartesdecoches.size(); i++){
            System.out.println("parte" +(i+1)+ ":" +listapartesdecoches.get(i));
        }

        listapartesdecoches.set(0, "carter");
        System.out.println(listapartesdecoches);

        listapartesdecoches.clone();

        ArrayList<String> copia = new ArrayList<>(listapartesdecoches);


        System.out.println("la lista tiene puerta "+listapartesdecoches.contains("puertas"));

        listapartesdecoches.addAll(Arrays.asList("rueda","freno","radiador"));

        System.out.println(listapartesdecoches);

        listapartesdecoches.clear();

        System.out.println("esta vacia?" +listapartesdecoches.isEmpty());





    }
}
