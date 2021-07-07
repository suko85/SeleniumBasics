package Clase2;

public class Ejercicio24 {
    //24)Que pasaria si el for comienza en 0 en vez de 10?
    public static void main(String args[]){
        for (int i=0; i<=40;i++){
            if (i%3==0){
                System.out.println(i + " El número es impar y multiplo de 3.");
            }
        }
    }
}
