package practica82;

/**
 * Desglose de dinero.
 * Pide una cantidad de dinero en euros y realiza un desglose mínimo en billetes y monedas.
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {

    /** 
     * Llama a otra clase del programa y devuelve los resultados.
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Monedas m=new Monedas();
        
        int dinero=m.PreguntaDinero();
        m.SetDinero_Inicial(dinero);
        m.Desglosar();
        m.GetSolución();
    }
    
}
