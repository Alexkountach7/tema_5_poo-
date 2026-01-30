package chalet_poo;

public class propietario {
    private String nombre;
    private int edad;

    public propietario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;


    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
