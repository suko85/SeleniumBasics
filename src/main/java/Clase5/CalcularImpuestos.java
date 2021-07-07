package Clase5;

public class CalcularImpuestos {

    public static double calcularIVA(int unSueldo){
        double calculoIva = unSueldo * Constantes.IVA;
        return calculoIva;
    }

    public static double calcularIRPF(int unSueldo){
        double calculoIRPF = 0;
        if (unSueldo<= 20000){
            calculoIRPF = unSueldo * 0.10;
        } else if (unSueldo<=40000){
            calculoIRPF = unSueldo * 0.20;
        } else {
            calculoIRPF = unSueldo * 0.25;
        }
        return calculoIRPF;
    }

}
