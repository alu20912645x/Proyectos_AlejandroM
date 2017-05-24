package prac88;

import java.util.ArrayList;

/**
 * Ídem que el ejercicio anterior pero utilizando ArrayList. Podemos tener cuantos libros queramos. 
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {

    /**
     * Se crean y se llaman a las clases "Libro" y "Menu", además de crear y añadir los dos primeros objetos al ArrayList.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();

        Libro libro1= new Libro("Zacarías","9788461729395","Pedro Paradís",9,1);//Título, ISBN, autor, número de ejemplares y de prestados respectivamente.
        Libro libro2= new Libro("La novia del muñeco viviente","9788440692351","R.L. Stine",5,1);
        
        libros.add(libro1);
        libros.add(libro2);
        
        Menu m=new Menu();
        m.Menú1(libros);
        

    }
    
}
