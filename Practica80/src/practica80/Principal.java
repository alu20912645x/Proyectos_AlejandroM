package practica80;

/**
 * Área del cubo.
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {

    /** 
     * Llama a otra clase del programa y devuelve el resultado.
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Cubo c=new Cubo();
        float arista;
        arista=c.PreguntaArista();
        c.SetLado(arista);
        c.SetÁrea();
        System.out.println("Área del cubo cuyas aristas son de " +arista+ ": " +c.GetÁrea());
    }
    
}
