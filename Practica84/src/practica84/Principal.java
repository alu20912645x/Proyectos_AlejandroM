package practica84;

/**
 * Teorema de Pitágoras.
 * Pide una cantidad de dinero en euros y realiza un desglose mínimo en billetes y monedas.
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {

    /** 
     * Llama a otra clase del programa y devuelve el resultado.
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Pitagoras p=new Pitagoras();
        
        float c1=p.PideCateto1();
        float c2=p.PideCateto2();
        
        p.SetCateto1(c1);
        p.SetCateto2(c2);
        
        p.SetHipotenusa();
        
        System.out.println("Lados del triángulo rectángulo: ");
        System.out.println("Cateto 1: " +c1);
        System.out.println("Cateto 2: " +c2);
        System.out.println("\033[0;35m"+"Hipotenusa: " +p.GetHipotenusa());


    }
    
}
