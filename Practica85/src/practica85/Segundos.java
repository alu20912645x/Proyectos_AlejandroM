package practica85;

import java.util.Scanner;

/**
 * Convierte segundos a semanas, días, horas, minutos y segundos.
 */
public class Segundos {
    private int seg_ini, semanas, días, horas, minutos, segundos;
    
    /**
     * @return Devuelve los segundos que acababan de ser introducidos.
     */
    public int PideSegundos() {
    Scanner teclado=new Scanner(System.in);
    System.out.print("Introduce la cantidad de segundos: ");
    return teclado.nextInt();
    }
    
    /**
     * Asignación para la relación mútua.
     * @param seg Segundos importados de "Principal". 
     */
    public void SetSeg_ini(int seg) {
        this.seg_ini=seg;
    }
    /**
     * Calcula las semanas que hay en los segundos introducidos.
     */
    public void SetSemanas(){
        semanas=seg_ini/(60*60*24*7); //Segundos, minutos, horas y días respectivamente.
    }
    /**
    * @return Devuelve las semanas.
    */
    public int GetSemanas(){
        return semanas;
    }
    /**
     * Asignación de los días. 
     * El resto de la primera división, que son los segundos sobrantes, deben dividirse por
     * los segundos que tiene un día (60*60*24). 
     */
    public void SetDías(){
        días=(seg_ini%(60*60*24*7))/(60*60*24);
    }
    /**
     * @return Devuelve los días.
     */
    public int GetDías(){
        return días;
    }
    /**
     * Asignación de las horas.
     */
    public void SetHoras(){
        //Sabemos directamente que en una hora hay 3600 segundos.*/
        horas=((seg_ini%(60*60*24*7))%(60*60*24))/3600;
    }
    /**
     * @return Devuelve las horas.
     */
    public int GetHoras(){
        return horas;
    }
    /**
     * Asignación de los minutos.
     */
    public void SetMinutos(){
        minutos=(((seg_ini%(60*60*24*7))%(60*60*24))%3600)/60;
    }
    /**
     * @return Devuelve los minutos.
     */
    public int GetMinutos(){
        return minutos;
    }
    /**
     * Asignación de los segundos.
     */
    public void SetSegundos(){
        segundos=(((seg_ini%(60*60*24*7))%(60*60*24))%3600)%60;   
    }
    /**
     * @return Devuelve los segundos restantes.
     */
    public int GetSegundos(){
        return segundos;
    }
    
}
