package Clase3;

import java.util.Scanner;

public class Practico3_Booleanos6 {
    //Realizar un método llamado esPrimo que reciba un número, y retorne true si solo si el
    //número es primo (es divisible entre si, y la unidad)
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("+++Inicio del programa+++");
        System.out.println("Ingrese un número: ");
        int numero = input.nextInt();

        System.out.println("+++Fin del programa+++");
    }
    public static boolean esPrimo(int num){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=num)){
            if (num % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }
}
