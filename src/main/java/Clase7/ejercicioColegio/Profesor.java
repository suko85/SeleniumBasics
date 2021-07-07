package Clase7.ejercicioColegio;

import Clase7.ejercicioColegio.Persona;

public class Profesor extends Persona {

    private String materia;

    public Profesor(){
        this.nombre = "Sin ingresar";
        this.dni = 0;
        this.materia = "Sin definir";
    }

    public Profesor(String unNombre, int unDNI, String unaMateria){
        this.nombre = unNombre;
        this.dni = unDNI;
        this.materia = unaMateria;
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
    public void setMateria(String unaMateria){
        this.materia = unaMateria;
    }
    public String getMateria(){
        return this.materia;
    }

    public String toString(){
        return "Profesor: " + this.getNombre() + " con DNI " + this.getDni() + " y materia " + this.getMateria();
    }


}
