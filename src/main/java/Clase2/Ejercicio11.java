package Clase2;

import java.util.Scanner;

public class Ejercicio11 {
    //11)Programa que lea 6 números e indique en pantalla si son positivos o negativos y pares o impares
    public static void main (String args[]) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserte un primer numero: ");
        num1 = input.nextInt();
        System.out.println("Inserte un segundo numero: ");
        num2 = input.nextInt();
        System.out.println("Inserte un tercer numero: ");
        num3 = input.nextInt();
        System.out.println("Inserte un cuarto numero: ");
        num4 = input.nextInt();
        System.out.println("Inserte un quinto numero: ");
        num5 = input.nextInt();
        System.out.println("Inserte un sexto numero: ");
        num6 = input.nextInt();
        for (int i=num1;i>=num1 && i<=num6;num1++){
            if (i%2==1 || i>=0){ // If a number divided by 2 leaves a remainder of 1, then the number is odd. You can check for this using num % 2 == 1.
                System.out.println(i + " es impar y positivo.");
        } else if(i%2==1 || i<=0){
                System.out.println(i + " es impar y negativo.");
        } else if (i%2==0 || i>=0) {
                System.out.println(i + "es par y positivo.");
        } else{
                System.out.println(i + "es par y negativo.");
            }

        }
    }
}
