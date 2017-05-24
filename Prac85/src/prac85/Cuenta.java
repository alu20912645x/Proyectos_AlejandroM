package prac85;

/**
 * Clase para la gestión de las cuentas.
 */
public class Cuenta {
    
    /**
     * @param nombre Nombre del cliente.
     * @param apellido1 Primer apellido del cliente.
     * @param apellido2 Segundo apellido del cliente.
     * @param DNI Documento nacional de identidad del cliente.
     * @param númcuenta Número de cuenta bancaria del cliente.
     * @param interés Tipo de interés aplicado en porcentaje(%).
     * @param saldo Saldo actual del cliente en su cuenta.
     */
    private String nombre, apellido1, apellido2, DNI, númcuenta;
    private int saldo, interés;
    
    /**
     * Constructor por defecto. No hace nada.
     */
    public Cuenta(){
        
    }
    
    /**
     * Constructor con parámetros.
     * @param nombre Nombre del cliente.
     * @param apellido1 Primer apellido del cliente.
     * @param apellido2 Segundo apellido del cliente.
     * @param DNI Documento nacional de identidad del cliente.
     * @param númcuenta Número de cuenta bancaria del cliente.
     * @param interés Tipo de interés aplicado en porcentaje(%).
     * @param saldo Saldo actual del cliente en su cuenta.
     */
    public Cuenta(String nombre, String apellido1, String apellido2, String DNI, String númcuenta, 
            int interés, int saldo) {
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.DNI=DNI;
        this.númcuenta=númcuenta;
        this.interés=interés;
        this.saldo=saldo;
    }

    /**
     * Constructor copia. El tipo de interés se aplicará a todos los clientes.
     * @param c1 Se recibe el objeto c1 introducido como parámetro y que hace referencia a la primera cuenta.
     */
    public Cuenta(final Cuenta c1) {
        this.interés=c1.interés;
    }
    
    /**
     * @param n Establece el nombre del titular/cliente. 
     */
    public void SetNombre(String n){
        this.nombre=n; //Ya que no tienen el mismo nombre las variables, nos podemos ahorrar el "this".
    }
    /**
     * @param a1 Establece el apellido primero del titular.
     */
    public void SetApellido1(String a1){
        this.apellido1=a1;
    }
    /**
     * @param a2 Establece el apellido segundo del titular.
     */
    public void SetApellido2(String a2){
        this.apellido2=a2;
    }
    /**
     * @param DNI Establece el DNI del titular.
     */
    public void SetDNI(String DNI){
        this.DNI=DNI;
    }
    /**
     * @param nc Establece el número de cuenta del cliente.
     */
    public void SetNúmcuenta(String nc){
        this.númcuenta=nc;
    }
    /**
     * @param in Establece el tipo de interés aplicado.
     */
    public void SetInterés(int in){
        interés=in;
    }
    /**
     * @param s Establece el saldo del cliente.
     */
    public void SetSaldo(int s){ //A diferencia del anterior ejercicio, sí ha sido necesario crear este método.
        saldo=s;
    }
    
    
    /**
     * @return Devuelve el tipo de interés aplicado.
     */
    public int GetInterés(){
        return interés;
    }
    /**
     * @return Devuelve el saldo del cliente.
     */
    public int GetSaldo(){
        return saldo;
    }
    /**
     * @return Devuelve el nombre del titular de la cuenta.
     */
    public String GetNombre(){
        return nombre;
    }
    /**
     * @return Devuelve el primer apellido del cliente.
     */
    public String GetApellido1(){
        return apellido1;
    }
    /**
     * @return Devuelve el segundo apellido del cliente.
     */
    public String GetApellido2(){
        return apellido2;
    }
    /**
     * @return Devuelve el DNI del cliente..
     */
    public String GetDNI(){
        return DNI;
    }
    /**
     * @return Devuelve el número de la cuenta del cliente..
     */
    public String GetNúmcuenta(){
        return númcuenta;
    }
    
    /**
     * @param ingreso Cantidad para sumar al saldo del cliente.
     */
    public void SetIngreso(int ingreso){
        saldo=saldo+ingreso;
    }
    /**
     * @param retiro Cantidad a sustraer en el saldo del cliente.
     */
    public void SetRetiro(int retiro){
        saldo=saldo-retiro;
    }
    /**
     * @param retiro Cantidad a sustraer en el saldo del cliente.
     */
    public void Transferencia1(int retiro){
        saldo=saldo-retiro;
    }
    /**
     * @param ingreso Cantidad a ingresar en el saldo del cliente seleccionado. 
     */
    public void Transferencia2(int ingreso){
        saldo=saldo+ingreso;
    }
    
    
}
