package Clase2;

import java.util.Scanner;

public class Ejercicio16 {
    //16)Mostrar el resultado del examen:
    //a)Si la nota está entre 0 y 59 → Eliminado
    //b)Si la nota está entre 60 y 79 → Aprobado
    //c)Si la nota está entre 80 y 100 → Aprobado con Excelente
    //d)Si el numero esta fuera de 0 y 100, mostrar que se ha ingresado una nota invalida.

    public static void main(String args[]){
        int nota = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la nota del examen: ");
        nota = input.nextInt();
        if(nota>=0 && nota<=59){
            System.out.println("Eliminado.");
        }else if (nota>=60 && nota<=79){
            System.out.println("Aprobado.");
        }else if (nota>=80 && nota<=100){
            System.out.println("Aprobado con excelente.");
        }else if (nota<0 || nota>100){
            System.out.println("La nota ingresada es inválida.");
        }
    }
}
