package prac91;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase en la que se muestran los menús y se da forma al programa.
 */
public class Menu {

    /**
     * Primero de los menús en el que se deja seleccionar el cliente registrado de la biblioteca.
     * @param clientes Lista de clientes de esta biblioteca.
     * @return Devuelve la opción de un cliente seleccionado, o bien la de registrarse.
     */
    public byte MenúCliente(ArrayList<Cliente> clientes) {
        byte opción, i;
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("Identifícate con tu DNI: ");
            for (i=0; i<clientes.size();i++)
                {
                System.out.println((i+1)+ ". " +clientes.get(i).getDNI()+".");
                }
            System.out.println((i+1)+". Soy nuevo, quiero registrarme.");
            System.out.println((i+2)+ ". Salir.");
            opción=teclado.nextByte();
          }while(opción<1 || opción>(clientes.size()+2));
        return opción;
    }

    /**
     * Menú de las operaciones que puede efectuar el cliente seleccionado.
     * @param cliente Cliente seleccionado.
     * @param libros Lista de libros registrados.
     * @param ejemplares Lista de ejemplares.
     * @param clientes Lista de clientes.
     */
    public void MenúOperaciones(byte cliente, ArrayList<Biblioteca> libros, ArrayList<Ejemplar> ejemplares,
            ArrayList<Cliente> clientes) {
        byte opción2;
        do {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Selecciona una operación: ");
        System.out.println("1. Mostrar libros disponibles.");
        System.out.println("2. Solicitar ejemplar de un libro."); //Préstamo
        System.out.println("3. Devolver un ejemplar."); //Devolución
        System.out.println("4. Dar de alta a un libro.");
        System.out.println("5. Dar de baja a un libro.");
        System.out.println("6. Salir.");
        opción2=teclado.nextByte();
        switch (opción2)
            {
            case 1:
                if(libros.size()>0) Mostrar(libros, ejemplares); else System.out.println("¡No hay libros!");
                break;
            case 2:
                if(libros.size()>0) Préstamo(libros, ejemplares, clientes, cliente);else System.out.println("¡No hay libros!");
                break;
            case 3:
                if(libros.size()>0) Devolución(libros, ejemplares, clientes, cliente);else System.out.println("¡No hay libros!");
                break;
            case 4:
                Alta(libros, ejemplares);
                break;
            case 5:
                if(libros.size()>0) Baja(libros, ejemplares);else System.out.println("¡No hay libros!");
                break;
            case 6:
                break;
            default:
                System.out.println("Opción inválida.");
            }
          } while (opción2!=6);
    }
    
    /**
     * Registra un nuevo cliente.
     * @param clientes Lista de clientes de la biblioteca.
     */
    public void Registro(ArrayList<Cliente> clientes) {
        boolean repetido; String aux; byte i;
        Cliente cli5=new Cliente();
        cli5.Registro(clientes, cli5);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Para registrarte, introduce tu nombre: ");
        clientes.get(clientes.size()-1).setNombre(teclado.nextLine());
        System.out.println("Introduce tu primer apellido: ");
        clientes.get(clientes.size()-1).setApellido1(teclado.nextLine());
        do { //Comprobaremos que el DNI sea único:
            repetido=false;
            System.out.println("Introduce tu DNI: ");
            aux=teclado.nextLine();
            for (i=0; i<clientes.size(); i++)
                {if (aux.equals(clientes.get(i).getDNI())){repetido=true;}}
            if (!repetido) {clientes.get(clientes.size()-1).setDNI(aux);}
        } while (repetido);
        System.out.println("Introduce un teléfono de contacto: ");
        clientes.get(clientes.size()-1).setTeléfono(teclado.nextLine());
        System.out.println("¡Hecho!");
    }
    
    /**
     * Muestra los libros disponibles para que el usuario escoja uno de ellos. Después, llama a un submétodo.
     * @param libros Lista de libros registrados.
     * @param ejemplares Lista de ejemplares.
     */
    private void Mostrar(ArrayList<Biblioteca> libros, ArrayList<Ejemplar> ejemplares) {
        byte libro, i;
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("¿Qué libro cuya información deseas consultar eliges?");
            for (i=0; i<libros.size(); i++)
                {
                System.out.println((i+1)+ ". "+libros.get(i).getTítulo()+".");
                }
            libro=teclado.nextByte();
         } while (libro<1 || libro>libros.size());
        libros.get(libro-1).MuestraLibro(ejemplares, libros, libro);
        System.out.println();
    }
    
    /**
     * El cliente solicita un ejemplar de libro. Dicho ejemplar no intervendrá en otras operaciones debido a que pertenecerá a un cliente.
     * @param libros Lista de libros.
     * @param ejemplares Lista de ejemplares.
     * @param clientes Lista de clientes.
     * @param cliente Cliente que accede al préstamo del ejemplar.
     */
    private void Préstamo(ArrayList<Biblioteca> libros, ArrayList<Ejemplar> ejemplares, ArrayList<Cliente> clientes,
            byte cliente){
        byte ejemplar, i, y;
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("¿Qué ejemplar de libro escoges?");
            for (i=0; i<libros.size(); i++)
                {
                System.out.println((i+1)+ ". "+libros.get(i).getTítulo()+".");
                }
            ejemplar=teclado.nextByte();
         } while (ejemplar<1 || ejemplar>libros.size());
        /*Hay que recorrer la lista de ejemplares. Si la opción seleccionada (ejemplar) coincide con lo que devuelve "getLibro"
        de la clase "Ejemplar", significa que queda al menos un ejemplar del libro seleccionado. También no ha de tener ese ejemplar asignado un poseedor.*/
        byte ejdellib=0, ejdestinado=0; //"ejdestinado" será el último (o único) ejemplar por el que pasará el bucle. Será destinado al cliente.
        for (y=0; y<ejemplares.size(); y++)
            {
            if (ejemplar==ejemplares.get(y).getLibro() && ejemplares.get(y).getPoseedor().equals(""))
                {
                ejdellib++; ejdestinado=y;
                }
            }
        if (ejdellib>0)
            {
            System.out.println("De acuerdo, queda(n) " +ejdellib+ " ejemplar(es) de ese libro. *Efectuando operación*");
            ejemplares.get(ejdestinado).setPoseedor(clientes.get(cliente-1).getDNI()); //Se guardará el DNI del cliente en el último atributo del ejemplar.
            System.out.println("¡Listo, ya tienes tu libro " +clientes.get(cliente-1).getNombre()+"!");
            System.out.println("Ejemplares del libro que quedan: " +(ejdellib-1));
            /*El ejemplar prestado sí seguirá perteneciendo a su libro.*/
            //ejemplares.get(ejdestinado).setLibro(0);
            }
        else {System.out.println("Lo sentimos, no quedan ejemplares de ese libro.");}
        System.out.println();
    }

    /**
     * Aquel cliente que haya prestado algún o algunos ejemplares los podrá devolver.
     * @param libros Lista de libros.
     * @param ejemplares Lista de ejemplares.
     * @param clientes Lista de clientes.
     * @param cliente Cliente que devuelve el ejemplar.
     */
    private void Devolución(ArrayList<Biblioteca> libros, ArrayList<Ejemplar> ejemplares,
            ArrayList<Cliente> clientes, byte cliente) {
        byte libro, i; boolean devuelto=false;
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("¿Qué ejemplar de libro quieres devolver?");
            for (i=0; i<libros.size(); i++)
                {
                System.out.println((i+1)+ ". "+libros.get(i).getTítulo()+".");
                }
            libro=teclado.nextByte();
          } while (libro<1 || libro>libros.size());
        
        /*El cliente devolverá el ejemplar si el ejemplar tiene el número del libro que ha marcado el usuario y también
        si el DNI que aparece en el atributo "cliente" (Véase clase "Ejemplar") es el mismo que quien efectúa esta operación.*/
        for (i=0; i<ejemplares.size(); i++)
            {
            //Además, aunque el usuario tenga dos o más ejemplares prestados de un mismo libro, haremos que solo devuelva uno (!devuelto) por operación.
            if (clientes.get(cliente-1).getDNI().equals(ejemplares.get(i).getPoseedor()) &&
                    ejemplares.get(i).getLibro()==libro && !devuelto) 
                {
                ejemplares.get(i).setPoseedor(""); //El ejermplar en cuestión dejará de pertenecer al usuario pertinente.
                System.out.println("*Efectuando operación*");
                System.out.println("¡Listo! El ejemplar ha sido devuelto.");
                devuelto=true;
                }
            }
        if (!devuelto)
            {System.out.println("¡No se ha podido devolver el ejemplar! No tienes ninguna deuda con ese libro. ");}
            
    }
    
    /**
     * Registra un nuevo libro. También se incluyen los ejemplares de dicho libro. Además,
     * se necesitará llamar a otra clase para saber la fecha actual con la que se registran los ejemplares.
     * @param libros Lista de libros.
     * @param ejemplares Lista de ejemplares.
     */
    private void Alta(ArrayList<Biblioteca> libros, ArrayList<Ejemplar> ejemplares) {
        Biblioteca libro4=new Biblioteca();
        libro4.Alta(libros, libro4);
        boolean repetido; byte numejem, i; String aux;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuál es el nombre del libro que quieres dar de alta?");
        libros.get(libros.size()-1).setTítulo(teclado.nextLine());
        System.out.println("¿Quién es el autor?");
        libros.get(libros.size()-1).setAutor(teclado.nextLine());
        do { //Comprobaremos que el código del libro no se repita, ya que es único:
            repetido=false;
            System.out.println("¿Qué código especial tiene?");
            aux=teclado.nextLine();
            for (i=0; i<libros.size(); i++)
                {if (aux.equals(libros.get(i).getCódigo())){repetido=true;}}
            if (!repetido) {libros.get(libros.size()-1).setCódigo(aux);}
        } while (repetido);
        
        //Ya tenemos preparado el libro. Ahora falta añadir ejemplares de ese libro.
        System.out.println("Bien. El libro está registrado. Ahora vayamos con los ejemplares.");
        do {
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("¿Con cuántos ejemplares vienes?");
            numejem=teclado2.nextByte();
            if (numejem<1)
                {
                System.out.println("¡Has de venir con al menos un ejemplar!");
                }
            else
                {
                for (i=1; i<=numejem; i++)
                    {
                    Ejemplar ej8=new Ejemplar();
                    ej8.Alta(ejemplares, ej8);
                    Scanner teclado3 = new Scanner(System.in);
                    do {
                        repetido=false;
                        System.out.println("Introduce la ISBN del ejemplar NO" +i);
                        aux=teclado.nextLine();
                        for (byte y=0; y<libros.size(); y++)
                            {if (aux.equals(ejemplares.get(y).getISBN())){repetido=true;}}
                        if (!repetido) {ejemplares.get(ejemplares.size()-1).setISBN(aux);}
                      } while (repetido);
                    System.out.println("Introduce su editorial: ");
                    ejemplares.get(ejemplares.size()-1).setEditorial(teclado3.nextLine());
                    do {
                        repetido=false;
                        System.out.println("Introduce su código: ");
                        aux=teclado.nextLine();
                        for (byte y=0; y<libros.size(); y++)
                            {if (aux.equals(ejemplares.get(y).getCódigo())){repetido=true;}}
                        if (!repetido) {ejemplares.get(ejemplares.size()-1).setCódigo(aux);}
                      } while (repetido);
                    Fecha factual=new Fecha();
                    System.out.println("Se registrará la fecha de hoy: " +factual.FechaActual());
                    ejemplares.get(ejemplares.size()-1).setFecha(factual.FechaActual());
                    System.out.println("Se registrará también el \"número\" del libro al que pertenece: " +libros.size());
                    ejemplares.get(ejemplares.size()-1).setLibro(libros.size());
                    ejemplares.get(ejemplares.size()-1).setPoseedor("");
                    System.out.println("¡Listo!"); if (i<numejem){System.out.println("¡Siguiente ejemplar!");}
                    }
                }
           }while (numejem<1);
    }
    
    /**
     * Elimina un libro arrastrando sus ejemplares.
     * @param libros Lista de libros.
     * @param ejemplares Lista de ejemplares.
     */
    private void Baja(ArrayList<Biblioteca> libros, ArrayList<Ejemplar> ejemplares) {
        byte i, libro; //Libro a dar de baja.
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("¿Qué libro quieres dar de baja?");
            for (i=0; i<libros.size(); i++)
                {
                System.out.println((i+1)+ ". "+libros.get(i).getTítulo()+".");
                }
            libro=teclado.nextByte();
         } while (libro<1 || libro>libros.size());
        libros.get(libro-1).Baja(libros, libro);
        System.out.println("También se eliminarán sus ejemplares. *Efectuando operación*");
        for (i=(byte)(ejemplares.size()-1); i>=0; i--)
            {
            if (ejemplares.get(i).getLibro()==libro)
                {
                ejemplares.get(i).Baja(ejemplares, i);
                }
            }
        System.out.println("¡Listo!");
        /*Sin embargo, no está todo solucionado. Los ejemplares que tienen un número de libro posterior al libro marcado a eliminar ("libro"),
        tienen referencia a un número de libro incorrecto, pues el tamaño del ArrayList de los libros se ha reducido en uno. Para reparar esto,
        aquellos números de libro de los ejemplares que sean iguales o superiores al libro marcado, serán decrementados en uno: */
        for (i=0; i<ejemplares.size(); i++)
            {
            if (libro<ejemplares.get(i).getLibro()) {ejemplares.get(i).setLibro(ejemplares.get(i).getLibro()-1);}
            }
    }    
}
