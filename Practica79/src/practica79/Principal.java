package practica79;

/**
 * Área del pentágono.
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {

    /**
     * Llama a otra clase del programa y devuelve el resultado.
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        Pentagono p=new Pentagono();
        float lado=p.PreguntaLado();
        float apot=p.PreguntaApotema();
        p.SetApotema(apot);
        p.SetLado(lado);
        p.SetÁrea();
        System.out.println("Área del pentágono regular: " +p.GetÁrea());
    }
    
}
