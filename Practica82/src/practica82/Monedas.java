package practica82;

import java.util.Scanner;

/**
 * Clase que pide la cantidad de dinero para desplegar en los diferentes billetes y monedas.
 */
public class Monedas {
    /**
     * @param i Contador.
     * @param divisores Los distintos tipos de billetes y monedas.
     * @param cantidades Número de billetes y monedas, es decir, cada cociente de las divisiones.
     * @param dinero Dinero inicial.
     * El dinero es, a la vez, el resto en la división anterior y el dividendo de la división siguiente.
     * @param cociente Número de billetes o monedas para cada paso.
     */
    private int dinero;
    private int [] divisores={500,200,100,50,20,10,5,2,1};
    private int [] cantidades=new int [divisores.length];
    private byte i;
    private int cociente;
    /**
     * @return Devuelve el dinero que se ha introducido por teclado.
     */
    public int PreguntaDinero() {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce la cantidad de dinero en euros: ");
        return teclado.nextInt();
    }
    /**
     * Asignación de "dinero" a la variable con el mismo nombre para la clase. 
     * @param dinero Importado de "Principal".
     */
    public void SetDinero_Inicial(int dinero) {
        this.dinero=dinero;
    }
    
    /**
     * Operaciones para sacar las distintas cantidades de billetes y monedas.
     */
    public void Desglosar() {
    /*Hay que dividir entre quinientos la cantidad del dinero introducido. El cociente es el número
    de billetes de 500. El residuo de la división es la cantidad sobrante que debe ser empleada para
    calcular el número de billetes de 200, de la misma forma que se hizo.
    Así, hasta que el resto final pasadas las divisiones sea cero.*/
    
    for (i=0; i<divisores.length; i++)
        {
        cociente=0;
        while (dinero>=divisores[i])
            {cociente=dinero/divisores[i]; dinero=dinero%divisores[i];}
        cantidades[i]=cociente;
        }
   
    }
    
    /**
     * Imprime las soluciones.
     */
    public void GetSolución(){
        System.out.println();
        for (i=0; i<divisores.length; i++)
            {
            if (i==7 || i==8) {System.out.println("Monedas de " +divisores[i]+ "€: " +cantidades[i]);}
            else {System.out.println("Billetes de " +divisores[i]+ "€: " +cantidades[i]);}
            }
    }
    
}
