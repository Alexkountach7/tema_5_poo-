package chalet_poo;

public class Electrodomestico {
    private String nombre;
    private int consumo;

    public Electrodomestico(String nombre, int consumo) {
        this.nombre = nombre;
        this.consumo = consumo;

    }


    public String getNombre() {
        return nombre;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    @Override
    public String toString () {
        return "nombre "+nombre +
                "consumo "+consumo;
    }
}
