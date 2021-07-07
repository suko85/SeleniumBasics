package Clase7.ejercicioColegio;

public class Colegio {

    public static void main(String args[]){

        Persona alumno1 = new Alumno();
        Persona alumno2 = new Alumno("Juan Perez", 1000, "Primero");

        Persona profe1 = new Profesor();
        Persona profe2 = new Profesor("Andres Lopez", 1000, "Quimica");

        System.out.println(alumno1);
        System.out.println(alumno2);
        System.out.println(profe1);
        System.out.println(profe2);



    }
}
