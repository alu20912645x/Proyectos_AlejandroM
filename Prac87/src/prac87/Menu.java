package prac87;

import java.util.Scanner;

/**
 * Clase en la que se muestran los menús y se da forma al programa.
 */
public class Menu {
    private boolean disponible1=true, disponible2=true;
    
    /**
     * Primer menú del programa, en el que muestra las operaciones con los ejemplares de los libros.
     * @param libro1 Primer libro.
     * @param libro2 Segundo libro.
     */
    public void Menú1(Libro libro1, Libro libro2){
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
            FormaMenú1(libro1, libro2, opción1);
          } while (opción1!=6);
        
    }

    /**
     * Encamina la operación seleccionada.
     * @param libro1 Primer libro.
     * @param libro2 Segundo libro.
     * @param opción1 Operación seleccionada.
     */
    public void FormaMenú1(Libro libro1, Libro libro2, byte opción1) {
        switch (opción1)
            {
            case 1:
                Mostrar(libro1, libro2);
                break;
            case 2:
                Prestar(libro1, libro2);
                break;
            case 3:
                Devolver(libro1, libro2);
                break;
            case 4:
                Alta(libro1, libro2);
                break;
            case 5:
                Baja(libro1, libro2);
            }
    }

    /**
     * Muestra información de uno de los dos libros registrados.
     * @param libro1 Primer libro.
     * @param libro2 Segundo libro.
     */
    public void Mostrar(Libro libro1, Libro libro2) {
        byte opción2;
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("¿Qué libro cuya información deseas consultar eliges?");
            if(disponible1){System.out.println("1. " +libro1.getTítulo()+".");} else{System.out.println("1. \033[0;36m Libro no disponible.");}
            if(disponible2){System.out.println("2. " +libro2.getTítulo()+".");} else{System.out.println("2. \033[0;36m Libro no disponible.");}
            opción2=teclado.nextByte();
          } while (opción2!=1 && opción2!=2);
        if (opción2==1 && disponible1)
            {libro1.MuestraLibro();}
        if (opción2==2 && disponible2)
            {libro2.MuestraLibro();}
        System.out.println();
    }
    
    /**
     * Préstamo de un ejemplar.
     * @param libro1 Primer libro.
     * @param libro2 Segundo libro.
     */
    public void Prestar(Libro libro1, Libro libro2) {
        byte opción3;
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("¿Qué ejemplar de libro te gustaría alquilar?");
            if(disponible1){System.out.println("1. " +libro1.getTítulo()+".");} else{System.out.println("1. \033[0;36m Libro no disponible.");}
            if(disponible2){System.out.println("2. " +libro2.getTítulo()+".");} else{System.out.println("2. \033[0;36m Libro no disponible.");}
            opción3=teclado.nextByte();
          } while (opción3!=1 && opción3!=2);
        if (opción3==1 && disponible1)
            {
            if (libro1.getEjemplares()!=0)
                {
                libro1.Préstamo();
                System.out.println("¡Hecho!");
                }
            else
                {System.out.println("¡No quedan ejemplares de ese libro!");}
            }
        if (opción3==2 && disponible2)
            {
            if (libro2.getEjemplares()!=0)
                {
                libro2.Préstamo();
                System.out.println("¡Hecho!");
                }
            else
                {System.out.println("¡No quedan ejemplares de ese libro!");}
            }
    }

    /**
     * Devolución del ejemplar prestado.
     * @param libro1 Primer libro.
     * @param libro2 Segundo libro.
     */
    public void Devolver(Libro libro1, Libro libro2) {
        byte opción4;
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("¿Qué ejemplar de libro quieres devolver?");
            if(disponible1){System.out.println("1. " +libro1.getTítulo()+".");} else{System.out.println("1. \033[0;36m Libro no disponible.");}
            if(disponible2){System.out.println("2. " +libro2.getTítulo()+".");} else{System.out.println("2. \033[0;36m Libro no disponible.");}
            opción4=teclado.nextByte();
          } while (opción4!=1 && opción4!=2);
        if (opción4==1 && disponible1)
            {
            if (libro1.getPrestados()!=0)
                {
                libro1.Devolución();
                System.out.println("¡Hecho!");
                }
            else
                {System.out.println("¡No tienes ninguna deuda con ese libro!");}
            }
        if (opción4==2 && disponible2)
            {
            if (libro2.getPrestados()!=0)
                {
                libro2.Devolución();
                System.out.println("¡Hecho!");
                }
            else
                {System.out.println("¡No tienes ninguna deuda respecto a ese libro!");}
            }
    }
    

    /**
     * Inclusión en el registro de un nuevo libro.
     * @param libro1 Primer libro.
     * @param libro2 Segundo libro.
     */
    public void Alta(Libro libro1, Libro libro2) { 
        if (disponible1 && disponible2)
            {System.out.println("No podemos incribir más de dos libros. Tendrás que eliminar uno.");}
        else
            {
            Scanner teclado = new Scanner(System.in);
            System.out.println("¿Cuál es el nombre del libro que quieres dar de alta?");
            if(!disponible2){libro2.setTítulo(teclado.nextLine());} else {libro1.setTítulo(teclado.nextLine());}
            System.out.println("¿Cuál es su código ISBN?");
            if(!disponible2){libro2.setISBN(teclado.nextLine());} else {libro1.setISBN(teclado.nextLine());}
            System.out.println("¿Quién es el autor o la autora?");
            if(!disponible2){libro2.setAutor(teclado.nextLine());} else {libro1.setAutor(teclado.nextLine());}
            System.out.println("¿Con cuántos ejemplares vienes?");
            int ejemplares=teclado.nextInt();
            while (ejemplares<=0)
                {System.out.println("Debes tener al menos un ejemplar. Vuelve a introducir la cantidad: ");
                ejemplares=teclado.nextInt();
                }
            if(!disponible2){libro2.setEjemplares(ejemplares);} else{libro1.setEjemplares(ejemplares);}
            if(!disponible2){libro2.setPrestados(0);} else {libro1.setPrestados(0);}
            System.out.println("¡Listo!");
            if (!disponible1){disponible1=true;}
            if (!disponible2){disponible2=true;}
            }
    }
    
    /**
     * Eliminación de un libro registrado.
     * @param libro1 Primer libro.
     * @param libro2 Segundo libro.
     */
    public void Baja(Libro libro1, Libro libro2) {
        byte opción6;
        if (disponible1 && disponible2) //No se podrá dar de baja al único libro que queda, es decir, solo cuando haya dos libros disponibles.
            {
            do{
                Scanner teclado = new Scanner(System.in);
                System.out.println("¿Qué libro quieres dar de baja?");
                System.out.println("1. " +libro1.getTítulo()+".");
                System.out.println("2. " +libro2.getTítulo()+".");
                opción6=teclado.nextByte();
             } while (opción6!=1 && opción6!=2);
            if (opción6==1){disponible1=false;} else{disponible2=false;}
            System.out.println("¡Hecho! El libro seleccionado ha sido dado de baja.");
            }
        else {System.out.println("No podemos dar de baja al último libro que queda.");}
    }
}
