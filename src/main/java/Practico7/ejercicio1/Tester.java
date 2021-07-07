package Practico7.ejercicio1;

public class Tester extends Empleado {
   private boolean esManual;
   private boolean esAuto;

   public Tester(){
       this.esAuto = false;
       this.esManual = true;
   }

   public Tester(boolean esTesterManual, boolean esTesterAuto){
       this.esManual = esTesterManual;
       if (esTesterAuto == true){
           esTesterManual = true;
       }
       this.esAuto = esTesterAuto;

   }
    public void setEsManual(boolean esManual){
        if (this.esAuto == false){
            this.esManual = esManual;
        } else {
            this.esManual = true;
        }

    }

    public boolean getEsManual(){
        return this.esManual;
    }

    public void setEsAuto(boolean esAutomatizador){
       if (esAutomatizador == true){
         this.esManual = true;
       }
        this.esAuto = esAutomatizador;
    }
    public boolean getEsAuto(){
        return this.esAuto;
    }

    public String toString(){
       String unRetorno = "";
       if (this.esAuto == true){
           unRetorno = unRetorno + " es automatizador.";
       } else{
           unRetorno = unRetorno + " no es automatizador";
       }
        if (this.esManual == true){
            unRetorno = unRetorno + " es manual";
        } else{
            unRetorno = unRetorno + " no es manual";
        }
        return unRetorno;
   }
}
