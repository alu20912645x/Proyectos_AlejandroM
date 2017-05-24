package prac90;

/**
 * Crea una clase "NIF" con el fin de calcular la letra del NIF a partir del número del DNI.
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {

    /**
     * Llama a métodos de la clase "NIF".
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIF n1=new NIF(20912645);
        /*Puesto que no podemos consultar directamente el método privado "CalculaLetra()", llamamos a
        "MuestraLetra()" para que este llame al método del cálculo y después imprima el resultado.
        De esta forma ocultamos el sencillo algoritmo conocido como "módulo 23".*/
        n1.MuestraLetra(n1);
    }
    
}
