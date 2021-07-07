package utilities;

import java.util.ArrayList;

public class ArrayListUtils {
    // esta clase maneja las listas...

    public static void imprimirListaEnteros(ArrayList<Integer> listaEnteros){

        if (listaEnteros.isEmpty()== true){
            System.out.println("La lista est'a vacia!!");
        } else {
            for (int i = 0; i < listaEnteros.size(); i++){
                System.out.println("-> " + listaEnteros.get(i));
            }
        }
    }

    public static void imprimirListaString(ArrayList<String> listaStrings){

        if (listaStrings.isEmpty()== true){
            System.out.println("La lista esta vacia!! o no hay elementos");
        } else {
            for (int i = 0; i < listaStrings.size(); i++){
                System.out.println("-> " + listaStrings.get(i));
            }
        }
    }
}
