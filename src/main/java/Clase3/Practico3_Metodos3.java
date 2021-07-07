package Clase3;

import java.util.Scanner;

public class Practico3_Metodos3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio de programa");
        System.out.println("Ingrese un numero: ");
        int numero1 = input.nextInt();
        System.out.println("Ingrese otro numero: ");
        int numero2 = input.nextInt();
        int multi = multiplicar(numero1, numero2);
        System.out.println("La multiplicación es " + multi);
        System.out.println("Fin del programa");
    }

    //Metodo que reciba dos enteros y retorne la multiplicacion de la misma.
    public static int multiplicar (int num1, int num2){
        return num1 * num2;
    }
}
