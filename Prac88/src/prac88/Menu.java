package prac88;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase en la que se muestran los menús y se da forma al programa.
 */
public class Menu {
    private byte i;
    
    /**
     * Primer menú del programa, en el que muestra las operaciones con los ejemplares de los libros.
     * @param libros ArrayList (Lista) de libros registrados.
     */
    public void Menú1(ArrayList<Libro> libros) {
        byte opción1;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Escoge una opción: ");
            System.out.println("1. Mostrar libros disponibles.");
            System.out.println("2. Solicitar ejemplar de un libro."); //Préstamo
            System.out.println("3. Devolver un ejemplar."); //Devolución
            System.out.println("4. Dar de alta a un libro.");
            System.out.println("5. Dar de baja a un libro.");
            System.out.println("6. Salir.");
            opción1=teclado.nextByte();
            FormaMenú1(libros, opción1);
          } while (opción1!=6);
    }
    
    /**
     * Encamina la operación seleccionada.
     * @param libros Lista de libros registrados.
     * @param opción1 Operación seleccionada.
     */
    public void FormaMenú1(ArrayList<Libro> libros, byte opción1) {
        switch (opción1)
            {
            case 1:
                if(libros.size()>0) Mostrar(libros); else System.out.println("¡No hay libros!");
                break;
            case 2:
                if(libros.size()>0) Prestar(libros); else System.out.println("¡No hay libros!");
                break;
            case 3:
                if(libros.size()>0) Devolver(libros); else System.out.println("¡No hay libros!");
                break;
            case 4:
                Alta(libros);
                break;
            case 5:
                if(libros.size()>0) Baja(libros); else System.out.println("¡Ya no quedan más libros por dar de baja!");
            }
    }
    
    /**
     * Muestra información de uno de los libros registrados.
     * @param libros Lista de libros registrados.
     */
    public void Mostrar(ArrayList<Libro> libros) {
        byte opción2;
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("¿Qué libro cuya información deseas consultar eliges?");
            for (i=0; i<libros.size(); i++)
                {
                System.out.println((i+1)+ ". "+libros.get(i).getTítulo()+".");
                }
            opción2=teclado.nextByte();
         } while (opción2<1 || opción2>libros.size());
        libros.get(opción2-1).MuestraLibro();
        System.out.println();
    }
    
    /**
     * Préstamo de un ejemplar.
     * @param libros Lista de libros registrados.
     */
    public void Prestar (ArrayList<Libro> libros){
        byte opción3;
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("¿Qué ejemplar de libro quieres alquilar?");
            for (i=0; i<libros.size(); i++)
                {
                System.out.println((i+1)+ ". "+libros.get(i).getTítulo()+".");
                }
            opción3=teclado.nextByte();
         } while (opción3<1 || opción3>libros.size());
        if (libros.get(opción3-1).getEjemplares()!=0)
            {
            libros.get(opción3-1).Préstamo();
            System.out.println("¡Hecho!");
            }
        else
            {System.out.println("¡No quedan ejemplares de ese libro!");}
    }
    
    /**
     * Devolución de un ejemplar.
     * @param libros Lista de libros registrados.
     */
    public void Devolver (ArrayList<Libro> libros){
        byte opción4;
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("¿Qué ejemplar de libro quieres devolver?");
            for (i=0; i<libros.size(); i++)
                {
                System.out.println((i+1)+ ". "+libros.get(i).getTítulo()+".");
                }
            opción4=teclado.nextByte();
         } while (opción4<1 || opción4>libros.size());
        if (libros.get(opción4-1).getPrestados()==0)
            {
            System.out.println("No tienes ninguna deuda con ese libro.");
            }
        else
            {
            libros.get(opción4-1).Devolución();
            System.out.println("¡Hecho!");
            }
    }
    
    /**
     * Inclusión en el registro de un nuevo libro.
     * @param libros Lista de libros registrados.
     */
    public void Alta (ArrayList<Libro> libros){
        Libro libro3= new Libro();
        libro3.Alta(libros, libro3);
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuál es el nombre del libro que quieres dar de alta?");
        libros.get(libros.size()-1).setTítulo(teclado.nextLine());
        System.out.println("¿Cuál es su código ISBN?");
        libros.get(libros.size()-1).setISBN(teclado.nextLine());
        System.out.println("¿Quién es el autor o la autora?");
        libros.get(libros.size()-1).setAutor(teclado.nextLine());
        System.out.println("¿Con cuántos ejemplares vienes?");
        int ejemplares=teclado.nextInt();
        while (ejemplares<=0)
            {System.out.println("Debes tener al menos un ejemplar. Vuelve a introducir la cantidad: ");
            ejemplares=teclado.nextInt();
            }
        libros.get(libros.size()-1).setEjemplares(ejemplares);
        libros.get(libros.size()-1).setPrestados(0);
        System.out.println("¡Listo!");
    }
    
    /**
     * Eliminación de un libro registrado.
     * @param libros Lista de libros registrados.
     */
    public void Baja (ArrayList<Libro> libros){
        byte opción5;
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("¿Qué libro quieres dar de baja?");
            for (i=0; i<libros.size(); i++)
                {
                System.out.println((i+1)+ ". "+libros.get(i).getTítulo()+".");
                }
            opción5=teclado.nextByte();
         } while (opción5<1 || opción5>libros.size());
        libros.get(opción5-1).Baja(libros, opción5);
        System.out.println("¡Hecho!");
    }
}
