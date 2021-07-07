package Clase3;

import java.util.Scanner;

public class EjercicioVariables {
    private static final  int IVA = 22; // como es final no se va a modificar y por eso se puede declarar fuera del método main.
    public static void main (String args[]){
        System.out.println("El valor del IVA es " + IVA +"%.");

        boolean esMayor = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = input.nextInt();

        if (edad>=18){
            esMayor = true;
        }else {
            esMayor = false;
        }

        if (esMayor==false) {
            System.out.println("La persona no es mayor de edad.");
        }else{
            System.out.println("La persona es mayor de edad.");
        }

    }
}
