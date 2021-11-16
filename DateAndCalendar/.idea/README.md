
# Date and Calendar

#imports;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
#Formatos de date:

SimpleDateFormat df = new SimpleDateFormat("dd/MMM/yyyy"); //creamos el patron de fecha.
// Mes va en MM porque mes es en mayuscula y minutos en minúscula.
//buscar en google date and  time patterns para ver != formatos.


#tips:
- La clase calendar no se puede instanciar al ser abstracta : Calendar calendar  = Calendar.getInstance();
- Dia del mes: dd.
- dia del año (dentro de los 365 ) = DD (mayuscula).
- caracter **a** al final del formato de hora: agrega si es am o pm
- calendario.set(Calendar.HOUR_OF_DAY, 14); // establece la hora del dia en formato 24 hs.
- calendario.set(Calendar.HOUR, 10);  
    calendario.set((Calendar.AM_PM, Calendar.AM));  //especificó aca que es am.
 Establece el horario del día en 2 hs entre am y pm. 
- Formatos: HH = 24 hs  y hh =12 hs.
- 