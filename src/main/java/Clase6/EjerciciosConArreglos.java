package Clase6;

import java.util.Scanner;

public class EjerciciosConArreglos {

    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        int [] edades = new int[5];
        //Double [] temperatura = crearArregloDouble[18];
        String [] diasSemana = crearArregloString(7);
        String [] meses = crearArregloString(12);

        System.out.println("Datos del array");
        edades[2] = 19;
        edades[3] = 22;

        System.out.println("*********DIASSEMANA**********");

        diasSemana[0] = "Domingo";
        diasSemana[1] = "Lunes";
        diasSemana[2] = "Martes";
        diasSemana[3] = "Miercoles";
        diasSemana[4] = "Jueves";
        diasSemana[5] = "Viernes";
        diasSemana[6] = "Sábado";

        imprimirArreglo(diasSemana);

        System.out.println("Ingrese el largo del arreglo:");
        int unLargo = input.nextInt();
        String [] nombreAlummos = crearArregloString(unLargo);

        System.out.println("El largo del arreglo de alumnos es " + nombreAlummos.length);



       /* System.out.println("*********EDADES**********");


        for (int i = 0; i< edades.length; i++){
            System.out.println("Ingrese una edad:");
            edades[i] = input.nextInt();
        }

        imprimirArreglo(edades);

        for (int i = 0; i< edades.length; i++){
            System.out.println("Posición "+ i + " es " + edades[i]);
        }*/
    }

    public static String [] crearArregloString (int largo){
        String [] arregloStrings = new String[largo];
        return arregloStrings;
    }
    public static Double[] crearArregloDouble (int largo){
        Double [] arregloDouble = new Double[largo];
        return arregloDouble;
    }

    public static void imprimirArreglo(String[] arreglo){
        for (int pos = 0; pos< arreglo.length; pos++){
            System.out.println("La posición " + pos + " es " + arreglo[pos]);
        }
    }

    public static void imprimirArreglo(int[] arreglo){
        for (int pos = 0; pos< arreglo.length; pos++){
            System.out.println("La posición " + pos + " es " + arreglo[pos]);
        }
    }



}
