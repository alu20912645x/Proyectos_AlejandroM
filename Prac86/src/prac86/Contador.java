package prac86;

/**
 * Clase con los constructores por defecto, con parámetros y copia, además de manipular el contador.
 */
public class Contador {
    private int valor;
    
    /**
     * Constructor por defecto.
     */
    public Contador(){
    }
    /**
     * Constructor con parámetros.
     * @param valor 
     */
    public Contador(int valor) {
        this.valor=valor;
    }
    /**
     * Constructor copia.
     * @param cont1 
     */
    public Contador(final Contador cont1) {
        this.valor=cont1.valor;
    }
    /**
     * @return Devuelve el valor del contador.
     */
    public int GetContador(){
        return valor;
    }
    /**
     * Decrementa el valor si es positivo.
     */
    public void Decremento(){
        if (valor>0) {valor--;}
    }
    /**
     * Aumenta el valor.
     */
    public void Incremento(){
         valor++;
    }
    
    

}

