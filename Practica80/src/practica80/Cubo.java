package practica80;

import java.util.Scanner;

/**
 * Clase que pide la arista del cubo para hallar su área.
 */
public class Cubo {
    //Área: arista*arista*6
    /**
     * @param arista Arista.
     * @param área Área.
     */
    private float arista, área;
    
    /**
     * @return Devuelve la arista por la que se preguntó.
     */
    public float PreguntaArista(){
    Scanner teclado=new Scanner(System.in);
    System.out.print("Introduce el valor de la arista: ");
    return teclado.nextFloat();
    }
    /**
     * Asignación de "arista" a la variable con el mismo nombre para la clase. 
     * @param arista Variable importada de "Principal".
     */
    public void SetLado(float arista){
        this.arista=arista;
    }
    /**
     * Asignación de la operación del área del cubo. 
     */
    public void SetÁrea(){
        área=(float) (Math.pow(arista, 2)*6);
    }
    /**
     * @return Devolución del área del cubo.
     */
    public float GetÁrea(){
        return área;
    }
}
