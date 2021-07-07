package Clase3;

import java.util.Scanner;

public class Practico3_Metodos8 {
    //Crear un método que retorne verdadero si y sólo si el número es par, de lo
    //contrario, debe retornar falso.
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("+++Inicio del programa+++");
        System.out.println("Ingrese un número: ");
        int numero = input.nextInt();
        if (esPar(numero)==true){
            System.out.println("VERDADERO");
        } else {
            System.out.println("FALSO");
        }

        System.out.println("+++Fin del programa+++");
    }
    public static boolean esPar(int num){
        if (num%2 ==0){
            return true;
        } else {
            return false;
        }
    }
}
