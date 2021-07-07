package Practico7.ejercicio1;

public class Manager extends Empleado {
    private String area;

    public Manager(){
        this.area = "Sin definir";
    }

    public Manager(String unArea){
        this.area = unArea;
    }

    public String getArea(){
        return this.area;
    }

    public void setArea(String suArea){
        this.area = suArea;
    }

    public String toString(){
        return "El manager pertenece al área " + this.getArea();
    }
}
