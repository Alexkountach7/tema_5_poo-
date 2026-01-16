package org.example;

public class televisor {

    private static final int DEF_CANAL = 1;
    private static final int DEF_VOLUMEN = 5;
    private static final int MAX_CANAL = 100;
    private static final int MAX_VOLUMEN = 100;

    private int canal;
    private int volumen;

    public televisor() {
        canal = DEF_CANAL;
        volumen = DEF_VOLUMEN;
    }

    public void subirVolumen() {
        if (volumen < MAX_VOLUMEN) {
            volumen++;
        }
    }

    public void bajarVolumen() {
        if (volumen > 0) {
            volumen--;
        }
    }

    public void subirCanal() {
        if (canal == MAX_CANAL) {
            canal = 1;
        } else {
            canal++;
        }
    }

    public void bajarCanal() {
        if (canal == 1) {
            canal = MAX_CANAL;
        } else {
            canal--;
        }
    }

    public void mostrarInfo() {
        System.out.println("Canal actual: " + canal);
        System.out.println("Volumen actual: " + volumen);
    }
}
