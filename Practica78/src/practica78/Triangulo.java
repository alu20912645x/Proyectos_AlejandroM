package practica78;

/**
 * Clase que, con la base y la altura, obtiene el área del triángulo.
 */
public class Triangulo {
    /**
     * @param b Base.
     * @param a Altura.
     * @param área Área.
     */
    private float b, a, área;
    /**
     * Asigna los valores de "b" y "a" a los de las variables de esta clase. 
     * @param b Variable importada de "Principal".
     * @param a Variable importada de "Principal".
     */
    public Triangulo(float b, float a) { //Constructor
        this.b=b;
        this.a=a;
    }
    //Área: base*altura/2
    /**
     * Asignación de la operación a "área".
     */
    public void SetÁrea() {
        área=b*a/2;
    }
    /**
     * @return Devuelve el área.
     */
    public float GetÁrea(){
        return área;
    }
}
