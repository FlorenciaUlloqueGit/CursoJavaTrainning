package Tarea;

public class Tarea {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new  Mamifero[2];

        Leon leon = new Leon("macedonia", 1.2f, 0.67f, 80, "leonCientifico", 2, 15, 2, 6);
        Perro perro = new Perro("Argentina", 50, 0.24f, 30, "perrinulo", "marron", 2, 2   );



       mamiferos[0] = leon;
       mamiferos[1] = perro;

        for (int i = 0; i < mamiferos.length ; i++) {
            System.out.println("Habitat " +  mamiferos[i].getHabitat());
            System.out.println("Altura " +  mamiferos[i].getAltura());
            System.out.println("Largo " + mamiferos[i].getLargo());
            System.out.println("Peso " +  mamiferos[i].getPeso());
            System.out.println("nombre científico" +  mamiferos[i].getNombreCientifico());

            if(mamiferos[i] instanceof Caninos){
                System.out.println("color " + ((Caninos) mamiferos[i]).getColor());
                System.out.println("Tamaño colmillos " +  ((Caninos) mamiferos[i]).getTamColmillos());
                if(mamiferos[i] instanceof Perro){
                    System.out.println("Fuerza mordida " +  ((Perro) mamiferos[i]).getFuerzaMordida());
                    System.out.println( mamiferos[i].correr());
                    System.out.println( mamiferos[i].comer());
                    System.out.println( mamiferos[i].comunicarse());
                    System.out.println( mamiferos[i].dormir());
                    System.out.println("============================");

                }
                if( mamiferos[i] instanceof Lobo){
                    System.out.println("Especie " +  ((Lobo) mamiferos[i]).getEspecie());
                    System.out.println("numero de camada " +  ((Lobo) mamiferos[i]).getNumCamada());
                    System.out.println( mamiferos[i].correr());
                    System.out.println( mamiferos[i].comer());
                    System.out.println( mamiferos[i].comunicarse());
                    System.out.println( mamiferos[i].dormir());
                    System.out.println("============================");
                }
            }
             if( mamiferos[i] instanceof Felino){
                System.out.println("Tamaño garra" +  ((Felino) mamiferos[i]).getTamGarrras());
                System.out.println("Velocidad" +  ((Felino) mamiferos[i]).getVelocidad());

                if( mamiferos[i] instanceof Tigre){
                    System.out.println("Especie" +  ((Tigre) mamiferos[i]).getEspecie());
                    System.out.println( mamiferos[i].correr());
                    System.out.println( mamiferos[i].comer());
                    System.out.println( mamiferos[i].comunicarse());
                    System.out.println( mamiferos[i].dormir());
                    System.out.println("============================");
                }
                if( mamiferos[i] instanceof Leon){
                    System.out.println("Manada " +  ((Leon) mamiferos[i]).getManada());
                    System.out.println("rugido" +  ((Leon) mamiferos[i]).getPotenciaRugido());
                    System.out.println( mamiferos[i].correr());
                    System.out.println( mamiferos[i].comer());
                    System.out.println( mamiferos[i].comunicarse());
                    System.out.println( mamiferos[i].dormir());
                    System.out.println("============================");
                }

            }

        }


    }
}
