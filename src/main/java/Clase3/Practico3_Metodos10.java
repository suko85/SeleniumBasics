package Clase3;

import java.util.Scanner;

public class Practico3_Metodos10 {
    //Crear un método que permita recibir el alto y ancho de un paralelogramo tipo, y
    //retorne su area.
    public static void main (String arg[]){
        Scanner input = new Scanner(System.in);
        System.out.println("+++Inicio del programa+++");
        System.out.println("Ingrese el alto del paralelogramo: ");
        double alto = input.nextInt();
        System.out.println("Ingrese el ancho del paralelogramo: ");
        double ancho = input.nextInt();
        System.out.println("El área del paralelogramo es: " + areaParalelogramo(alto,ancho));
        System.out.println("+++Fin del programa+++");
    }
    public static double areaParalelogramo(double alto, double ancho){
        return alto*ancho;
    }
}
