package Clase2;

import java.util.Scanner;

public class Ejercicio8 {
    //8)Pedir el ingreso de números hasta que aparezca uno negativo.
    public static void main (String args[]){
        int num1 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        num1 = input.nextInt();
        while (num1>=0){
            System.out.println("Escriba otro número: ");
            num1 = input.nextInt();
        }
         System.out.println("El número es negativo. Finaliza el programa.");

    }
}
