package Clase2;

import java.util.Scanner;

public class Ejercicio4 {
    // Pedir el ingreso de un dato, e indicar si es menor o mayor a 0.
         /* Int num = 0;
        TECLADO
        MOSTRAR “Ingrese un numero”;
        GUARDAR num;

        if ( num > 0 ) {
            MOSTRAR “El numero es mayor a 0”;
            MOSTRAR “El numero es “ + num;
        }
        else {
            MOSTRAR “El numero es menor a 0”;
        }*/
    public static void main(String args[]) {
        int num1 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num1 = input.nextInt();
        if (num1 > 0) {
            System.out.println("El numero es mayor a 0");
            System.out.println("El número es " + num1);
        } else if (num1<0){
            System.out.println("El numero es menor a 0");
        } else {
            System.out.println("El número es igual a 0");
        }
    }
}
