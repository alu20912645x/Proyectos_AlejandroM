package prac91;

import java.util.ArrayList;

/**
 * Gestión de una biblioteca con ArrayList. Tenemos libros y ejemplares de ellos. Por cada libro puede
 * haber ningún o muchos ejemplares. Un ejemplar puede ser prestado un cliente cual clientes pueden
 * tomar prestados varios ejemplares. Se desea saber quiénes han realizado los préstamos.
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {

    /**
     * Se cren los objetos y los ArrayList de objetos para manipularlos en otras clases reclamadas.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Biblioteca> libros = new ArrayList<>();
        ArrayList<Cliente> clientes=new ArrayList<>();
        ArrayList<Ejemplar> ejemplares=new ArrayList<>();

        //Vamos a añadir directamente los libros a la lista:
        libros.add(new Biblioteca("Zacarías", "Pedro Paradís", "SCP096"));//libro1
        libros.add(new Biblioteca("La noche del muñeco viviente","R.L. Stine","SCP534")); //libro2
        libros.add(new Biblioteca("Un mundo feliz","Aldous Huxley","SCP125")); //libro3
        //Lo mismo pero con los clientes:
        clientes.add(new Cliente("Paco","González","00000111R","666889989")); //Nombre, primer apellido, DNI y teléfono respectivamente.
        clientes.add(new Cliente("Nuria","Jiménez","00000124M","689943552"));
        clientes.add(new Cliente("Estela","Martín","01258237P","662902673"));
        clientes.add(new Cliente("Gregorio","Miralles","01958239R","697966767"));

        //Ejemplares. ISBN, editorial, código, fecha, número del libro al que pertenece y propietario respectivamente:
        Ejemplar ej1=new Ejemplar("9788461729395","Rodalía","0095","12/2/2017",1,"");//A partir de aquí, ejemplares del primer libro.
        Ejemplar ej2=new Ejemplar(ej1);
        Ejemplar ej3=new Ejemplar(ej1);
        ej2.setISBN("9788461729396");
        ej2.setCódigo("0096");
        ej3.setISBN("9788461729396");
        ej3.setCódigo("0097");
        Ejemplar ej4=new Ejemplar("9788440692351","Ediciones B","0108","14/2/2017",2,""); //A partir de aquí, ejemplares del segundo libro.
        Ejemplar ej5=new Ejemplar(ej4);
        ej5.setCódigo("0109");
        ej5.setISBN("9788440692352");
        Ejemplar ej6=new Ejemplar("9788415709886"," Hidra","0124","15/2/2017",2,""); //Otro ejemplar del segundo libro aunque de otra editorial.
        Ejemplar ej7=new Ejemplar ("9788437631370","Catedra","0181","4/3/2017",3,""); //Ejemplar del tercer libro.
        
        ejemplares.add(ej1);
        ejemplares.add(ej2);
        ejemplares.add(ej3);
        ejemplares.add(ej4);
        ejemplares.add(ej5);
        ejemplares.add(ej6);
        ejemplares.add(ej7);
        
        Menu m=new Menu();
        byte cliente;
        do {
            cliente=m.MenúCliente(clientes);
            if (cliente==clientes.size()+1){m.Registro(clientes);}//Nuevo cliente.
            if (cliente<=clientes.size()){m.MenúOperaciones(cliente, libros, ejemplares, clientes);}
          } while (cliente!=clientes.size()+2);
    }
    
}
