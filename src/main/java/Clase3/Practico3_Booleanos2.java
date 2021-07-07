package Clase3;

import java.util.Scanner;

public class Practico3_Booleanos2 {
    //Dado un número, retorne verdadero si el número es menor a 0.
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("+++Inicio del programa+++");
        System.out.println("Ingrese un número:");
        int numero = input.nextInt();
        if (mayorCero(numero)==true){
            System.out.println("Verdadero");
        }else {
            System.out.println("Falso");
        }
        System.out.println("+++Inicio del programa+++");
    }
    public static boolean mayorCero(int num){
        if (num<0){
            return true;
        }else {
            return false;
        }
    }
}
