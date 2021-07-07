package Clase8;

import Clase7.ejercicioColegio.Profesor;
import utilities.Constantes;
import utilities.JavaUtils;

public class ColegioBilingue {
    public static void main (String args[]){
        System.out.println("Porcentajes del IVA: " + Constantes.IVA);

        System.out.println("***Datos del alumno****");
        String nombreAlumno = JavaUtils.ingresarPalabras("Ingrese el nombre del alumno:");
        int edad = JavaUtils.ingresarNumero("Ingrese la edad del alumno:", "Edad invalida", 18, 90);
        int dni = JavaUtils.ingresarNumero("Ingrese el DNI del alumno:", "DNI invalido", 1000000, 50000000);
        System.out.println("Datos del alumno " + nombreAlumno + ", su edad es " + edad + " y su DNI es " + dni);

        Profesor profe1 = new Profesor();
        //nombre
        String nombreProfesor = JavaUtils.ingresarPalabras("Ingrese el nombre del profesor");
        // dni
        int dniProfesor  = JavaUtils.ingresarNumero("Ingrese el dni del profesor");
        //materia
        String materia = JavaUtils.ingresarPalabras("Ingrese la materia del profesor");

        profe1.setMateria(materia);
        profe1.setDni(dniProfesor);
        profe1.setNombre(nombreProfesor);
        System.out.println(profe1);




    }
}
