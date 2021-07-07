package Clase7.ejercicioColegio;

public class Alumno extends Persona {


    private String año;

    public Alumno(){
        this.nombre = "Sin ingresar";
        this.dni = 0;
        this.año = "Sin definir";
    }

    public Alumno(String unNombre, int unDNI, String unAño){
        this.nombre = unNombre;
        this.dni = unDNI;
        this.año = unAño;
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
    public void setAño(String unAño){
        this.año = unAño;
    }
    public String getAño(){
        return this.año;
    }

    public String toString(){
        return "Alumno: " + this.getNombre() + " con DNI " + this.getDni() + " y año " + this.getAño();
    }


}
