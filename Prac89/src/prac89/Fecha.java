package prac89;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Clase en la que obtiene la fecha del sistema y comprueba además que la fecha pasada por parámetro es correcta.
 */
public class Fecha {
private int día, mes, año;

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
    
    
    /**
     * Constructor con parámetros.
     * @param día Primer parámetro, correspondiente al día.
     * @param mes Segundo parámetro, correspondiente al mes.
     * @param año Tercer parámetro, correspondiente al año.
     */
    public Fecha(int día, int mes, int año){
        this.día=día;
        this.mes=mes;
        this.año=año;
    }
    
    /**
     * Comprueba que el año sea bisiesto. Dependiendo de si es divisible por unos números y no por otros, lo será o no.
     * @return Devuelve "true" si ha comprobado que es bisiesto; "false" si no lo es.
     */
    public boolean Bisiesto(){
        boolean bisiesto;    
        if (año%4!=0) {bisiesto=false;}
        else
            {
            if (año%100!=0) {bisiesto=true;}
            else
                {
                if (año%400!=0){bisiesto=false;}
                else {bisiesto=true;}
                }
            }
        return bisiesto;
    }

    /**
     * Comprueba que la fecha que fue pasada es válida.
     * @param bisiesto Condiciona la validación de la fecha si el mes es febrero y el día es veintinueve.
     * @return Devuelve "true" si ha comprobado que la fecha es válida; "false" si es incorrecta.
     */
    public boolean FechaCorrecta(boolean bisiesto) {
        boolean fcorrecta;
        if (mes<=0 || mes>=13 || día<=0 || día>=32) {fcorrecta=false;}
        else
            {
            if (día==31 && (mes==2 || mes==4 || mes==6 || mes==9 || mes==11)) {fcorrecta=false;}
            else
                {
                if (día==30 && mes==2) {fcorrecta=false;}
                else
                    {
                    if (día==29 && mes==2 && !bisiesto){fcorrecta=false;}
                    else {fcorrecta=true;}
                    }
                }
            }
        
        return fcorrecta;
    }
    
    /**
     * @return Devuelve el día de la fecha que fue pasada por parámetros.
     */
    public byte getDía(){
        return (byte) día;
    }
    /**
     * @return Devuelve el mes.
     */
    public byte getMes(){
        return (byte) mes;
    }
    /**
     * @return Devuelve el año.
     */
    public short getAño(){
        return (short) año;
    }
    
}
