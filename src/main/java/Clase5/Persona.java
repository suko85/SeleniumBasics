package Clase5;

public class Persona {

    //atributos de la persona.
    private String nombre;
    private String apellido;
    private int edad;

    //Método Constructor. Este metodo crea los objetos, le da un lugar en memoria.
    public Persona(){
        this.nombre = "Desconocido";
        this.apellido = "";
        this.edad = 0;
    }
    public Persona(String unNombre, String unApellido, int unaEdad){
        this.nombre = unNombre;
        this.apellido = unApellido;
        this.edad = unaEdad;
    }

    public String getNombre(){
     return this.nombre;
    }
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }

    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String unApellido){
        this.apellido = unApellido;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int unaEdad){
        this.edad = unaEdad;
    }

    public void mostrarDatosPersona(){
        System.out.println("Su nombre es " + this.nombre + " " + this.apellido + " y tiene " + this.edad + " años");
    }

    //cada vez que se llame a System.out.println, se invocará este toString, y su contenido es lo que imprimirá.
    public String toString(){
        String retorno = "Su nombre es " + this.nombre + " " + this.apellido + " y tiene " + this.edad + " años";
        if(this.esMayorDeEdad() == true){
            retorno = retorno + "La persona es mayor de edad";
        } else {
            retorno = retorno + "La persona NO es mayor de edad";
        }
        return retorno;
    }

    public boolean esMayorDeEdad(){
        if (this.edad>=18){
            return true;
        }else{
            return false;
        }
    }
}
