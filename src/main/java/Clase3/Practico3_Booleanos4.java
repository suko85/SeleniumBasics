package Clase3;

import java.util.Scanner;

public class Practico3_Booleanos4 {
    //Realizar un método que retorne verdadero si el número recibido por parámetro es impar.
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("+++Inicio del programa+++");
        System.out.println("Ingrese un número: ");
        int numero = input.nextInt();
        if (esPar(numero)==true){
            System.out.println("Verdadero");
        }else {
            System.out.println("Falso");
        }
        System.out.println("+++Fin del programa+++");
    }
    public static boolean esPar(int num){
        if (num%2==0){
            return true;
        }else {
            return false;
        }
    }
}
