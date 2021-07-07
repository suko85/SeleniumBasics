package Clase2;

import java.util.Scanner;

public class Ejercicio3 {
 // Pedir el ingreso de 3 números y mostrar la suma de ellos.
    public static void main(String args[]) {
//        Int num1 = 0;
        int num1 = 0;
//        Int num2 = 0;
        int num2 = 0;
//        Int num3 = 0;
        int num3 = 0;
//        TECLADO
        Scanner input = new Scanner(System.in);

//        MOSTRAR “Ingrese un numero”;
        System.out.println("Ingrese un número...");
//        GUARDAR num1;
        num1 = input.nextInt();
//        MOSTRAR “Ingrese otro numero”;
        System.out.println("Ingrese un otro número...");
//        GUARDAR num2;
        num2 = input.nextInt();
//        MOSTRAR “Ingrese el ultimo numero”;
        System.out.println("Ingrese el último número...");
//        GUARDAR num3;
        num3 = input.nextInt();
//        Int suma = num1 + num2 + num3;
        int suma = num1 + num2 + num3;

//        MOSTRAR “La suma es “ + suma;
        System.out.println("La suma es " + suma);
    }
}
