package prac86;

import java.util.Scanner;

/**
 * Crea una clase "Contador" con métodos para incrementar y decrementar el contador.
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {
    /**
     * Muestra un pequeño menú en el cual se puede incrementar, decrementar o visualizar el contador.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contador cont1= new Contador(0);
        Contador cont2=new Contador(cont1);
        byte opción;
        System.out.println("Valor del contador: " +cont1.GetContador());
        System.out.println("El contador no podrá ser negativo de ningún modo.");
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("Selecciona una opción: ");
            System.out.println("1. Incremento del contador. ");
            System.out.println("2. Decremento del contador. ");
            System.out.println("3. Mostrar contador. ");
            System.out.println("4. Salir.");
            opción=teclado.nextByte();
          
        switch (opción)
            {
            case 1:
                cont1.Incremento();
                break;
            case 2:
                cont1.Decremento();
                break;
            case 3:
                System.out.println("Valor del contador: " +cont1.GetContador());
                break;
            case 4:
                System.out.println("Adiós.");
                break;
            default:
                System.out.println("Opción incorrecta.");
            }
        } while (opción!=4);
    }
    
}
