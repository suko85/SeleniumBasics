package Clase3;

import java.util.Scanner;

public class Practico3_Metodos2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio de programa");
        System.out.println("Ingrese un numero: ");
        int numero = input.nextInt();
        mayorA20(numero);
        System.out.println("Fin del programa");
    }
    //Método que reciba un numero entero e imprima en pantalla en caso de ser mayor a 20, "Es mayor a 20", contrario "No es mayor a 20."
    public static void mayorA20(int num){
        if (num>20){
            System.out.println("Es mayor a 20.");
        }else {
            System.out.println("No es mayor a 20.");
        }
    }
}
