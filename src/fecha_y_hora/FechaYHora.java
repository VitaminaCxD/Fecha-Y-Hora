package fecha_y_hora;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @author VitaminaC
 * @since 19/1/2022
 */
public class FechaYHora {

    //Formato de la fecha
    private final String FORMATO_FECHA = "dd/MM/yyyy ";
    
    //Formato de la hora
    private final String FORMATO_HORA = "[hh:mm:a]";
    
    SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA + FORMATO_HORA);;
    
    TimeZone timeZone = TimeZone.getDefault();
    Locale locale = Locale.getDefault();
    Calendar calendario;
    
    public String obtenerFechaYHora() {
        calendario = Calendar.getInstance(timeZone, locale);
        return sdf.format(calendario.getTime());
    }

}
