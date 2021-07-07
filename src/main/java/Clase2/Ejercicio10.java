package Clase2;

import java.util.Scanner;

public class Ejercicio10 {
    //10)Programa Java que lea dos números y muestre los números entre ellos.
    public static void main (String args[]){
        int num1 = 0;
        int num2 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num1 = input.nextInt();
        System.out.println("Ingrese otro número: ");
        num2 = input.nextInt();
        for (int i=num1+1; i>num1 && i<num2;i++){
            System.out.println(i);
        }
    }
}
