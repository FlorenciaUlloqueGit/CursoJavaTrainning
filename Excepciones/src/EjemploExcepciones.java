import jdk.jshell.spi.ExecutionControl;
import javax.swing.JOptionPane;

public class EjemploExcepciones {
    public static void main(String[] args){


        Calculadora calc = new Calculadora();
        String denominador = JOptionPane.showInputDialog("Ingrese un entero numerador");
        String numerador = JOptionPane.showInputDialog("Ingrese un entero denominador");

        int divisor ;
        double division;

        try{
          //  divisor=Integer.parseInt(valor);
           // division = calc.dividir(10,divisor);
           // System.out.println(division);


            double division2 = calc.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);

        } catch (NumberFormatException nfe){
            System.out.println("se detecto una excepción, por favor ingrese un valor numérico " + nfe.getMessage());

            main(args); //vuelve al maim

        }
        catch (DivisionPorCeroException e ){
            System.out.println("Capturamos  la excepcion en tiempo de ejecución:  "+ e.getMessage());
            main(args); //vuelve al main
        } catch (FormatoNumeroExcepcion f) {
            System.out.println("Se detectó una excepción, ingrese un número válido "+ f.getMessage());
            f.printStackTrace(System.out); //imprime la salida que es en el terminal
        } finally {
            System.out.println("es opcional pero se ejecuta siempre");
        }

        System.out.println("continuamos con la ejecución");

    }
}
