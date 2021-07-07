package Practico7.ejercicio1;

public class Developer extends Empleado {
    private String lenguaje;

    public Developer(){
        this.lenguaje = "Sin definir";
    }

    public Developer(String unLenguaje){
        this.lenguaje = unLenguaje;
    }

    public void setLenguaje(String suLenguaje){
        this.lenguaje = suLenguaje;
    }

    public String getLenguaje(){
        return this.lenguaje;
    }

    public String toString(){
        return "Su lenguaje de programación es " + this.getLenguaje();
    }


}
