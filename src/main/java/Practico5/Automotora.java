package Practico5;

import java.util.Scanner;

public class Automotora{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba la chapa del camión: ");
        int chapa = input.nextInt();
        System.out.println("Escriba el color del camión: ");
        String color = input.next();
        System.out.println("Escriba el año de compra del camión: ");
        int añoCompra = input.nextInt();

        //Camión 1.
        Camion camion1 = new Camion();
        int matricula = camion1.getChapa();
        String color1 = camion1.getColor();
        System.out.println("El camión 1 tiene chapa " + matricula + " y color " + color1 + ".");

        //Camión2.
        Camion camion2 = new Camion(369852);
        int chapa2 = camion2.getChapa();
        String color2 = camion2.getColor();
        System.out.println("El camión 2 tiene chapa " + chapa2 + " y color " + color2 + ".");

        //Camión3.
        Camion camion3 = new Camion(chapa, color, añoCompra);
        //System.out.println("El camión 3 tiene número de chapa " + camion3.getChapa() + "y color " + camion3.getColor() + " y su año de fabricación es " + camion3.getAñoCompra() + ".");
        System.out.println(camion3);

    }

}
