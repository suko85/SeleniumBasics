package Clase3;

import java.util.Scanner;

public class Practico3_Metodos5 {
    // Método que reciba un número entero y un número double, y retorne su
    //multiplicación. ¿Qué tipo de retorno tiene este método?
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio de programa");
        System.out.println("Ingrese un numero: ");
        int numero1 = input.nextInt();
        System.out.println("Ingrese otro numero: ");
        double numero2 = input.nextInt();
        double resultado = multiplicar(numero1, numero2);
        System.out.println("El resultado de la multiplicación es: " + resultado);
        System.out.println("Fin del programa");
    }
    public static double multiplicar(int num1, double num2){
        double multiplicacion = num1*num2;
        return multiplicacion;
    }
}
