package Clase2;

public class Ejercicio28 {
    //28)Calcula el factorial del número 5.
    public static void main(String args[]){
        int fact = 1;
        for (int i=1; i<=5;i++){
            fact = fact*i;
        }
        System.out.println("El factorial de 5 es: "+ fact);
    }
}
