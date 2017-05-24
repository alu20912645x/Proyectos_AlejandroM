package practica76;

import java.util.Scanner;

/**
 * Clase que imprime el menú de la calculadora y devuelve la opción.
 */
 public class Menu {
    
    /**
     * Imprime el menú.
     */    
    public void ImprimeMenú() {
       System.out.println("Escoge la operación a realizar:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println();
    }
    /**
     * @return Devuelve la opción seleccionada.
     */
    public int PideOpción() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
    
}
