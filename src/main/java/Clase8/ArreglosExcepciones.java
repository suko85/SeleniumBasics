package Clase8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArreglosExcepciones {

    public static void main (String args[]){
        // [0] [1] [2] [3]
        int [] arregloNumeros = new int [4];
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una edad: ");

        try {
            int edad = input.nextInt();
            System.out.println("Su edad es " + edad);
        } catch (InputMismatchException ex){
            System.out.println("Ha ocurrido un error. Se esperaba un numero, se ingreso una palabra");
        } catch (Exception e){
            System.out.println("Ha ocurrido una excepcion " + e.getMessage());
        }

        try{
            for (int i = 0; i <= arregloNumeros.length; i++) {
                System.out.println("Posicion " + i + " es " + arregloNumeros[i]);
            }
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Se trato de acceder a una posicion inexistente.");
        }
        catch (Exception e){
            System.out.println("Ha ocurrido un error!!" + e.getMessage());
        }

        System.out.println("Fin del programa");
    }
}
