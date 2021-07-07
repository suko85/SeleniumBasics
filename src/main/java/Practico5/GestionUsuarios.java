package Practico5;

public class GestionUsuarios {

    public static void main (String args[]){
        DatosPersonales.mostrarDatosPersona();

        double iva = CalcularImpuestos.calcularIva();
        System.out.println("Su impuesto por iva es: " + iva);
        double irpf = CalcularImpuestos.calcularIRPF();
        System.out.println("Su impuesto por irpf es: " + irpf);
    }

}
