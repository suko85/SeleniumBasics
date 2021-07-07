package ConsultaPracticoClase6;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main (String args[]){
        int [] arregloNumeros = new int[5];
        arregloNumeros[0] = 1;
        arregloNumeros[1] = 3;
        arregloNumeros[2] = 5;
        arregloNumeros[3] = 7;
        arregloNumeros[4] = 9;

        boolean existeElemento = buscarElemento(arregloNumeros);
        if (existeElemento == true){
            System.out.println("El elemento se encuentra en el arreglo.");
        } else {
            System.out.println("El elemento no se encuentra en el arreglo.");
        }
    }

    public static boolean buscarElemento(int [] arrEnteros){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = input.nextInt();

        for (int i = 0; i < arrEnteros.length; i++){
            if (arrEnteros[i] == num){
                return true;
            }
        }
        return false;

    }
}
