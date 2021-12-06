package Generics;

import java.security.spec.RSAOtherPrimeInfo;

public class EjemploGenericos2 {
    public static void main(String[] args) {
        Camion<Animal> transporteCaballos = new Camion<>(5);

        transporteCaballos.agregarObjeto(new Animal("peregrino", "caballo"));
        transporteCaballos.agregarObjeto(new Animal("Lolo", "caballo"));
        transporteCaballos.agregarObjeto(new Animal("Acansti", "caballo"));
        transporteCaballos.agregarObjeto(new Animal("Rodrigo", "caballo"));
        transporteCaballos.agregarObjeto(new Animal("grillo", "caballo"));


        System.out.println();

        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.agregarObjeto(new Maquinaria("bulldozer"));
        transMaquinas.agregarObjeto(new Maquinaria("grua horquilla"));
        transMaquinas.agregarObjeto(new Maquinaria("perforadora"));


        System.out.println();

        Camion <Automovil> transAuto = new Camion<>(3);
        transAuto.agregarObjeto(new Automovil("toyota"));
        transAuto.agregarObjeto(new Automovil("Fiat"));
        transAuto.agregarObjeto(new Automovil("Chevrolet"));


        imprimirCamion(transporteCaballos);
        imprimirCamion(transAuto);
        imprimirCamion(transMaquinas);


    }
    public static <T>void imprimirCamion(Camion<T> camion){

        for ( T a : camion){
            if (a instanceof Animal){
                System.out.println(((Animal) a).getNombre() + " :" + ((Animal) a).getTipo());
                System.out.println();
            }
            if(a instanceof Maquinaria){
                System.out.println(((Maquinaria) a).getTipo());
                System.out.println();

            }
            if (a instanceof  Automovil){
                System.out.println(((Automovil) a).getMarca());
            }

        }
    }
}
