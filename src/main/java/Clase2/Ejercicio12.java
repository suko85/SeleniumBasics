package Clase2;

import java.util.Scanner;

public class Ejercicio12 {
    //12)Pedir el ingreso de 4 números y retornar su suma en valor absoluto.

    public static void main (String args[]){
        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num1 = input.nextInt();
        System.out.println("Ingrese un segundo número: ");
        num2 = input.nextInt();
        System.out.println("Ingrese un tercer número: ");
        num3 = input.nextInt();
        System.out.println("Ingrese un cuarto número: ");
        num4 = input.nextInt();
        int suma = num1+ num2+ num3+ num4;
        System.out.println("El valor absoluto de la suma es "+ Math.abs(suma)+".");
    }
}
