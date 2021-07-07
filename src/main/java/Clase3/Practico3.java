package Clase3;

import java.util.Scanner;

public class Practico3 {

    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        //mayorA20(22);

        System.out.println("Inicio de programa");
        System.out.println("Ingrese un numero: ");
        int numero1 = input.nextInt();
        //System.out.println("Ingrese otro numero:");
        //int numero2 = input.nextInt();



        //int mayor = obtenerMayor(numero1, numero2);
        //System.out.println("El mayor numero es " + mayor);

        sumatoria(numero1);

        System.out.println("Fin del programa");
    }



    //Método que reciba un numero entero e imprima en pantalla en caso de ser mayor a 20, "Es mayor a 20", contrario "No es mayor a 20."
    public static void mayorA20(int num){
        if (num>20){
            System.out.println("Es mayor a 20.");
        }else {
            System.out.println("No es mayor a 20.");
        }
    }

    //Metodo que reciba dos enteros y retorne la multiplicacion de la misma.
    public static int multiplicar (int num1, int num2){
        return num1 * num2;
    }

    //Realizar un método que reciba dos números y retorne el mayor de ambos.
    public static int obtenerMayor(int num1, int num2){
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }

    //Crear un metodo que reciba un numnero entero n y muestre la suma desde 1 hasta n.

    public static void sumatoria (int n){
        int suma = 0;
        if (n<0){
            System.out.println("Debe ingresar un número positivo!!");
        } else{
            for (int i=1;i<=n;i++){
                suma = suma + i;
            }
            System.out.println("La sumatoria de 1 hasta "+ n +" es: " + suma);
        }
        }

}
