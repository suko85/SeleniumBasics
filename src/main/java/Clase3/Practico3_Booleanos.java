package Clase3;

import java.util.Scanner;

public class Practico3_Booleanos {

    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
/*        System.out.println("Ingrese el primer número: ");
        int primerNumero = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int segundoNumero = input.nextInt();*/
        System.out.println("Ingrese su edad: ");
        int edadUsuario = input.nextInt();

/*        //System.out.println(esMayor);
        if (primerNumero==segundoNumero){
            System.out.println("Los numeros son iguales.");
        }else {
            boolean esMayor = esPrimeroMayorQueSegundo(primerNumero,segundoNumero);
            if (esMayor==true){
                System.out.println("El primer numero es mayor que el segundo.");
            }else {
                System.out.println("El segundo numero es el mayor!!");
            }
        }*/
 /*       boolean esMayor = esMayorA18(edadUsuario);
        if (esMayor == true){
            System.out.println("Usted es mayor de edad.");
        } else{
            System.out.println("Usted es menor de edad.");
        }*/
/*   boolean edadImpar = esImpar(edadUsuario);
   if (edadImpar == true){
       System.out.println("Su edad es impar");
   }else {
       System.out.println("Su edad es par.");
   }*/
       boolean imparMayorA20 = esImparYMayorA20(edadUsuario);
       if (imparMayorA20 == true){
           System.out.println("Su edad es impar y mayor a 20.");
       }else {
           System.out.println("Su edad es menor a 20.");
       }
    }

    // Metodo que reciba dos numertos y retorne verdadero si el primero es mayor que el segundo,
    // de lo contrario devolver falso.

    public static boolean esPrimeroMayorQueSegundo(int num1, int num2){
        if (num1 > num2){
            return true;
        }else {
            return false;
        }
    }

    //Dado un número, retorne verdadero si el numero es menor a 0.
    public static boolean esMenorACero(int num){
        if (num<0){
            return true;
        }else {
            return false;
        }
    }

    //Metodo que retorne verdadero si el numero recibido por parametro es mayor a 18.
    // De lo contrario retornar falso.
    public static boolean esMayorA18(int edad){
        if (edad>=18){
            return true;
        }else {
            return false;
        }
    }
    //Realizar un metodo que retorne verdadero si el numero recibido es impar.
    public static boolean esImpar(int numero){
        if (numero % 2 == 0){ // verifica que el numero es par.
            return false;
        }else {
            return true;
        }
    }

    //Realizar un metodo que retorne verdadero si l numero recibido por parametro es impar y mayor a 20.
    public static boolean esImparYMayorA20(int numero){
        if (numero % 2 == 1 && numero>20){
            return true;
        }else {
            return false;
        }
    }


}
