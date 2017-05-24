package prac91;

import java.util.ArrayList;

/**
 * Clase en la que se trabaja con los datos de los clientes.
 */
public class Cliente {
private String nombre, apellido1, DNI, teléfono;
    /**
     * Constructor con parámetros.
     * @param nombre Nombre del cliente.
     * @param ape1 Primer apellido del cliente.
     * @param DNI DNI del cliente.
     * @param teléf Teléfono de contacto del cliente.
     */
    public Cliente(String nombre, String ape1, String DNI, String teléf) {
        this.nombre=nombre;
        apellido1=ape1;
        this.DNI=DNI;
        teléfono=teléf;
    }
    /**
     * Constructor por defecto.
     */
    public Cliente() {
    }
    /**
     * Establece el nombre del cliente.
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    /**
     * Establece el primer apellido del cliente.
     * @param ape1
     */
    public void setApellido1(String ape1){
        apellido1=ape1;
    }
    /**
     * Establece el DNI del cliente.
     * @param DNI
     */
    public void setDNI(String DNI){
        this.DNI=DNI;
    }
    /**
     * Establece el teléfono del cliente.
     * @param teléfono
     */
    public void setTeléfono(String teléfono){
        this.teléfono=teléfono;
    }
    /**
     * @return Devuelve el nombre del cliente.
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * @deprecated No se cita este método en ninguna clase.
     * @return Devuelve el apellido del cliente.
     */
    public String getApellido1(){
        return apellido1;
    }
    /**
     * @return Devuelve el DNI del cliente.
     */
    public String getDNI(){
        return DNI;
    }
    /**
     * @deprecated No se cita este método en ninguna clase.
     * @return Devuelve el teléfono del cliente.
     */
    public String getTeléfono(){
        return teléfono;
    }
    /**
     * Añade el nuevo objeto del cliente a la lista registradora de clientes.
     * @param clientes Lista de clientes registrados de la biblioteca.
     * @param cli5 Nuevo cliente.
     */
    public void Registro(ArrayList<Cliente> clientes, Cliente cli5) {
        clientes.add(cli5);
    }

}
