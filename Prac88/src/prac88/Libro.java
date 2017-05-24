package prac88;

import java.util.ArrayList;

/**
 * Clase en la que se registra cada movimiento entre los ejemplares de los libros.
 */
public class Libro {
    /**
     * @param título Título del libro.
     * @param ISBN ISBN del libro.
     * @param autor Autor de libro.
     * @param ejemplares Ejemplares de dicho libro.
     * @param prestados Ejemplares prestados a algún usuario.
     */
    private String título, ISBN, autor;
    private int ejemplares, prestados;
    
    /**
     * Constructor con parámetros.
     * @param título Título del libro.
     * @param ISBN ISBN del libro.
     * @param autor Autor de libro.
     * @param ejemplares Ejemplares disponibles de dicho libro.
     * @param prestados Ejemplares prestados a algún usuario.
     */
    public Libro(String título, String ISBN, String autor, int ejemplares, int prestados) {
        this.título=título;
        this.ISBN=ISBN;
        this.autor=autor;
        this.ejemplares=ejemplares;
        this.prestados=prestados;
    }

    /**
     * Constructor por defecto.
     */
    public Libro() {
    }
    
    /**
     * Establece el título del libro.
     * @param t
     */
    public void setTítulo(String t){
        título=t;
    }
    /**
     * Establece el código ISBN del libro.
     * @param ISBN
     */
    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }
    /**
     * Establece el autor del libro.
     * @param a
     */
    public void setAutor(String a){
        autor=a;
    }
    /**
     * Establece el número de ejemplares disponibles.
     * @param e
     */
    public void setEjemplares(int e){
        ejemplares=e;
    }
    /**
     * Establece el número de ejemplares prestados.
     * @param p
     */
    public void setPrestados(int p){
        prestados=p;
    }
    /**
     * @return Devuelve el título del libro.
     */
    public String getTítulo(){
        return título;
    }
    /**
     * @return Devuelve la ISBN del libro.
     */
    public String getISBN(){
        return ISBN;
    }
    /**
     * @return Devuelve el nombre del autor de la obra.
     */
    public String getAutor(){
        return autor;
    }
    /**
     * @return Devuelve la cantidad de ejemplares prestados.
     */
    public int getPrestados(){
        return prestados;
    }
    /**
     * @return Devuelve la cantidad de ejemplares disponibles.
     */
    public int getEjemplares(){
        return ejemplares;
    }
    
   /**
     * Incrementa en uno los ejemplares prestados y decrementa en uno los ejemplares disponibles.
     */
    public void Préstamo(){
        prestados++;
        ejemplares--;
    }
    
    /**
     * Incrementa en uno los ejemplares disponibles y decrementa en uno los ejemplares prestados.
     */
    public void Devolución(){
        prestados--;
        ejemplares++;
    }
    
    /**
     * Muestra las propiedades del objeto determinado.
     */
    public void MuestraLibro(){
        System.out.println("Datos del libro: ");
        System.out.println("Título: " +getTítulo());
        System.out.println("Autor: "+getAutor());
        System.out.println("ISBN: " +getISBN());
        System.out.println("Ejemplares: " +getEjemplares());
        System.out.println("Prestados: " +getPrestados());
    }
    
    /**
     * @param libros Lista de libros registrados.
     * @param opción5 Opción seleccionada por el usuario para dar de baja al libro determinado.
     */
    public void Baja(ArrayList<Libro> libros, byte opción5){
        libros.remove(opción5-1);
    }
    
    /**
     * @param libros Lista de libros registrados.
     * @param libro3 Tercer libro (objeto) a añadir al ArrayList.
     */
    public void Alta(ArrayList<Libro> libros, Libro libro3){
        libros.add(libro3);

    }
    
}
