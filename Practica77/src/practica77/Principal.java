package practica77;

/**
 * Área y longitud de una circunferencia.
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {

    /** 
     * Llama a otra clase del programa y devuelve los resultados.
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        Circunferencia c=new Circunferencia();
        float radio=c.PreguntaRadio();
        c.SetRadio(radio);
        c.SetLogitud();
        c.SetÁrea();
        System.out.println("Longitud de la circunferencia: " +c.GetLongitud());
        System.out.println("Área de la circunferencia: " +c.GetÁrea());
    }
}
