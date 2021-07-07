package Clase3;

import java.util.Scanner;

public class Practico3_Metodos1 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio de programa");
        System.out.println("Ingrese un numero: ");
        int numero1 = input.nextInt();
        int doble = obtenerDoble(numero1);
        System.out.println("El doble de " + numero1 + " es " + doble);
        System.out.println("Fin del programa");
   }

    //Escribir un metodo que reciba un numero y retorne su doble.
    public static int obtenerDoble (int num){
        System.out.println("Entré a la funcion obtenerDoble!!");
        return num * 2;
    }
}
