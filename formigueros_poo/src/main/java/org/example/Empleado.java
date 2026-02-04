package org.example;

public class Empleado {
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;
    int contador_empleados =0;
    public Empleado(String nombre, String cargo, Empleado director) {
        this.id = validarid();
        this.nombre = nombre;
        contador_empleados++;
        this.cargo = validar_cargo(cargo);
        this.director = director;
    }


    public String validarid () {
        if (contador_empleados<10){
            return "EP00" +contador_empleados;
        } else if (contador_empleados<100){
            return "EP0" + contador_empleados;
        }else {
            return "EP"+contador_empleados;
        }
    }

    public String validar_cargo (String cargo) {
        if (cargo.equalsIgnoreCase("director")||
        cargo.equalsIgnoreCase("tecnico") ||
        cargo.equalsIgnoreCase("presentador") ||
        cargo.equalsIgnoreCase("colaborador")){
            return cargo;
        }else {
            return "pte";
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Empleado getDirector() {
        return director;
    }

    public String getCargo() {
        return cargo;
    }

    public String getId() {
        return id;
    }
    
}
