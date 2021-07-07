package Clase2;

import java.util.Scanner;

public class Ejercicio15 {
    // 15)Pedir el ingreso de números hasta que se ingrese un 0. Mostrar el promedio de ellos.
    public static void main (String args[]){
        int num = 0;
        int cont = 0;
        int suma = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num = input.nextInt();
        while (num!=0){
            suma = suma + num;
            cont++;
            System.out.println("Ingrese otro número: ");
            num = input.nextInt();
        }
        if (cont>0){
            System.out.println("El promedio de los números ingresados es: "+ suma / cont);
        } else {
            System.out.println("El promedio es 0.");
        }
    }
}
