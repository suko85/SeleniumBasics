package Practico5;

import java.util.Scanner;

public class PedirDatosPersonales {

    public static String pedirNombrePersona() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nombre = input.next();
        return nombre;
    }
    public static String pedirApellidoPersona(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un apellido: ");
        String apellido = input.next();
        return apellido;
    }
    public static int pedirEdadPersona(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una edad: ");
        int edad = input.nextInt();
        return edad;
    }


}
