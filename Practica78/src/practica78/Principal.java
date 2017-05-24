package practica78;

/**
 * Área del triángulo.
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {

    /**
     * Llama a otra clase del programa y devuelve el resultado.
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        Triangulo t=new Triangulo(18.3F,9.75F); /*En lugar de preguntar la base y la altura, las insertamos en
        el constructor para inicializarlas en la clase.*/
        t.SetÁrea();
        System.out.println("Área del triángulo: " +t.GetÁrea());
    }
    
}
