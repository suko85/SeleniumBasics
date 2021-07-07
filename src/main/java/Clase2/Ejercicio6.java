package Clase2;

import java.util.Scanner;

public class Ejercicio6 {
    //Pedir el ingreso de 3 números, indicar si hay números repetidos utilizando solo un IF.
    public static void main (String args[]){
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un primer número.");
        num1 = input.nextInt();
        System.out.println("Ingrese un segundo número.");
        num2 = input.nextInt();
        System.out.println("Ingrese un tercer número.");
        num3 = input.nextInt();
        if (num1 == num2 || num2 == num3 || num3==num1){
            System.out.println("HAY NUMEROS REPETIDOS!!");
        }else {
            System.out.println("NO HAY NUMEROS REPETIDOS");
        }
    }
}
