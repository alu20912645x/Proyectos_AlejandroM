package prac91;

import java.util.ArrayList;

/**
 * Clase en la que se trabaja con los datos de los ejemplares.
 */
public class Ejemplar {
    private String ISBN, editorial, código, fecha, cliente;
    private int libro;
    
    /**
     * Constructor con parámetros.
     * @param ISBN Código ISBN del ejemplar.
     * @param editorial Editorial del ejemplar de libro.
     * @param código Código especial del ejemplar.
     * @param fecha Fecha de registro del ejemplar.
     * @param libro Número de libro del que es ejemplar. Por ejemplo, "1" sería el primer libro registrado de la lista.
     * @param poseedor Cliente que posee el ejemplar.
     */
    public Ejemplar(String ISBN, String editorial, String código, String fecha, int libro, String poseedor) {
        this.ISBN=ISBN;
        this.editorial=editorial;
        this.código=código;
        this.fecha=fecha;
        this.libro=libro;
        cliente=poseedor;
    }

    /**
     * Constructor copia. Algunos ejemplares coinciden en fecha, libro del que son, editorial y poseedor.
     * @param ej1 
     */
    public Ejemplar(final Ejemplar ej1) {
        this.editorial=ej1.editorial;
        this.fecha=ej1.fecha;
        this.libro=ej1.libro;
        this.cliente=ej1.cliente;
    }
    
    /**
     * Constructar por defecto.
     */
    public Ejemplar() {
    }
    
    /**
     * Establece el código ISBN.
     * @param ISBN 
     */
    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }
    /**
     * Establece el código único del ejemplar.
     * @param código 
     */
    public void setCódigo(String código) {
        this.código=código;
    }
    /**
     * Establece el número del libro al que pertenece el ejemplar.
     * @param libro 
     */
    public void setLibro(int libro){
        this.libro=libro;
    }
    /**
     * Establece la editorial del ejemplar de libro.
     * @param editorial 
     */
    public void setEditorial(String editorial) {
        this.editorial=editorial;
    }
    /**
     * Establece el DNI del dueño del ejemplar.
     * @param poseedor 
     */
    public void setPoseedor(String poseedor){
        cliente=poseedor;
    }
    /**
     * Establece la fecha con la que se registra el ejemplar.
     * @param fecha 
     */
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    
    /**
     * @return Devuelve el número del libro al que pertenece el ejemplar.
     */
    public int getLibro(){
        return libro;
    }
    /**
     * @return Devuelve el código ISBN del ejemplar.
     */
    public String getISBN() {
        return ISBN;
    }
    /**
     * @return Devuelve el DNI del poseedor del ejemplar.
     */
    public String getPoseedor(){
        return cliente;
    }
    /**
     * @return Devuelve el código del ejemplar.
     */
    public String getCódigo(){
        return código;
    }
    
    /**
     * Añade un nuevo ejemplar de libro a la lista.
     * @param ejemplares Lista de ejemplares.
     * @param ej8 Nuevo ejemplar.
     */
    public void Alta(ArrayList<Ejemplar> ejemplares, Ejemplar ej8) {
        ejemplares.add(ej8);
    }
    
    /**
     * Elimina cada ejemplar de libro que se añadieron.
     * @param ejemplares Lista de ejemplares.
     * @param baja Número de ejemplar que se elimina. El número es el índice del bucle en el que se encontraba,
     * por lo que se deja tal y como está.
     */
    public void Baja (ArrayList<Ejemplar> ejemplares, byte baja){
        ejemplares.remove(baja);
    }

    
}
    
