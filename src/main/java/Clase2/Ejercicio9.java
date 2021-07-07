package Clase2;

import java.util.Scanner;

public class Ejercicio9 {
    //Programa Java que pida un número NUM ingresado por el usuario. Luego muestre los números desde 1 hasta NUM utilizando la instrucción for.
    public static void main (String args[]){
        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num = input.nextInt();
        for (int i=0; i<=num;i++){
            System.out.println(i);
        }
    }
}
