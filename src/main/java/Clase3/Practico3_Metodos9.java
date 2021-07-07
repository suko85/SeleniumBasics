package Clase3;

import java.util.Scanner;

public class Practico3_Metodos9 {
    //Crear un método que permita reciba el radio de un círculo, y retorne su area
    //(radio^2)*PI (utilizar una variable estática para el valor de PI)
    public static final double PI = 3.14;
    public static void main (String arg[]){
        Scanner input = new Scanner(System.in);
        System.out.println("+++Inicio del programa+++");
        System.out.println("Ingrese el radio del círculo: ");
        double radio = input.nextInt();
        System.out.println("El área del círculo es: "+ areaCirculo(radio));
        System.out.println("+++Fin del programa+++");
    }
    public static double areaCirculo(double radio){
        return radio*radio*PI;
    }
}
