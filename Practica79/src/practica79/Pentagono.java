package practica79;

import java.util.Scanner;

/**
 * Clase que pide los lados y la apotema del pentágono para obtener su área.
 */
public class Pentagono {
    //Área: 5*lado*apotema/2
    /**
     * @param lado Lado del pentágono. Todos sus lados son iguales.
     * @param apotema Apotema.
     * @param área Área.
     */
    private float lado, apotema, área;
    /**
     * @return Devuelve un lado del pentágono que se ha preguntado.
     */
    public float PreguntaLado() {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el lado del pentágono: ");
        return teclado.nextFloat();
    }
    /**
     * @return Devuelve la apotema del pentágono la cual se pidió.
     */
     public float PreguntaApotema() {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce la apotema del pentágono: ");
        return teclado.nextFloat();
    }
     /**
     * Asigna el valor de "lado" a la variable con el mismo nombre pero para esta clase. 
     * @param lado Variable importada de "Principal".
     */
     public void SetLado(float lado){
        this.lado=lado;
    }
     /**
     * Asigna el valor de "apot" a "apotema" para utilizarse en esta clase. 
     * @param apot Variable importada de "Principal".
     */
     public void SetApotema(float apot){
        this.apotema=apot;
    }
     /**
     * Asigna el valor del área a toda la operación. 
     */
     public void SetÁrea(){
         área=lado*5*apotema/2;
     }
     /**
     * @return Devuelve el área del pentágono.
     */
     public float GetÁrea(){
         return área;
     }
}
