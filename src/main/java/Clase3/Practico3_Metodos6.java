package Clase3;

import java.util.Scanner;

public class Practico3_Metodos6 {
    //Realizar un método que reciba dos números y retorne el mayor ambos
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio de programa");
        System.out.println("Ingrese un numero: ");
        int numero1 = input.nextInt();
        System.out.println("Ingrese otro numero: ");
        int numero2 = input.nextInt();
        int mayor = obtenerMayor(numero1, numero2);
        System.out.println("El mayor de ambos números es: " + mayor);
        System.out.println("Fin del programa");
    }

    public static int obtenerMayor(int num1, int num2){
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }
}
