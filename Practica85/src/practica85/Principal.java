package practica85;

/**
 * Desglose de segundos.
 * A partir de una cantidad de segundos, realiza un despliegue mínimo de semanas, días, horas,
   minutos y segundos.
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {

    /** 
     * Llama a otra clase del programa y devuelve los resultados.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**/
        Segundos s=new Segundos();
        int seg=s.PideSegundos();
        
        s.SetSeg_ini(seg);
        s.SetSemanas();
        s.SetDías();
        s.SetHoras();
        s.SetMinutos();
        s.SetSegundos();
        System.out.println(seg+ " segundos equivalen a " +s.GetSemanas()+ " semanas, " +s.GetDías()+ " días, "
        +s.GetHoras()+ " horas, " +s.GetMinutos()+ " minutos y " +s.GetSegundos()+ " segundos.");
        
    }
    
}
