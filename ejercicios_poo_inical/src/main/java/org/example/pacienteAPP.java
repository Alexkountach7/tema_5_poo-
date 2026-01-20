package org.example;

public class pacienteAPP {
    static void main() {


        paciente paciente1 = new paciente("alex",20,'H',60,170);
        paciente paciente2 = new paciente("jose",30,'H',120,150);
        paciente paciente3 = new paciente("fer",30,'H',0,0);
        paciente3.mostrarInformacionPaciente();

        paciente paciente4 = new paciente() ;
        paciente4.setAltura(150);
        paciente4.setPeso(60);
        paciente4.setSexo('H');
        paciente4.setNombre("alex");
        paciente4.setPeso(80);
        paciente4.mostrarInformacionPaciente();


        System.out.println(paciente1.calcularIMC());
        System.out.println(paciente2.calcularIMC());




    }
}