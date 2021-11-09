import java.util.Locale;

public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola mundo con Java";
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase()); //tiene diferentes métodos por que es una clase String.
        //pasa lo mismo con Integer.
        System.out.println(saludar);

        int numero = 10;
        System.out.println("numero = " + numero);
        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("numero2 = " + numero2);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);
        var num3 = "15"; var num4 = 15;

    
        String nombre;
        nombre = "Andrés";
        
        if(numero > 10){
            nombre = "Juan";
        }

        System.out.println("nombre = " + nombre);


    }

}
