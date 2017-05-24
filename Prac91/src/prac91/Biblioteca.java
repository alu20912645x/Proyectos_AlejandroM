package prac91;

import java.util.ArrayList;

/**
 * Clase en la que se registra cada movimiento entre los ejemplares.
 */
public class Biblioteca {
private String nombre, autor, código;

    /**
    * Constructor con parámetros.
    * @param nombre Título del libro.
    * @param autor Autor de la obra.
    * @param código Código propio del libro.
    */
    public Biblioteca(String nombre, String autor, String código) {
        this.nombre=nombre;
        this.autor=autor;
        this.código=código;
    }

    /**
     * Constructor vacío.
     */
    public Biblioteca() {
    }
    
    /**
     * Establece el nombre de la obra.
     * @param título 
     */
    public void setTítulo(String título){
        nombre=título;
    }
    /**
     * Establece el nombre del autor de la obra.
     * @param autor 
     */
    public void setAutor(String autor){
        this.autor=autor;
    }
    /**
     * Establece el código especial del libro.
     * @param código 
     */
    public void setCódigo(String código){
        this.código=código;
    }
    
    /**
     * @return Devuelve el nombre de la obra.
     */
    public String getTítulo(){
        return nombre;
    }
    /**
     * @deprecated No se cita este método en ninguna clase.
     * @return Devuelve el nombre del autor del libro.
     */
    public String getAutor(){
        return autor;
    }
    /**
     * @return Devuelve el código propio del libro.
     */
    public String getCódigo(){
        return código;
    }
    
    /**
     * Muestra las propiedades del determinado libro.
     * @param ejemplares Lista de ejemplares. Por defecto hay tres para el primer libro, los mismos para el segundo y uno para el tercero.
     * @param libros Lista de libros. Por defecto hay tres.
     * @param libro Libro sobre el que se consulta.
     */
    public void MuestraLibro(ArrayList<Ejemplar> ejemplares, ArrayList<Biblioteca> libros, byte libro){
        byte [] ejemplaresXlibro=new byte [100];
        byte aux;
        System.out.println("Datos del libro: ");
        System.out.println("Título: " +getTítulo());
        System.out.println("Autor: "+getAutor());
        System.out.println("Código: " +getCódigo());
        /*Se recorre libro por libro, y dentro de este primer bucle, se recorren los ejemplares de los libros. Si el número
        de libro (y) coincide con el número de ejemplar (último atributo de los ejemplares), se considerará que hay un ejemplar [más].*/
        for (byte y=1; y<=libros.size(); y++)
            {
            aux=0;
            for (byte i=0; i<ejemplares.size(); i++)
                {
                if (ejemplares.get(i).getLibro()==y
                        && ejemplares.get(i).getPoseedor().equals("")){aux++; ejemplaresXlibro[y-1]=aux;}
                }
            }
        System.out.println("Número de ejemplares disponibles del libro seleccionado: " +ejemplaresXlibro[libro-1]); 
    }

    /**
     * Incluye un nuevo libro en el ArrayList.
     * @param libros Lista de libros.
     * @param libro4 Nuevo libro a añadir.
     */
    public void Alta(ArrayList<Biblioteca> libros, Biblioteca libro4) {
        libros.add(libro4);
    }
    
    /**
     * Elimina un libro del ArrayList.
     * @param libros Lista de libros.
     * @param baja Libro que se da de baja. Es el número que insertó el usuario, por lo que hay que restarle
     * uno para utilizarlo en el ArrayList, ya que las opciones de los menús comienzan desde uno.
     */
    public void Baja(ArrayList<Biblioteca> libros, byte baja) {
        libros.remove(baja-1);
    }
    
    
}
