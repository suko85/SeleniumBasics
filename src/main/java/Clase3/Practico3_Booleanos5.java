package Clase3;

import java.util.Scanner;

public class Practico3_Booleanos5 {
    //Realizar un método que retorne verdadero si el número recibido por parámetro es impar
    //y mayor a 20.
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("+++Inicio del programa+++");
        System.out.println("Ingrese un número: ");
        int numero = input.nextInt();
        if (imparMayor20(numero)==true){
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
        System.out.println("+++Fin del programa+++");
    }
    public static boolean imparMayor20(int num){
        if (num%2!=0 && num>20){
            return true;
        }else {
            return false;
        }
    }
}
