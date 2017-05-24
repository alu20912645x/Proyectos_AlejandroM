package prac85;

import java.util.ArrayList;

/**
 * Gestión de tres cuentas bancarias con ArrayList. Se realizan ingresos, reintegros y transferencias.
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {
    /**
     * Asigna los datos de los titulares de las tres cuentas existentes agregando esas cuentas al ArrayList al mismo
     * tiempo y llama a la clase "Menu" para organizar el programa.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Cuenta> cuentas=new ArrayList <>(3); //Tamaño 3, que son las cuentas existentes de entrada.
        Cuenta c1=new Cuenta("Pedro","Casaseca","Ramírez","1888888M","C100",5,500);
        cuentas.add(c1);
        //Podemos agregar directamente las cuentas al ArrayList.
        cuentas.add(new Cuenta ("Pablo","Pablemos","Pablismo","6655588J","C101",5,7525));
        cuentas.add(new Cuenta("Erik","Gordillo","Lobo","12488999X","C102",5,4600));
        
        Menu m=new Menu();
        byte opción1=0, opción2=0;
        do {
            opción1=m.FormaMenú1(opción1, opción2, cuentas);
          } while (opción1-1!=cuentas.size());
    }
    
}
