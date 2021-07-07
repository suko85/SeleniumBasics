package Clase3;

import java.util.Scanner;

public class Practico3_Metodos7 {
    //Crear un método que reciba un número entero n, y muestre en pantalla la suma
    //desde 1 hasta ese número n. Ej. Si “n” es 4, se debe mostrar en pantalla 10.
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("+++Inicio del programa+++");
        System.out.println("Ingrese un número: ");
        int numero = input.nextInt();
        int sumatoria = obtenerSumatoria(numero);
        System.out.println("La sumatoria del número ingresado es: " + sumatoria);
        System.out.println("+++Fin del programa+++");
    }
    public static int obtenerSumatoria (int num){
        int i = 0;
        int sum = 0;
        while (i<=num){
            sum = sum + i;
            i++;
        }
        return sum;
    }

}
