package Clase8;

import java.util.Scanner;

public class ManejoDeExcepciones {

    public static void main(String args[]){
        Scanner input  = new Scanner(System.in);
        int num = 99;
        int suma = 0;
        int contador = 0;
        System.out.println("Ingrese un número:");
        num = input.nextInt();

           while (num !=0){
               suma = suma + num;
               contador++;

               System.out.println("Ingrese otro número: (0 para salir)");
               num = input.nextInt();
           }
           double promedio = 0;
           //promedio = 0 / 0;
           try{
               promedio = suma / contador;
           }catch (ArithmeticException unaExcepcion){
               System.out.println("Ha ocurrido una excepcion de tipo aritmética" + unaExcepcion.getMessage());
           }
           catch (Exception e){
               System.out.println("Ha ocurrido una excepcion" + e.getMessage());
           }
        System.out.println("El promedio es " + promedio);
        System.out.println("El programa ha finalizado");
    }

}
