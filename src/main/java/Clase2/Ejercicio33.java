package Clase2;

import java.util.Scanner;

public class Ejercicio33 {
      // Pedir numeros hasta que haya uno negativo. Indicar el promedio de todos los numeros ingresados.
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = input.nextInt();
        int suma = 0;
        int cantNum = 0;
        suma = suma + num;
        cantNum++;
        while (num>=0){
            System.out.println("Ingrese otro número: ");
            num = input.nextInt();
        }
        float promedio = 0;
        if (cantNum>0){
            promedio = suma/cantNum;
            System.out.println("El promedio es " + promedio);
        } else {
            System.out.println("El promedio es 0!");
        }
        System.out.println("El programa ha finalizado.");
    }
}
