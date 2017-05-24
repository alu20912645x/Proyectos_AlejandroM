package practica77;
import java.util.Scanner;

/**
 * Clase que pide el radio de la circunferencia y calcula con esto el perímetro y el área.
 */
public class Circunferencia {
    //Perímetro: 2*PI*radio
    //Área: PI*radio*radio
    /**
     * @param radio Radio.
     * @param longitud Perímetro.
     * @param área Área.
     * @param PI Número PI.
     */
    private float radio, longitud, área;
    private final float PI=3.14159265F;
     
    /**
     * @return Devuelve el radio de la circunferencia.
     */
    public float PreguntaRadio(){
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el radio de la circunferencia: ");
        return teclado.nextFloat();
    }
    
    /**
     * Asigna el valor de la variable importada a la variable "radio" de esta clase. 
     * @param radio Variable importada de "Principal".
     */
    public void SetRadio(float radio){
        this.radio=radio;
    }
   /**
     * Asignación de la operación a "longitud".
     */
    public void SetLogitud(){
        longitud=radio*PI*2;
    }
    /**
     * Asignación de la operación a "área".
     */
    public void SetÁrea(){
        área=(float) (Math.pow(radio, 2)*PI);
    }
    /**
     * @return Devuelve el perímetro.
     */
    public float GetLongitud(){
        return longitud;
    }
    /**
     * @return Devuelve el área.
     */
    public float GetÁrea(){
        return área;
    }
}
