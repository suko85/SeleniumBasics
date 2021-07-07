package Clase8;

public class Direccion {

    String calle;
    String ciudad;

    public Direccion(){
        this.calle = "Indefinida";
        this.ciudad = "Sin definir";
    }

    public Direccion(String unaCalle, String unaCiudad){
        this.calle = unaCalle;
        this.ciudad = unaCiudad;
    }

    public String toString(){
        return "La direccion es " + this.calle + " y "+ this.ciudad;

    }
}
