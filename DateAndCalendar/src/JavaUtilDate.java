import java.text.SimpleDateFormat;
import java.util.Date;
public class JavaUtilDate {
    public static void main(String[] args) {

        Date  fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd/MMM/yyyy"); //creamos el patron de fecha.
        // Mes va en MM porque mes es en mayuscula y minutos en minúscula.
        //buscar en google date and  time patterns para ver != formatos.
        String fechaString = df.format(fecha); //recibe al objeto date que es fecha para mostrarlo con un formato de dia/mes/año
        System.out.println("fechaString = " + fechaString);

        long j = 0;

        for (int i = 0; i <1000000 ; i++) {

            j += i;
        }
        System.out.println("j = " + j);
        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime()  - fecha.getTime(); //retorna la cant de milisegundos desde enero de 1970

        System.out.println("tiempo transcurrido en el for = " + tiempoFinal);
        System.out.println("fechaString = " + fechaString);


    }
}
