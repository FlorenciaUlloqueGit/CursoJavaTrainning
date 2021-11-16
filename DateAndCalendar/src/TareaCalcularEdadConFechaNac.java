import com.sun.security.jgss.GSSUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TareaCalcularEdadConFechaNac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ingrese su fecha de nacimiento con el siguiente formato: 'dd/mm/yyyy'");

        String fecha = scanner.next();
        Date FechaActual = new Date();


        try {
          Date fechaNac = format.parse(fecha);
            int cant = FechaActual.getYear() -fechaNac.getYear();

           int meses ;
           if (fechaNac.getMonth() >  FechaActual.getMonth()) {
               cant = cant - 1;
           }
           if (fechaNac.getDate() > FechaActual.getDate() && fechaNac.getMonth() == FechaActual.getMonth() && fechaNac.getYear() == fechaNac.getYear()){
               cant = cant-1;
           }

            System.out.println("La cantidad de años es :" + cant);


        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    }


/*
Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.

Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos mas adelante, también se pueden apoyar de google que hay varios ejemplos.

Preguntas de esta tarea
Cuál es el código de tu solución, publicala acá mismo
 */