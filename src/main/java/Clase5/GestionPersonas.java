package Clase5;

import com.sun.deploy.perf.PerfRollup;

public class GestionPersonas {
    public static void main (String args[]){

        /*String nombrePersona = DatosPersonales.pedirNombrePersona();
        String apellido = DatosPersonales.pedirApellidoPersona();
        int edad = DatosPersonales.pedirEdadPersona();
        System.out.println("Su nombre es "+ nombrePersona + " " + apellido + " y su edad es " + edad);

        Persona persona1 = new Persona(nombrePersona, apellido, edad);
        System.out.println("Datos de la persona 1");
        persona1.mostrarDatosPersona();

        Persona persona2 = new Persona();
        System.out.println("Datos de la persona 2");
        persona2.mostrarDatosPersona();*/

        Persona persona3 = new Persona();
        System.out.println("Datos de la persona 3 ANTES DE MODIFICAR: ");
        System.out.println(persona3.getNombre());
        System.out.println(persona3.getApellido());
        System.out.println(persona3.getEdad());

        //persona3.mostrarDatosPersona();
        persona3.setNombre("Luis");
        persona3.setApellido("Smith");
        persona3.setEdad(50);
        System.out.println("Datos de la persona 3 DESPUES DE MODIFICAR: ");
        System.out.println(persona3.getNombre());
        System.out.println(persona3.getApellido());
        System.out.println(persona3.getEdad());

        System.out.println("**********************");
        System.out.println(persona3);
//        if(persona3.esMayorDeEdad(persona3.getEdad()) == true){
//            System.out.println("La persona es mayor de edad.");
//        } else {
//            System.out.println("La persona NO es mayor de edad.");
//        }
    }
}
