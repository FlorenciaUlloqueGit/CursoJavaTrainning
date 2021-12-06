package Imprenta.Modelo;

public interface Imprimible {
     default String imprimir(){// al ser default las demas clases no estan obligadas a implementar este método
          return TEXTO_DEFECTO;
     }
     //default se usa cuando el método es opcional y no requerido por todas las coases



     //hacemos método estático


     public static  void  imprimir(Imprimible imprimible){
          System.out.println(imprimible.imprimir());
     }

     //hacemos un método estatico
     final static String TEXTO_DEFECTO = "Imprimiendo valor por defecto";

}
