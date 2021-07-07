package Clase6;

import utilities.ArrayListUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosConListas {

    public static void main (String args[]){
        Scanner input  = new Scanner(System.in);
        ArrayList<String> listaNombres = new ArrayList<String>();
        ArrayList<Integer> listaDNI = new ArrayList<Integer>();
        listaDNI.add(44444);
        listaDNI.add(55555);

        System.out.println("Está vacía? " + listaNombres.isEmpty());

        listaNombres.add("John");
        listaNombres.add("Kate");
        listaNombres.add("Brianne");
        listaNombres.add("Alan");

        ArrayListUtils.imprimirListaString(listaNombres);

        System.out.println("Borrando.......");
        listaNombres.remove(2);
        ArrayListUtils.imprimirListaString(listaNombres);

        System.out.println("Clear ....");
        listaNombres.clear();
        ArrayListUtils.imprimirListaString(listaNombres);

        //System.out.println("Está vacía? " + listaNombres.isEmpty());
        //System.out.println(listaNombres);

        System.out.println("Ingrese una posición ");
        int pos = input.nextInt();
        String nombre = listaNombres.get(pos);
        System.out.println("El nombre es " + nombre);

        System.out.println("Ingrese un nombre: ");
        String unNombre = input.next();
        int posicion = listaNombres.indexOf(unNombre);
        if (posicion == -1) {
            System.out.println("Este nombre no esta en la lista");
        } else{
            System.out.println(unNombre + " esta en la posicion " + posicion);
        }
        //System.out.println(listaNombres.indexOf(unNombre));


        //System.out.println(unNombre + " esta en la posicion " + listaNombres.indexOf(unNombre));
    }

    public static void imprimirListaString(ArrayList<String> listaStrings) {
        if (listaStrings.isEmpty() == true) {
            System.out.println("la lista esta vacia");
        } else {
            System.out.println("Elementos de la lista");
            for (int i = 0; i < listaStrings.size(); i++) {
                System.out.println("******" + listaStrings.get(i));
            }
        }
    }
}
