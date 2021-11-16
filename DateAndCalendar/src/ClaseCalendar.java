import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClaseCalendar {
    public static void main(String[] args) {
        Calendar calendario  = Calendar.getInstance(); //no se puede instanciar con new porque es una clase abstracta.

        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendario.set(Calendar.DAY_OF_MONTH, 10);
        //calendario.set(Calendar.HOUR_OF_DAY, 14);
        calendario.set(Calendar.HOUR, 10);
        calendario.set(Calendar.AM_PM,  Calendar.PM); //configuro am
        calendario.set(Calendar.MINUTE, 10);
        calendario.set(Calendar.SECOND,01);
        calendario.set(Calendar.MILLISECOND ,122);
       // calendario.set(2020,Calendar.AUGUST,11, 22, 24, 00 ); //los meses van del 0 al 11
        Date fecha = calendario.getTime();

        System.out.println("Fecha sin formato = " + fecha);
        SimpleDateFormat formato = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss:SSSS a"); //dia,mes,año hora, min, segundos milisegundos.
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);




    }
}
