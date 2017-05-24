package practica86;
import java.util.Scanner;
/**
 * Convierte los pies introducidos a yardas, pulgadas y centímetros.
 */
public class Conversor {
    /**
     * @param ft Pies.
     * @param cm Centímetros.
     * @param yd Yardas.
     * @param in Pulgadas.
     */
    private float ft, cm, yd, in;
    //Un pie (ft) son 0.33 yd, 30,48 cm y 12 in.
    /**
     * @return Devuelve los pies pasados.
     */
    public float PidePies() {
    Scanner teclado=new Scanner(System.in);
    System.out.print("Expresa la cantidad en pies: ");
    return teclado.nextFloat();
    }
    /**
     * Asignación para la relación mútua.
     * @param pies Importados de "Principal". 
     */
    public void SetPies(float pies) {
        this.ft=pies;
    }
    /**
     * Asignación de centímetros.
     */
    public void SetCentímetros(){
        cm=ft*30.48F;
    }
    /**
     * Asignación de yardas.
     */
    public void SetYardas(){
        yd=ft*0.333F;
    }
    /**
     * Asignación de pulgadas.
     */
    public void SetPulgadas(){
        in=ft*12.00F;
    }
    /**
     * @return Devolución en yardas.
     */
    public float GetYardas(){
        return yd;
    }
    /**
     * @return Devolución en centímetros.
     */
    public float GetCentímetros(){
        return cm;
    }
    /**
     * @return Devolución en pulgadas.
     */
    public float GetPulgadas(){
        return in;
    }
    
}
