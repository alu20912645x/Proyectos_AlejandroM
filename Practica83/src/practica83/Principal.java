package practica83;

/**
 * Ecuación de segundo grado.
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
        Ecuacion e=new Ecuacion();
        int a,b,c;
        a=e.PreguntaA();
        b=e.PreguntaB();
        c=e.PreguntaC();
        e.SetA(a);
        e.SetB(b);
        e.SetC(c);
        e.SetSuma(); //Primer resultado de la ecuación.
        e.SetResta(); //Segundo resultado de la ecuación.
        System.out.println("Posibles soluciones: "); //Los valores de 'x' pueden tener decimales.
        System.out.println("x1=" +e.GetSuma());
        System.out.println("x2=" +e.GetResta());

    }
    
}
