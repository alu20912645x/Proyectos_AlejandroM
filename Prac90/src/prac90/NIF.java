package prac90;

/**
 * Clase en la que se saca la letra del NIF a partir del número del DNI aplicando el algoritmo simple
 * conocido como "módulo 23".
 */
public class NIF {
    private int DNI;
    private char letra;
    private final String comb="TRWAGMYFPDXBNJZSQVHLCKE"; //"comb" de combinación.

    /**
     * Constructor con parámetros.
     * @param DNI Número del DNI que ha sido pasado como parámetro.
     */
    public NIF(int DNI) {
        this.DNI=DNI;
    }
    
    /**
     * Calcula la letra del NIF a partir del DNI. No mostramos el algoritmo con "private".
     */
    private void CalculaLetra(){
        letra=comb.charAt(DNI%23);
    }
    
    /**
     * Llama a "CalculaLetra()" e imprime el resultado.
     * @param n1 Único NIF (objeto) del programa.
     */
    public void MuestraLetra(NIF n1){
        n1.CalculaLetra();
        System.out.println("La letra del NIF es: " +letra);
    }
}
