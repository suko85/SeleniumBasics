package Clase3;

import java.util.Scanner;

public class Practico3_Booleanos9 {
    //Dado una año de nacimiento, retorne verdadero si la persona tiene 18 años o mas, y
    //falso si han pasado menos años. Sugerencia: Usar una variable estática.
    public static int añoActual=2020;
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("+++Inicio del programa+++");
        System.out.println("Ingrese su año de nacimiento: ");
        int añoNacimiento = input.nextInt();
        if (mayorEdad(añoNacimiento)==true){
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
        System.out.println("+++Fin del programa+++");
    }
    public static boolean mayorEdad(int num){
        if ((añoActual-num)>=18){
            return true;
        }else {
            return false;
        }
    }
}
