import javax.swing.*;




public class SistemasNumericos
{
    public static void main(String[] args) {

        //int numeroDecimal = 500; //el sistema decimal, que tiene 10 numeros y van del 1 al 9int num = ;

       String numeroSTRING = JOptionPane.showInputDialog(null, "ingrese un número entero"); //es una clase con mpétodo estatico, no hace falta instanciarla
        int numeroDecimal = 0;
        try {   //para el manejo de errores
        numeroDecimal = Integer.parseInt(numeroSTRING);

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "debe ingresar un número entero");
            main(args); //para volver a ejecutar lo mismo, se llama al metodo main con sus argumentos.
           // return; //retorna void para salir o sino ...
            System.exit(0); //cero es que no hay problemas
        }

        //vamos a pasar del sistema decimal a otro sistema (octal, binario, hexadecimal)
        System.out.println("El número ingresado fue = " + numeroDecimal);

        String mensajeBinario = "\n numero binario de " + numeroDecimal + " es = "  + Integer.toBinaryString(numeroDecimal); //convierte al decimal en un tipo String pero pasandolo a binario.
        int numeroBinario = 0b111110100; //0b para que el compilador entienda que es binario
        System.out.println("numeroBinario = " + numeroBinario); // lo convierte en consola al sistema decimal.

        String mensajeOctal = " \n numero octal de " + numeroDecimal + " es = " +Integer.toOctalString(numeroDecimal);
       int numeroOctal = 0764; //para que el compilador sepa que es octal tenemos que anteponerle al número un 0.
        System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHexa =  " \n numero hexadecimal de " + numeroDecimal + " es = " + Integer.toHexString(numeroDecimal) ;
        System.out.println("Numero hexadecimal de" + numeroDecimal + " = " + Integer.toHexString(numeroDecimal) );
       int numeroHexaDecimal = 0x1f4;// antepongo 0x para definir al numero como hexadecimal.
        System.out.println("numeroHexaDecimal = " + numeroHexaDecimal);

        String mensaje = mensajeBinario + mensajeOctal + mensajeHexa;
        JOptionPane.showMessageDialog(null, mensaje );
    }
}
