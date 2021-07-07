package Clase3;

import java.util.Scanner;

public class Practico3_Booleanos8 {
    //Realizar un método llamado esMayor que reciba un número, y retorne verdadero si el
    //número es mayor a 0, de lo contrario, se debe retornar falso. Luego, solicitar al usuario
    //que ingrese un número. Sii es positivo, se debe imprimir: “El número es positivo”, de lo
    //contrario, “El número es negativo” (Se debe utilizar el método realizado anteriormente)

    public static void main (String args []){
        Scanner input = new Scanner(System.in);
        System.out.println("+++Inicio del programa+++");
        System.out.println("Ingrese un número: ");
        int numero1 = input.nextInt();
        boolean esMayorACero = esMayor(numero1);
        if (esMayorACero == true) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
        System.out.println("+++Fin del programa+++");
    }
    public static boolean esMayor(int num) {
        if (num > 0) {
            return true;
        } else  {
            return false;
        }
    }
}
