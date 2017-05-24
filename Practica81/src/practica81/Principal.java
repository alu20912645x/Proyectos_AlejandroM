package practica81;

/**
 * Área y volumen de la esfera.
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {

    /** 
     * Llama a otra clase del programa y devuelve los resultados.
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Esfera e=new Esfera();
        float radio;
        radio=e.PreguntaRadio();
        e.SetRadio(radio);
        e.SetÁrea();
        e.SetVolumen();
        System.out.println("Área de la esfera: " +e.GetÁrea());
        System.out.println("Volumen de la esfera: " +e.GetVolumen());
    }
    
}
