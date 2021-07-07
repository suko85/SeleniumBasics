package ConsultaPracticoClase6;

import java.util.Scanner;

public class DatosPersonales {

    public static void main (String args[]){

        Scanner input = new Scanner(System.in);
        int [] arregloEdades = new int [3];
        String [] arregloNombres = new String [3];
        String [] arregloPaises = new String [3];

        for (int i =0; i < 3; i++){
            System.out.println("Ingrese el nombre del usuario");
            arregloNombres[i] = input.next();
            System.out.println("Ingrese el pais del usuario");
            arregloPaises[i] = input.next();
            System.out.println("Ingrese la edad del usuario");
            arregloEdades[i] = input.nextInt();
          }
        System.out.println("*** Datos ingresados ***");
        for (int i = 0; i< 3; i++){
            System.out.println("El nombre es " + arregloNombres[i] + " de " + arregloPaises[i] + " con la edad " + arregloEdades[i] + " años.");
        }

    }
}
