package Clase3;

import java.util.Scanner;

public class Practico3_Boolean10 {
    //Dado un número, un máximo y un mínimo (recibido por parámetro), retorne verdadero si
    //el número esta dentro del máximo y el mínimo. Si el número se encuentra dentro del
    //max y min, el programa debe mostrar “El numero es valido” sino, se debe retornar, “El
    //numero esta fuera de rango.”
    public static int max=100;
    public static int min=5;

    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("+++Inicio del programa+++");
        System.out.println("Ingrese un número: ");
        int numero = input.nextInt();
        if (enRango(numero)==true){
            System.out.println("El número es válido.");
        } else{
            System.out.println("El número está fuera de rango.");
        }

        System.out.println("+++Fin del programa+++");
    }
    public static boolean enRango(int num){
        if (min <= num && max >= num){
            return true;
        } else {
            return false;
        }
    }

}
