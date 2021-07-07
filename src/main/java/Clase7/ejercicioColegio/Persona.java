package Clase7.ejercicioColegio;

public class Persona {
    protected String nombre;
    protected int dni;

    public Persona (){
        this.nombre = "Nombre Sin definir";
        this.dni = 1000;
    }
    public Persona (String unNombre, int unDNI){
        this.nombre = unNombre;
        this.dni = unDNI;
    }

    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setDni(int unDNI){
        this.dni = unDNI;
    }
    public int getDni(){
        return this.dni;
    }

}
