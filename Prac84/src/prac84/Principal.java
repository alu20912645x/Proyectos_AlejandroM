package prac84;

/**
 * Gestión de tres cuentas bancarias. Se realizan ingresos, reintegros y transferencias.
 * @author <h2><u>Alejandro Martín Álvarez</u></h2>
 * @version 1.0
 */
public class Principal {
    /**
     * Asigna los datos de los titulares de las tres cuentas existentes y llama a la clase "Menu" para organizar el programa.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Nombre, Apellido1, Apellido2, DNI, número de cuenta, tipo de interés y saldo respectivamente para el contructor con parámetros:
        Cuenta c1=new Cuenta("Gumersindo","González","Pérez","01011099Y","C501",4,4000); 
        Cuenta c2=new Cuenta(c1); //Constructor copia.
        Cuenta c3=new Cuenta(c1); //Es lo mismo introducir como parámetro "c2" que "c1", pues "c2" ya tiene el tipo de interés de "c1".
        //Introducimos como parámetros todos los datos de los clientes c2 y c3, salvo el tipo de interés:
        c2.SetNombre("Paco");
        c3.SetNombre("Anabel");
        c2.SetApellido1("Plaza");
        c3.SetApellido1("Espada");
        c2.SetApellido2("Martín");
        c3.SetApellido2("Bonfill");
        c2.SetDNI("01011055F");
        c3.SetDNI("00101049C");
        c2.SetNúmcuenta("C502");
        c3.SetNúmcuenta("C503");
        c2.SetSaldo(3500); //Números enteros no van entre comillas.
        c3.SetSaldo(3000);
        
        //A partir de aquí, se organizan los menús:
        Menu m=new Menu();
        byte opción1=0, opción2=0;
        do {
            opción1=m.FormaMenú1(opción1, opción2, c1, c2, c3);
          } while (opción1!=4);
        
    }
}
