package prac89;

/**
 * Crea una clase "Fecha" con el fin de comprobar si la fecha que se le pasa es correcta. También 
 * obtiene la fecha actual del sistema.
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {

    /**
     * Llama a métodos de la clase "Fecha" para sacar la fecha actual y para comprobar la fecha pasada. Después,
     * imprime los resultados.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha factual=new Fecha();
        System.out.println("Fecha de hoy: " +factual.FechaActual());
        
        Fecha fpers=new Fecha(29,2,1404);
        boolean bisiesto=fpers.Bisiesto();
        boolean correcta=fpers.FechaCorrecta(bisiesto);
        if (correcta){System.out.println("La fecha "
                +fpers.getDía()+"/"+fpers.getMes()+"/"+fpers.getAño()+ " es correcta.");}
        else {System.out.println("La fecha "
                +fpers.getDía()+"/"+fpers.getMes()+"/"+fpers.getAño()+ " es incorrecta.");}
    }
    
}
