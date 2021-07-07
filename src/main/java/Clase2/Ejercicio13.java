package Clase2;

import java.util.Scanner;

public class Ejercicio13 {
     //13)Pedir el ingreso de números hasta que se ingrese un 0.
    public static void main (String args[]){
        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        num= input.nextInt();
        while (num!=0){
            System.out.println("El número ingreso fue: "+ num);
            System.out.println("Escriba otro número: ");
            num= input.nextInt();
        }
        System.out.println("Se ha ingresado un 0. El programa ha finalizado.");

    }
}
