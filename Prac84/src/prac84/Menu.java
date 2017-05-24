package prac84;
import java.util.Scanner;

/**
 * Clase que imprime los menús necesarios de la sucursal bancaria.
 */
 public class Menu {
    
     /**
     * Organiza las operaciones del primer menú.
     * @param opción1 Opción seleccionada del primer menú (Elegir cuenta).
     * @param opción2 Opción seleccionada del segundo menú (Elegir operación).
     * @param c1 Primera de las tres cuentas.
     * @param c2 Segunda de las tres cuentas.
     * @param c3 Tercera de las tres cuentas.
     * @return Devuelve la opción en la que elige la cuenta con la que operar.
     */
     public byte FormaMenú1(byte opción1, byte opción2, Cuenta c1, Cuenta c2, Cuenta c3){
        opción1=Menú1(c1, c2, c3);
        switch (opción1)
            {
            case 1:
                FormaMenú2(opción2, opción1, c1, c2, c3);
                break;
            case 2:
                FormaMenú2(opción2, opción1, c1, c2, c3);
                break;
            case 3:
                FormaMenú2(opción2, opción1, c1, c2, c3);
                break;
            case 4:
                break;
            default:
                System.out.println("Error seleccionando una opción.");
            }
        return opción1;
     }
     
    /**
     * Imprime el primer menú.
     * @param c1 Primera de las tres cuentas.
     * @param c2 Segunda de las tres cuentas.
     * @param c3 Tercera de las tres cuentas.
     * @return Devuelve la opción seleccionada.
     */    
    public byte Menú1(Cuenta c1, Cuenta c2, Cuenta c3) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Escoge la cuenta con la que desees operar: ");
       System.out.println("1. " +c1.GetNúmcuenta());
       System.out.println("2. " +c2.GetNúmcuenta());
       System.out.println("3. " +c3.GetNúmcuenta());
       System.out.println("4. Salir.");
       System.out.println();
       return teclado.nextByte();
    }

    /**
     * Imprime el segundo menú.
     * @return Devuelve la opción seleccionada.
     */    
    public byte Menú2() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Selecciona la operación a realizar: ");
        System.out.println("1. Ingreso.");
        System.out.println("2. Reintegro.");
        System.out.println("3. Transferencia.");
        System.out.println("4. Ver datos.");
        System.out.println("5. Salir.");
        System.out.println();
        return teclado.nextByte();
    }
    
    /**
     * Organiza las operaciones del segundo menú.
     * @param opción1 Cuál de las tres cuentas es con la que estamos realizando cálculos.
     * @param opción2 Qué operación se selecciona.
     * @param c1 Primera de las tres cuentas.
     * @param c2 Segunda de las tres cuentas.
     * @param c3 Tercera de las tres cuentas.
     */  
    public void FormaMenú2(byte opción2, byte opción1, Cuenta c1, Cuenta c2, Cuenta c3){
        int ingreso, retiro;
        do {
            opción2=Menú2();
            switch (opción2)
                {
                case 1: //Ingreso.
                    ingreso=PideCantIngreso();
                    //Ingresamos y mostramos el saldo tras la operación, todo dependiendo del cliente con el que tratamos.
                    if (opción1==1){c1.SetIngreso(ingreso); System.out.println("Ok. Tu saldo actual: " +c1.GetSaldo()+ "€.");}
                    if (opción1==2){c2.SetIngreso(ingreso); System.out.println("Ok. Tu saldo actual: " +c2.GetSaldo()+ "€.");}
                    if (opción1==3){c3.SetIngreso(ingreso); System.out.println("Ok. Tu saldo actual: " +c3.GetSaldo()+ "€.");}
                    break;
                case 2: //Reintegro.
                    retiro=PideCantRetiro(opción1, c1, c2, c3);
                    //Retiramos y mostramos el saldo tras la operación, todo dependiendo del cliente con el que tratamos.
                    if (opción1==1){c1.SetRetiro(retiro); System.out.println("Ok. Tu saldo actual: " +c1.GetSaldo()+ "€.");}
                    if (opción1==2){c2.SetRetiro(retiro); System.out.println("Ok. Tu saldo actual: " +c2.GetSaldo()+ "€.");}
                    if (opción1==3){c3.SetRetiro(retiro); System.out.println("Ok. Tu saldo actual: " +c3.GetSaldo()+ "€.");}
                    break;
                case 3: //Transferencia.
                    Transferencia(c1, c2, c3, opción1);
                    break;
                case 4: //Muestra los datos del titular.
                    if (opción1==1)
                        {System.out.println("Nombre del titular: " +c1.GetNombre()+" "+c1.GetApellido1()+" "+c1.GetApellido2());
                        System.out.println("DNI: " +c1.GetDNI());
                        System.out.println("Tipo de interés: 4%  Saldo: " +c1.GetSaldo()+ "€");
                        }
                    if (opción1==2)
                        {System.out.println("Nombre del titular: " +c2.GetNombre()+" "+c2.GetApellido1()+" "+c2.GetApellido2());
                        System.out.println("DNI: " +c2.GetDNI());
                        System.out.println("Tipo de interés: 4%  Saldo: " +c2.GetSaldo()+ "€");
                        }
                    if (opción1==3)
                        {System.out.println("Nombre del titular: " +c3.GetNombre()+" "+c3.GetApellido1()+" "+c3.GetApellido2());
                        System.out.println("DNI: " +c3.GetDNI());
                        System.out.println("Tipo de interés: 4%  Saldo: " +c3.GetSaldo()+ "€");
                        }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Error seleccionando una opción.");
                }
           } while (opción2!=5);
    }
    
    /**
     * Pregunta la cantidad a ingresar.
     * @return Devuelve la cantidad que se desea ingresar.
     */
    public int PideCantIngreso(){
        int cant;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce la cantidad a ingresar: ");
            cant=teclado.nextInt();
          } while (cant<0);
        return cant;
    }
    /**
     * Pregunta la cantidad a retirar.
     * @param opción1 Una de las tres cuentas con la que se está operando.
     * @param c1 Primera de las tres cuentas.
     * @param c2 Segunda de las tres cuentas.
     * @param c3 Tercera de las tres cuentas.
     * @return Devuelve la cantidad que se desea retirar.
     */
    public int PideCantRetiro(byte opción1, Cuenta c1, Cuenta c2, Cuenta c3){
        int cant=0;
        if (opción1==1)
            {
            do {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Introduce la cantidad a retirar: ");
                cant=teclado.nextInt();
               } while (cant<0 || cant>c1.GetSaldo());
            }
        if (opción1==2)
            {
            do {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Introduce la cantidad a retirar: ");
                cant=teclado.nextInt();
               } while (cant<0 || cant>c2.GetSaldo());
            }
        if (opción1==3)
            {
            do {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Introduce la cantidad a retirar: ");
                cant=teclado.nextInt();
               } while (cant<0 || cant>c3.GetSaldo());
            }
        return cant;
    }
    
    /**
     * Transferencia entre las cuentas.
     * El cliente podrá transferir parte de sus ahorros a alguna de las otras dos cuentas.
     * @param c1 Primera de las tres cuentas.
     * @param c2 Segunda de las tres cuentas.
     * @param c3 Tercera de las tres cuentas.
     * @param opción1 Cuenta origen a transferir.
     */
    public void Transferencia(Cuenta c1, Cuenta c2, Cuenta c3, byte opción1) {
        char destinatario; int cant;
        switch (opción1)
            {
            case 1:
                System.out.println("De acuerdo, "+c1.GetNombre()+".");
                do {
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("¿A quién deseas transferir algunos ahorros?");
                    System.out.println("a) "+c2.GetNúmcuenta());
                    System.out.println("b) "+c3.GetNúmcuenta());
                    destinatario=teclado.next().charAt(0);
                  } while (destinatario!='a' && destinatario!='b');
                do {
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("¿Cuánto deseas transferir?");
                    cant=teclado.nextInt();
                  } while (cant>c1.GetSaldo() || cant<0);
                c1.Transferencia1(cant);
                if (destinatario=='a'){c2.Transferencia2(cant);}
                if (destinatario=='b'){c3.Transferencia2(cant);}
                System.out.println("¡Hecho! Tu saldo se ha quedado en: "+c1.GetSaldo()+"€.");
                break;
            case 2:
                System.out.println("De acuerdo, "+c2.GetNombre()+".");
                do {
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("¿A quién deseas transferir algunos ahorros?");
                    System.out.println("a) "+c1.GetNúmcuenta());
                    System.out.println("b) "+c3.GetNúmcuenta());
                    destinatario=teclado.next().charAt(0);
                  } while (destinatario!='a' && destinatario!='b');
                do {
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("¿Cuánto deseas transferir?");
                    cant=teclado.nextInt();
                  } while (cant>c2.GetSaldo() || cant<0);
                c2.Transferencia1(cant);
                if (destinatario=='a'){c1.Transferencia2(cant);}
                if (destinatario=='b'){c3.Transferencia2(cant);}
                System.out.println("¡Hecho! Tu saldo se ha quedado en: "+c2.GetSaldo()+"€.");
                break;
            case 3:
                System.out.println("De acuerdo, "+c3.GetNombre()+".");
                do {
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("¿A quién deseas transferir algunos ahorros?");
                    System.out.println("a) "+c1.GetNúmcuenta());
                    System.out.println("b) "+c2.GetNúmcuenta());
                    destinatario=teclado.next().charAt(0);
                  } while (destinatario!='a' && destinatario!='b');
                do {
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("¿Cuánto deseas transferir?");
                    cant=teclado.nextInt();
                  } while (cant>c3.GetSaldo() || cant<0);
                c3.Transferencia1(cant);
                if (destinatario=='a'){c1.Transferencia2(cant);}
                if (destinatario=='b'){c2.Transferencia2(cant);}
                System.out.println("¡Hecho! Tu saldo se ha quedado en: "+c3.GetSaldo()+"€.");
                break;
            }
        
    }
        
}
