package prac91;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Clase en la que obtiene la fecha del sistema.
 */
public class Fecha {

    public Fecha() {
    }
    
    /**
     * Saca la fecha actual con un formato concreto, llamando otras clases importadas.
     * @return Devuelve la fecha actual.
     */
    public String FechaActual() {
        Date fecha=new Date();
        SimpleDateFormat FormatoFecha=new SimpleDateFormat("dd/MM/YYYY");
        return FormatoFecha.format(fecha);
    }
}
