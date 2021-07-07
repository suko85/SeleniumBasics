package Practico5;

public class AdministarPersonas {
    public static void main (String args[]){

        String unNombre = PedirDatosPersonales.pedirNombrePersona();
        String unApellido = PedirDatosPersonales.pedirApellidoPersona();
        int unaEdad = PedirDatosPersonales.pedirEdadPersona();


        Persona persona1  = new Persona(unNombre, unApellido, unaEdad);
        System.out.println("La persona 1 ingresada es: " + unNombre + " " + unApellido + " y tiene " + unaEdad + " años.");

        Persona persona2 = new Persona();
        persona2.setNombre("Guillermo");
        persona2.setApellido("Gómez");
        persona2.setEdad(65);
        System.out.println("La persona 2 es: " + persona2.getNombre() + " " + persona2.getApellido() + " y tiene " + persona2.getEdad() + " años." );
    }
}
