package Practico5;

import java.util.Scanner;

public class CalcularImpuestos {

    public static double calcularIva(){
        Scanner input =  new Scanner(System.in);
        System.out.println("Ingrese su sueldo: ");
        int sueldo = input.nextInt();
        double iva = sueldo * Constantes.IVA;
        return iva;
    }

    public static double calcularIRPF(){
        Scanner input =  new Scanner(System.in);
        System.out.println("Ingrese su sueldo: ");
        int sueldo = input.nextInt();
        double irpf = sueldo * 0.25;
        return irpf;
    }
}
