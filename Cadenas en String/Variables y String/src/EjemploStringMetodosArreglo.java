public class EjemploStringMetodosArreglo
{
    public static void main(String[] args) {

        String trabaLengua = "trabaLenguas";

        System.out.println("trabaLengua.toCharArray() = " + trabaLengua.toCharArray());
        //se implementa en un for para msotrar cada caracter del String. Es un arreglo de elementos del tipo char.
    
        char[] arreglo = trabaLengua.toCharArray(); //retorna un arreglo del tipo char. 
        int largoArreglo = arreglo.length;//lenght aca no es un metodo sino un atributo del arreglo, por eso no lleva ().

        System.out.println("largoArreglo = " + largoArreglo);
        for (int i = 0; i < largoArreglo; i++) {
            System.out.println("arreglo[i] = " + arreglo[i]); //println salta de linea pero print solo no.

            
        }

        System.out.println("trabaLengua = " + trabaLengua.split("a")); //divide el string segun un patron . en este caso
        //el patron es la a, cada vez que hay una a la borra y hace un salto de línea

        String[] arreglo2 = trabaLengua.split("a");
        int l =arreglo2.length;
        for (int i = 0; i < l; i++) {
            System.out.println(arreglo2[i]);

        }
        String archivo = "alguna.imagen.pdf";
        String [] archivoAr = archivo.split("\\."); // se usa \\para que tome el punto porque es una expresion regular.
        // se usa cuando son palabras claves o se tiene que agrupar un grupo de caracteres. Tambien puedo usar[.]
        int larg = archivoAr.length;
        for (int i = 0; i < larg; i++) {
            System.out.println(archivoAr[i]);
        }
        System.out.println("Extensión = " + archivoAr[larg -1]); //toma cualquier extensión de archivo.
                


    }
}
