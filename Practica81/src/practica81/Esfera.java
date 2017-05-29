package practica81;
import java.util.Scanner;
/**
 * Clase que pide el radio de la esfera para hallar su área y su volumen.
 */
public class Esfera {
    //Área: 4*PI*radio*radio
    //Volumen: 4/3*PI*radio*radio*radio
    /**
     * @param radio Radio.
     * @param área Área.
     * @param volumen Volumen.
     * @param PI Número PI.
     */
    private float radio, área, volumen;
    private final float PI=3.1416F; //No es preciso pues "Math.PI" hubiese valido.
    /**
     * @return Devuelve el radio que se ha pedido por teclado.
     */
    public float PreguntaRadio(){
    Scanner teclado=new Scanner(System.in);
    System.out.print("Introduce el radio de la circunferencia: ");
    return teclado.nextFloat();
    }
    /**
     * Asignación de "radio" a la variable con el mismo nombre para la clase. 
     * @param radio Variable importada de "Principal".
     */
    public void SetRadio(float radio){
        this.radio=radio;
    }
    /**
     * Asignación de la operación del área de la esfera. 
     */
    public void SetÁrea(){
        área=(float) (4*PI*Math.pow(radio,2));
    }
    /**
     * @return Devuelve el área.
     */
    public float GetÁrea(){
        return área;
    }
    /**
     * Asignación de la operación del volumen de la esfera.
     */
    public void SetVolumen(){
        volumen=(float) ((Math.pow(radio,3))*4/3*PI);
    }
    /**
     * @return Devuelve el volumen.
     */
    public float GetVolumen(){
        return volumen;
    }
}
