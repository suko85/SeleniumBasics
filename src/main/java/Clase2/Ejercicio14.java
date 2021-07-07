package Clase2;

import java.util.Scanner;

public class Ejercicio14 {
    //Pedir el ingreso de números hasta que se ingrese un 0. Mostrar la suma de ellos.
    public static void main (String args[]){
        int num = 0;
        int suma = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num = input.nextInt();
        while (num!=0){
            suma = suma + num;
            System.out.println("Ingrese otro número: ");
            num = input.nextInt();
         }
        System.out.println("La suma de los números es: "+ suma);
    }
}
