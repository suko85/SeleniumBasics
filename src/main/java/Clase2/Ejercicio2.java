package Clase2;

import java.util.Scanner;

public class Ejercicio2 {
    //INICIO
    public static void main (String args[]){
        //TECLADO
        Scanner input = new Scanner(System.in);
        //String nombre;
        String nombre = "";
        //Int año;
        int año = 0;
        //MOSTRAR "Ingrese su nombre";
        System.out.println("Ingrese su nombre");
        //GUARDAR nombre;
        nombre = input.next();
        //MOSTRAR "Ingrese su año de nacimiento";
        System.out.println("Ingrese su año de nacimiento");
        //GUARDAR año;
        año = input.nextInt();
        //int edad = 2020 - año;
        int edad = 2020 - año;
        //MOSTRAR "Su nombre es " + nombre
        System.out.println("Su nombre es "+ nombre + " y su edad es " +edad+ " años.");


    }

}
