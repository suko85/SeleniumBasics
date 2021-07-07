package Clase2;

public class Ejercicio21 {
  //Mostrar los números pares del 1 al 4000
    public static void main (String args[]){
        for (int i=0; i <= 4000; i++){
            if (i % 2 ==0){// si la división entre 2 tiene resto 0, el número es par.
                System.out.println(i +" es un número par");
            } else {
                System.out.println(i+ " es un número impar");
            }
        }
    }
}
