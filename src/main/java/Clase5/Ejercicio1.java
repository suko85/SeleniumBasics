package Clase5;

import java.util.Scanner;

public class Ejercicio1 {
     public static void main (String args[]){





         //DatosPersonales.calcularAñoNacimiento(edad);


         Scanner input = new Scanner(System.in);
         System.out.println("Ingrese su sueldo: ");
         int sueldo = input.nextInt();

         double ivaSueldo = CalcularImpuestos.calcularIVA(sueldo);
         double irpfSueldo = CalcularImpuestos.calcularIRPF(sueldo);
         System.out.println("Su sueldo es " + sueldo);
         System.out.println("Usted paga de IVA "+ ivaSueldo + "$");
         System.out.println("Usted paga de IRPF "+ irpfSueldo + "$");

     }
}
