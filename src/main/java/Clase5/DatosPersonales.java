package Clase5;

import java.util.Scanner;

public class DatosPersonales {

    public static String pedirNombrePersona() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = input.next();
        return nombre;
    }

    public static String pedirApellidoPersona() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su apellido:");
        String apellido = input.next();
        return apellido;
    }

    public static int pedirEdadPersona() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        int edad = input.nextInt();
        return edad;
    }
    public static void calcularAñoNacimiento(int edad){
        int año = 2020 - edad;
        System.out.println("Usted nació en el año " + año);
    }


}
