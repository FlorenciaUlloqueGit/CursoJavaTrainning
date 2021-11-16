import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ejemploParseStringADate {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Scanner s = new Scanner(System.in);

        System.out.println("ingrese una fecha con formato yyyy-MM-dd  ");

        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));
            Date fecha2 = new Date();
            if(fecha.after(fecha2)){
                System.out.println("la fecha que ingresó es posterior a la fecha actual");
            } else if(fecha.before(fecha2)){
                System.out.println("fecha es anterior a la fecha actual");
            }else {
                System.out.println("la fechas coinciden");
            }

        //OTRA FORMA DE REALIZAR LO MISMO Y COMPARAR FECHAS!!

            if(fecha.compareTo(fecha2)>0){
                System.out.println("la fecha que ingresó es posterior a la fecha actual");
            }
            else if(fecha.compareTo(fecha2)<0){ //si el valor da en un entero negativo (menor)
                System.out.println("fecha es anterior a la fecha actual");
            }else if(fecha.compareTo(fecha) ==0){
                System.out.println("Ambas fechas son iguales");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
