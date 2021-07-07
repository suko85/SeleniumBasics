package Clase5;

public class GestionProductos {

    public static void main (String args[]){

        Producto prod1 = new Producto();
        System.out.println(prod1);
        prod1.setNombre("Harina");
        prod1.setCodigo(4000);
        prod1.setEsImportado(true);
        System.out.println(prod1);

        System.out.println("********************************");

        Producto prod2 = new Producto("Arroz", 1000, false, "ARR-500", 90);
        System.out.println(prod2);
    }


}
