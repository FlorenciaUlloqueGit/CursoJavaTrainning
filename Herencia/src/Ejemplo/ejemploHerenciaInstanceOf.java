package Ejemplo;

import Flor.Herencia.Alumno;
import Flor.Herencia.AlumnoInternacional;
import Flor.Herencia.Persona;
import Flor.Herencia.Profesor;

public class ejemploHerenciaInstanceOf {
    public static void main(String[] args) {
        Persona alumno = new Alumno("mateo", "gomez", 35, "san salvador", 5, 7, 9);


        ((Alumno) alumno).setNotaHist(5);
        ((Alumno) alumno).setNotaLengua(8);
        ((Alumno) alumno).setNotaMate(9);

        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "parker", "EEUU", 8);

        alumnoInt.setInstitucion("hardvard");
        alumnoInt.setNotaLengua(6.5);
        alumnoInt.setNotaHist(5.8);
        alumnoInt.setNotaMate(7);

        Profesor profesor = new Profesor("Gino", "Botta", "Matematica");


        // System.out.println(alumno.getNombre() + " " + alumno.getApellido() + "  colegio :" + ((Alumno) alumno).getInstitucion());

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona p) {
        System.out.println(p.getNombre()
                + " " + p.getApellido()
                + " " + p.getEdad()
                + " " + p.getEmail());

        System.out.println("Imprimiendo los datos del tipo alumno ");
        if (p instanceof Alumno) {

            System.out.println(((Alumno) p).getInstitucion());
            System.out.println(((Alumno) p).getNotaMate());
            System.out.println(((Alumno) p).getNotaHist());
            System.out.println(((Alumno) p).getNotaLengua());

            System.out.println("Imprimiendo los datos del tipo alumno internaciomal");
        } else if (p instanceof AlumnoInternacional) {
            System.out.println(((AlumnoInternacional) p).getPais());
            System.out.println(((AlumnoInternacional) p).getNotaIdiomas());

        }


        if (p instanceof Profesor) {
            System.out.println("imprimiendo los datos del profesor ");
            System.out.println(((Profesor) p).getAsignatura());



        }
    }
}


