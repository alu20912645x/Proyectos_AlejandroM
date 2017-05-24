package practica76;

import java.util.Scanner;
/**
 * Clase que pregunta los factores de la operación y calcula los resultados.
 */
public class Calculadora {
    /**
     * @param num1 Es el primer sumando, o el minuendo, o el primer factor, o bien el dividendo de la operación pertinente.
     * @param num2 Es el segundo sumando, o el sustraendo, o el segundo factor, o bien el divisor de la operación pertinente.
     * @param resultado Resultado de la operación.
     */
     private int num1, num2, resultado;
    
    /**
     * @return Devuelve el primer número de la operación.
     */
    public int PreguntaNúmero1(){
        Scanner teclado2 = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        return teclado2.nextInt();
    }
    /**
     * @return Devuelve el segundo número de la operación.
     */
    public int PreguntaNúmero2(){
        Scanner teclado3 = new Scanner(System.in);
        System.out.print("Introduce el segundo número: ");
        return teclado3.nextInt();
    }
    
    /**
     * Asigna el valor de la variable importada a la variable de la clase que define el primer número de la operación. 
     * @param num1 Variable importada de "Principal". Es el primer número de la operación.
     */
    public void SetNúmero1(int num1){
        this.num1=num1;
    }
    /**
     * Asigna el valor de la variable importada a la variable de la clase que define el segundo número de la operación. 
     * @param num2 Variable importada de "Principal". Es el segundo número de la operación.
     */
    public void SetNúmero2(int num2){
        this.num2=num2;
    }
    /**
     * Asigna al resultado la operación de sumar el primer sumando con el segundo. 
     */
    public void SetSuma(){
        resultado=num1+num2;
    }
    /**
     * Asigna al resultado la operación de restar el minuendo con el sustraendo.
     */
    public void SetResta(){
        resultado=num1-num2;
    }
    /**
     * Asigna al resultado el producto de los factores introducidos.
     */
    public void SetMultiplicación(){
        resultado=num1*num2;
    }
    /**
     * Asigna al resultado el cociente de la división.
     */
    public void SetDivisión(){
        resultado=num1/num2;
    }
    /**
     * @return Devuelve el resultado.
     */
    public int GetResultado(){
        return resultado;
    }
    
}
