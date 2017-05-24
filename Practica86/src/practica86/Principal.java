package practica86;
/**
 * Conversor de pies a otras unidades de longitud.
 * Convierte pies a yardas, pulgadas y centímetros.
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {

    /** 
     * Llama a otra clase del programa y devuelve los resultados.
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Conversor c=new Conversor();
        float pies=c.PidePies();
        c.SetPies(pies);
        c.SetYardas();
        c.SetPulgadas();
        c.SetCentímetros();
        System.out.println(pies+ " pies equivalen a " +c.GetYardas()+ " yardas, " +c.GetCentímetros()+
                " centímetros y " +c.GetPulgadas()+ " pulgadas.");

        
    }
    
}
