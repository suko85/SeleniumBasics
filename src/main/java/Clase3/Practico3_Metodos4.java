package Clase3;

import java.util.Scanner;

public class Practico3_Metodos4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio de programa");
        System.out.println("Ingrese un numero: ");
        int numero1 = input.nextInt();
        System.out.println("Ingrese otro numero: ");
        int numero2 = input.nextInt();
        int suma = suma(numero1,numero2);
        System.out.println("La sumatoria de los número es: "+ suma);
        System.out.println("Fin del programa");
    }
    //Método que devuelve la sumatoria de dos números.
    public static int suma (int num1, int num2){
        return num1+num2;
    }
}
