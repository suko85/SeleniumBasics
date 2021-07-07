package Clase3;

import java.util.Scanner;

public class Practico3_Booleanos3 {
    //Método que retorne verdadero si el número recibido por parámetro es mayor a 18. De lo
    //contrario, se debe retornar falso.
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("+++Inicio del programa+++");
        System.out.println("Ingrese un número: ");
        int numero = input.nextInt();
        if (mayor18(numero)==true){
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
        System.out.println("+++Fin del programa+++");
    }
    public static boolean mayor18(int num){
        if (num>18){
            return true;
        } else {
            return false;
        }
    }
}
