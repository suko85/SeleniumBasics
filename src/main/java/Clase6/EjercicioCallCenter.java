package Clase6;

import utilities.JavaUtils;

import java.util.Scanner;

public class EjercicioCallCenter {

    // Horario de 0 a 8 AM
    // guardar las llamadas por hora que tuvo el operario.
    //mostrar la hora que tuvo más llamadas.
    //mostrar la hora que tuvo menos llamadas.

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // 0 1 2 3 4 5 6 7
        int[] llamadasPorHora = new int[8];

        for (int i = 0; i < llamadasPorHora.length; i++) {
            //System.out.println("Ingrese la cantidad de llamadas de la hora " + i);
            llamadasPorHora[i] = JavaUtils.ingresarNumero("Ingrese las llamadas de la hora" + i, "Llamadas incorrectas", 3, 9);

        }
        imprimirArregloEntero(llamadasPorHora, " las llamadas fueron: ");

        obtenerHoraConMayorCantidadDeLlamadas(llamadasPorHora);
    }

    public static void imprimirArregloEntero(int[] arreglo, String unMensaje) {
        for (int pos = 0; pos < arreglo.length; pos++) {
            System.out.println("A las " + pos + unMensaje + ": " + arreglo[pos]);
        }
    }

    public static void obtenerHoraConMayorCantidadDeLlamadas(int [] llamadasPorHora){

        int cantidadMaximaLlamadas = 0;
        int horaMasOcupada = 0;
        for (int i = 0; i < llamadasPorHora.length; i++){
            if (llamadasPorHora[i] > cantidadMaximaLlamadas){
                cantidadMaximaLlamadas = llamadasPorHora[i];
                horaMasOcupada = i;
            }
        }
        System.out.println("La mayor cantidad de llamadas fueron "+ cantidadMaximaLlamadas + " a la hora "+ horaMasOcupada);
    }

}
