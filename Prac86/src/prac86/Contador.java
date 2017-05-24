package prac86;

/**
 * Clase con los constructores por defecto, con parámetros y copia, además de manipular el contador.
*/
public class Contador {
    private int valor;
    
    public Contador(){
    }
    
    public Contador(int valor) {
        this.valor=valor;
    }
    
    public Contador(final Contador cont1) {
        this.valor=cont1.valor;
    }
    
    public int GetContador(){
        return valor;
    }
    
    public void Decremento(){
        if (valor>0) {valor--;}
    }
    public void Incremento(){
         valor++;
    }
    
    

}

