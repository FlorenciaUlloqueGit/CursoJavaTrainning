package Tarea1;

import jdk.jshell.PersistentSnippet;

public class Tarea1 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("juan", "perez", "5002", "la palpa 2020", 20000.00, 1, 2500);
        Empleado empleado = new Empleado("lucia", "velazquez", "122a" , "la rioja 2020", 18000, 2);
        Cliente cliente = new Cliente("oscar", "Mainero", "455", "isabel la catolica 111", 3);

        ImprimirPersonas(gerente);
        ImprimirPersonas(empleado);
        ImprimirPersonas(cliente);

        System.out.println("=================================");

        System.out.println("AUMENTO DE SUELDO ");
        empleado.aumentarRemuneracion(25);
        System.out.println(empleado.toString());



    }
    public static void ImprimirPersonas(Persona persona){
        System.out.println("=================================");

        System.out.println(persona.toString());
    }
}
