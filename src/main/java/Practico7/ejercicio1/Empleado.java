package Practico7.ejercicio1;

public class Empleado {

    private String nombre;
    private int telefono;
    private int sueldo;

    public Empleado(){
        this.nombre = "Sin definir";
        this.telefono = 0;
        this.sueldo = 20000;
    }

    public Empleado(String unNombre, int unTelefono, int unSueldo){
        this.nombre = unNombre;
        this.telefono = unTelefono;
        this.sueldo = unSueldo;
    }

    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int unTelefono){
        this.telefono = unTelefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

    public void setSueldo(int unSueldo){
        this.sueldo = unSueldo;
    }
    public int getSueldo(){
        return this.sueldo;
    }

    public String toString(){
        return "El empleado " + this.getNombre() + " gana " + this.getSueldo() + " y su telefono es " + this.getTelefono();
    }


}
