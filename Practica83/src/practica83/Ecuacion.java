package practica83;

import java.util.Scanner;

/**
 * Clase que pide la "a", "b" y "c" para calcular los dos posibles valores de equis(x).
 */
public class Ecuacion {
    /**
     * @param x Primera solución a la ecuación.
     * @param y Segunda solución a la ecuación.
     * @param a Coeficiente cuadrático.
     * @param b Coeficiente lineal.
     * @param c Término independiente.
     */
    private int a,b,c;
    private float x,y; 
    
    /**
     * @return Devuelve "a", que se ha preguntado, a la clase principal.
     */
     public int PreguntaA() {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el valor de a: ");
        return teclado.nextInt();
     }
     /**
     * @return Devuelve "b", que se ha preguntado, a la clase principal.
     */
     public int PreguntaB() {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el valor de b: ");
        return teclado.nextInt();
     }
     /**
     * @return Devuelve "c".
     */
     public int PreguntaC() {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el valor de c: ");
        return teclado.nextInt();
     }
     /**
     * @param a Importado de "Principal".
     */
     public void SetA(int a){
        this.a=a;
     }
     /**
     * @param b Importado de "Principal".
     */
     public void SetB(int b){
        this.b=b;
     }
     /**
     * @param c Importado de "Principal".
     */
     public void SetC(int c){
        this.c=c;
     }
     
     /**
      * Asigna el primer resultado de la ecuación, o sea, equis sub uno.
      */
     public void SetSuma(){
     x=(float) ((-b+Math.sqrt(b*b-4*a*c))/(2*a));         
     }
     /**
      * Asigna el segundo resultado de la ecuación, o sea, equis sub dos.
      */
     public void SetResta(){
     y=(float) ((-b-Math.sqrt(b*b-4*a*c))/(2*a));         
     }
     
     /**
      * @return Devuelve la primera posible solución.
      */
     public float GetSuma(){
         return x;
     }
     /**
      * @return Devuelve la segunda posible solución.
      */
     public float GetResta(){
         return y;
     }
}
