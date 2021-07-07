package Clase3;

import java.util.Scanner;

public class Practico3_Booleanos7 {
    //Realizar un método que reciba dos números enteros y retorne verdadero si la suma es
    //mayor a 100. De lo contrario, debe retornar falso.
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("+++Inicio del programa+++");
        System.out.println("Ingrese un número: ");
        int numero1 = input.nextInt();
        System.out.println("Ingrese otro número: ");
        int numero2 = input.nextInt();
         if (suma100(numero1, numero2)){
             System.out.println("Verdadero");
         } else {
             System.out.println("Falso");
         }
        System.out.println("+++Fin del programa+++");
    }
    public static boolean suma100(int num1, int num2){
        if ((num1+num2)>100){
            return true;
        } else {
            return false;
        }
    }
}
