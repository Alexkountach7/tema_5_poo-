package chalet_poo;

public class chaletAPP {
    static void main() {
        casa pisito = new casa("calle falsa 123");
        pisito.crearhabitacion("cocina",12.5);


        pisito.crearhabitacion("despacho", 5);
        pisito.borrarhabitacion("despacho");
        pisito.mostrarhabitacion();
        System.out.println("la habitacion mas grande es "+pisito.gethabitacionmasgrande().getNombre());
    }
}
