package practica84;

import java.util.Scanner;
/**
 * Calcula el valor de la hipotenusa en un triángulo rectángulo mediante el
 * teorema de Pitágoras, pidiendo los catetos.
 */

public class Pitagoras {
    /**
     * @param c1 Cateto 1.
     * @param c2 Cateto 2.
     * @param hip Hipotenusa.
     */
    private float c1, c2;
    private float hip;
    
    /**
     * @return Devuelve el primer cateto que ha pedido. 
     */
    public float PideCateto1() {
    Scanner teclado=new Scanner(System.in);
    System.out.print("Introduce el valor del primer cateto: ");
    return teclado.nextFloat();
    }
    /**
     * @return Devuelve el segundo cateto que ha pedido. 
     */
    public float PideCateto2() {
    Scanner teclado=new Scanner(System.in);
    System.out.print("Introduce el valor del segundo cateto: ");
    return teclado.nextFloat();
    }
    /**
     * @param c1 Importado de "Principal".
     */
    public void SetCateto1(float c1){
        this.c1=c1;
    }
    /**
     * @param c2 Importado de "Principal".
     */
    public void SetCateto2(float c2){
        this.c2=c2;
    }
     /**
      * Asignación de la operación del teorema.
      */
    public void SetHipotenusa(){
        hip=(float) Math.sqrt(Math.pow(c1, 2)+Math.pow(c2, 2));
    }
    /**
     * @return Devuelve la solución, la hipotenusa.
     */
    public float GetHipotenusa(){
        return hip;
    }
    
}
