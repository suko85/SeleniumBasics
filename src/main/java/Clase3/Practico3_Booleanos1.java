package Clase3;

import java.util.Scanner;

public class Practico3_Booleanos1 {
    //Método que reciba dos números y retorne verdadero si el primer numero es mayor que
    //el segundo. De lo contrario, retornar debe retornar falso.
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("+++Inicio del programa+++");
        System.out.println("Ingrese un número:");
        int numero1 = input.nextInt();
        System.out.println("Ingrese otro número:");
        int numero2 = input.nextInt();
        boolean resultado = esMayor(numero1,numero2);
        if (resultado==true){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }
        System.out.println("+++Inicio del programa+++");
    }
    public static boolean esMayor(int num1, int num2) {

            if (num1 > num2) {
                return true;
            } else {
                return false;
            }
        }
}
