package prac87;

/**
 * Crea una clase "Libro" con métodos de devolución, de préstamo y de muestra del libro. 
 * También se debe dar de alta y de baja a un libro. 
 * Empezamos con dos libros y cada libro tendrá un título, un ISBN, un autor, unos ejemplares y un número de prestaciones.
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {
    /**
     * Se crean y se llaman a las clases "Libro" y "Menu".
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1= new Libro("Zacarías","9788461729395","Pedro Paradís",9,1);//Título, ISBN, autor, número de ejemplares y de prestados respectivamente.
        Libro libro2= new Libro("La novia del muñeco viviente","9788440692351","R.L. Stine",5,1);
        Menu m=new Menu();
        m.Menú1(libro1, libro2);
        

    }
    
}
