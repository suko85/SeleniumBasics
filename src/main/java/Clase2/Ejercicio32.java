package Clase2;

public class Ejercicio32 {
    //32)Mostrar los múltiplos de 9 entre 0 y 100 que sean impares.
    public static void main(String args[]){
        int num = 0;
        while (num>=0 || num<=100){
            if (num%9==0){
                System.out.println(num);
                num++;
            }
        }
    }
}
