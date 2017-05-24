package prac85;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que imprime los menús necesarios de la sucursal bancaria.
 */
public class Menu {
    /**
     * Organiza las operaciones del primer menú.
     * @param opción1 Opción seleccionada del primer menú (Elegir cuenta).
     * @param opción2 Opción seleccionada del segundo menú (Elegir operación).
     * @param cuentas ArrayList de las tres cuentas (objetos).
     * @return Devuelve la opción en la que elige la cuenta con la que operar.
     */
    public byte FormaMenú1(byte opción1, byte opción2, ArrayList<Cuenta> cuentas) {
        opción1=Menú1(cuentas);
        switch (opción1)
            {
            case 1: case 2: case 3:
                FormaMenú2(opción2, opción1, cuentas);
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
     * @param cuentas ArrayList de las tres cuentas (objetos).
     * @return Devuelve la opción seleccionada.
     */    
    public byte Menú1(ArrayList<Cuenta> cuentas) {
        byte i;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escoge la cuenta con la que desees operar: ");
        for (i=0; i<cuentas.size(); i++)
            {
            System.out.println((i+1)+ ". " +cuentas.get(i).GetNúmcuenta());
            }
        System.out.println((i+1)+ ". Salir.");
        System.out.println();
        return teclado.nextByte();
    }

    /**
     * Organiza las operaciones del segundo menú.
     * @param opción1 Cuál de las tres cuentas es con la que estamos realizando cálculos.
     * @param opción2 Qué operación se selecciona.
     * @param cuentas ArrayList de las tres cuentas (objetos).
     */  
    public void FormaMenú2(byte opción2, byte opción1, ArrayList<Cuenta> cuentas) {
        int ingreso, retiro;
        do {
            opción2=Menú2();
            switch (opción2)
                {
                case 1: //Ingreso.
                    ingreso=PideCantIngreso();
                    //Ingresamos y mostramos el saldo tras la operación, todo dependiendo del cliente con el que tratamos.
                    if (opción1==1){cuentas.get(0).SetIngreso(ingreso); System.out.println("Ok. Tu saldo actual: " +cuentas.get(0).GetSaldo()+ "€.");}
                    if (opción1==2){cuentas.get(1).SetIngreso(ingreso); System.out.println("Ok. Tu saldo actual: " +cuentas.get(1).GetSaldo()+ "€.");}
                    if (opción1==3){cuentas.get(2).SetIngreso(ingreso); System.out.println("Ok. Tu saldo actual: " +cuentas.get(2).GetSaldo()+"€.");}
                    break;
                case 2: //Reintegro.
                    retiro=PideCantRetiro(opción1, cuentas);
                    //Retiramos y mostramos el saldo tras la operación, todo dependiendo del cliente con el que tratamos.
                    if (opción1==1){cuentas.get(0).SetRetiro(retiro); System.out.println("Ok. Tu saldo actual: " +cuentas.get(0).GetSaldo()+ "€.");}
                    if (opción1==2){cuentas.get(1).SetRetiro(retiro); System.out.println("Ok. Tu saldo actual: " +cuentas.get(1).GetSaldo()+ "€.");}
                    if (opción1==3){cuentas.get(2).SetRetiro(retiro); System.out.println("Ok. Tu saldo actual: " +cuentas.get(2).GetSaldo()+ "€.");}
                    break;
                case 3: //Transferencia.
                    Transferencia(cuentas, opción1);
                    break;
                case 4: //Muestra los datos del titular.
                    if (opción1==1)
                        {System.out.println("Nombre del titular: " +cuentas.get(0).GetNombre()+" "+cuentas.get(0).GetApellido1()+
                                " "+cuentas.get(0).GetApellido2());
                        System.out.println("DNI: " +cuentas.get(0).GetDNI());
                        System.out.println("Tipo de interés: "+cuentas.get(0).GetInterés()+"%  Saldo: " +cuentas.get(0).GetSaldo()+ "€");
                        }
                    if (opción1==2)
                        {System.out.println("Nombre del titular: " +cuentas.get(1).GetNombre()+" "+cuentas.get(1).GetApellido1()+
                                " "+cuentas.get(1).GetApellido2());
                        System.out.println("DNI: " +cuentas.get(1).GetDNI());
                        System.out.println("Tipo de interés: 5%  Saldo: " +cuentas.get(1).GetSaldo()+ "€");
                        }
                    if (opción1==3)
                        {System.out.println("Nombre del titular: " +cuentas.get(2).GetNombre()+" "+cuentas.get(2).GetApellido1()+
                                " "+cuentas.get(2).GetApellido2());
                        System.out.println("DNI: " +cuentas.get(2).GetDNI());
                        System.out.println("Tipo de interés: 5%  Saldo: " +cuentas.get(2).GetSaldo()+ "€");
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
     * Pregunta la cantidad a ingresar.
     * @return Devuelve la cantidad que se desea ingresar.
     */
    public int PideCantIngreso() {
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
     * @param cuentas ArrayList de las tres cuentas (objetos).
     * @return Devuelve la cantidad que se desea retirar.
     */
    public int PideCantRetiro(byte opción1, ArrayList<Cuenta> cuentas) {
        int cant=0;
        if (opción1==1)
            {
            do {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Introduce la cantidad a retirar: ");
                cant=teclado.nextInt();
               } while (cant<0 || cant>cuentas.get(0).GetSaldo());
            }
        if (opción1==2)
            {
            do {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Introduce la cantidad a retirar: ");
                cant=teclado.nextInt();
               } while (cant<0 || cant>cuentas.get(1).GetSaldo());
            }
        if (opción1==3)
            {
            do {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Introduce la cantidad a retirar: ");
                cant=teclado.nextInt();
               } while (cant<0 || cant>cuentas.get(2).GetSaldo());
            }
        return cant;
    }
    
    /**
     * Transferencia entre las cuentas.
     * El cliente podrá transferir parte de sus ahorros a alguna de las otras dos cuentas.
     * @param cuentas ArrayList de las tres cuentas (objetos).
     * @param opción1 Cuenta origen a transferir.
     */
    public void Transferencia(ArrayList<Cuenta> cuentas, byte opción1) {
        char destinatario; int cant;
        switch (opción1)
            {
            case 1:
                System.out.println("De acuerdo, "+cuentas.get(0).GetNombre()+".");
                do {
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("¿A quién deseas transferir algunos ahorros?");
                    System.out.println("a) "+cuentas.get(1).GetNúmcuenta());
                    System.out.println("b) "+cuentas.get(2).GetNúmcuenta());
                    destinatario=teclado.next().charAt(0);
                  } while (destinatario!='a' && destinatario!='b');
                do {
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("¿Cuánto deseas transferir?");
                    cant=teclado.nextInt();
                  } while (cant>cuentas.get(0).GetSaldo() || cant<0);
                cuentas.get(0).Transferencia1(cant);
                if (destinatario=='a'){cuentas.get(1).Transferencia2(cant);}
                if (destinatario=='b'){cuentas.get(2).Transferencia2(cant);}
                System.out.println("¡Hecho! Tu saldo se ha quedado en: "+cuentas.get(0).GetSaldo()+"€.");
                break;
            case 2:
                System.out.println("De acuerdo, "+cuentas.get(1).GetNombre()+".");
                do {
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("¿A quién deseas transferir algunos ahorros?");
                    System.out.println("a) "+cuentas.get(0).GetNúmcuenta());
                    System.out.println("b) "+cuentas.get(2).GetNúmcuenta());
                    destinatario=teclado.next().charAt(0);
                  } while (destinatario!='a' && destinatario!='b');
                do {
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("¿Cuánto deseas transferir?");
                    cant=teclado.nextInt();
                  } while (cant>cuentas.get(1).GetSaldo() || cant<0);
                cuentas.get(1).Transferencia1(cant);
                if (destinatario=='a'){cuentas.get(0).Transferencia2(cant);}
                if (destinatario=='b'){cuentas.get(2).Transferencia2(cant);}
                System.out.println("¡Hecho! Tu saldo se ha quedado en: "+cuentas.get(1).GetSaldo()+"€.");
                break;
            case 3:
                System.out.println("De acuerdo, "+cuentas.get(2).GetNombre()+".");
                do {
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("¿A quién deseas transferir algunos ahorros?");
                    System.out.println("a) "+cuentas.get(0).GetNúmcuenta());
                    System.out.println("b) "+cuentas.get(1).GetNúmcuenta());
                    destinatario=teclado.next().charAt(0);
                  } while (destinatario!='a' && destinatario!='b');
                do {
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("¿Cuánto deseas transferir?");
                    cant=teclado.nextInt();
                  } while (cant>cuentas.get(2).GetSaldo() || cant<0);
                cuentas.get(2).Transferencia1(cant);
                if (destinatario=='a'){cuentas.get(0).Transferencia2(cant);}
                if (destinatario=='b'){cuentas.get(1).Transferencia2(cant);}
                System.out.println("¡Hecho! Tu saldo se ha quedado en: "+cuentas.get(2).GetSaldo()+"€.");
                break;
            }
    }

}