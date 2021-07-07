package utilities;

import utilities.Constantes;

public class JavaUtils {


    public static String ingresarPalabras(String mensaje){
        System.out.println(mensaje);
        return Constantes.INPUT.nextLine();
    }

    public static int ingresarNumero(String mensaje){
        System.out.println(mensaje);
        int unNumero = Constantes.INPUT.nextInt();
        return unNumero;
    }

    public static int ingresarNumero(String mensaje, String mensajeError, int min, int max){
        System.out.println(mensaje);
        int num = Constantes.INPUT.nextInt();
        while (num < min || num > max){
            System.out.println(mensajeError);
            System.out.println("Ingrese un numero entre " + min + " y " + max);
            num = Constantes.INPUT.nextInt();
        }
        return num;
    }
}
