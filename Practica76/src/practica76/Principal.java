package practica76;

/**
 * Calculadora sencilla: Sumas, restas, multiplicaciones y divisiones de dos números.
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {

    /**
     * Diseña la forma del programa, llama a otras clases del programa que son el meollo del mismo y devuelve los resultados.
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
    int aux, num1, num2;
    /*Todo objeto se crea obligatoriamente con el operador "new" acompañado de la llamada al
    constructor que corresponda.*/
    Calculadora c = new Calculadora();
    Menu m=new Menu();
    do {
        m.ImprimeMenú();
        aux=m.PideOpción();
        switch (aux)
            {
            case 1:
                num1=c.PreguntaNúmero1();
                num2=c.PreguntaNúmero2();
                //Métodos de asignaciones y el cálculo:
                c.SetNúmero1(num1);
                c.SetNúmero2(num2);
                c.SetSuma();
                //No es necesaria una variable para obtener el resultado:
                System.out.println("Resultado de la suma: " +c.GetResultado());
                break;
            case 2: 
                num1=c.PreguntaNúmero1();
                num2=c.PreguntaNúmero2();
                c.SetNúmero1(num1);
                c.SetNúmero2(num2);
                c.SetResta();
                System.out.println("Resultado de la resta: " +c.GetResultado());
                break;
            case 3: 
                num1=c.PreguntaNúmero1();
                num2=c.PreguntaNúmero2();
                c.SetNúmero1(num1);
                c.SetNúmero2(num2);
                c.SetMultiplicación();
                System.out.println("Resultado de la multiplicación: " +c.GetResultado());
                break;
            case 4: 
                num1=c.PreguntaNúmero1();
                num2=c.PreguntaNúmero2();
                c.SetNúmero1(num1);
                c.SetNúmero2(num2);
                c.SetDivisión();
                System.out.println("Resultado de la división: " +c.GetResultado());
                break;
            default:
                break;
           }
        } while (aux!=5);
    
    System.out.println("Saliendo de la calculadora...");
        
    
    }
}
