package Practico5;

public class Camion {
    public int chapa;
    public String color;
    public int añoCompra;

    public int getChapa(){
        return this.chapa;
    }
    public void setChapa(int unaChapa){
        this.chapa = unaChapa;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String unColor){
        this.color = unColor;
    }
    public int getAñoCompra(){
        return this.añoCompra;
    }
    public void setAñoCompra(int unAño){
        this.chapa = unAño;
    }

    //Constructor sin parámetros.
    public Camion(){
        this.chapa = 1234;
        this.color = "Azul";
    }

    //Constructor con parámetro  chapa.
    public Camion(int matricula){
        this.chapa = matricula;
        this.color = "Verde";
    }

    //Constructor con parámetros chapa, color y año.
    public Camion(int matricula, String color, int año){
        this.chapa = matricula;
        this.color = color;
        this.añoCompra = año;
    }

    public String toString(){
        String textoAImprimir = "El camión con matrícula " + this.chapa + " tiene color " + this.color + ", se compró en el año " + this.añoCompra;
        if (leTocaRevision() == true){
          return textoAImprimir = textoAImprimir + " y necesita revisión.";
        } else {
            return textoAImprimir = textoAImprimir + " y no necesita revisión.";
        }
    }

    public boolean leTocaRevision(){
        if (añoCompra < 2015 ){
            return true;
        }
        return false;
    }
}
