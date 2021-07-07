package Clase2;

public class Ejercicio27 {
    //27)Mostrar por pantalla cuantos multiplos de 3 existen entre el 10 y el 70.
    public static void main(String args[]){
        for (int i=10; i<=70; i++){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}
