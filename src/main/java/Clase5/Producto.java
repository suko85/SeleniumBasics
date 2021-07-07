package Clase5;

public class Producto {

    //atributos.
    private String nombre;
    private int codigo;
    private boolean esImportado;
    private int nroProducto;
    private String nroLote;

    //es una variable de la clase Producto!! (static)
    private static int CONTADOR_PRODUCTO =0;

    //constructores
    public Producto(){
        this.nombre = "Desconocido";
        this.codigo = 0;
        this.esImportado = false;
        CONTADOR_PRODUCTO = CONTADOR_PRODUCTO + 1;
        this.nroProducto = CONTADOR_PRODUCTO;
        this.nroLote = "Desconocido";

    }

    public Producto(String unNombre, int unCodigo, boolean importado, String lote, int nroProd){
        this.nombre = unNombre;
        this.codigo = unCodigo;
        this.esImportado = importado;
        this.nroLote = lote;
        this.nroProducto = nroProd;
    }

    //setter y getters
    public void setNombre (String unNombre) {
        this.nombre = unNombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setCodigo (int unCodigo){
        this.codigo = unCodigo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setEsImportado(boolean esImport){
        this.esImportado = esImport;
    }

    public boolean getEsImportado(){
        return this.esImportado;
    }

    public String toString2(){
        String textoAImprimir = "El producto " + this.nombre+" y codigo " + this.codigo;
        if (this.esImportado == true){
            textoAImprimir += " es importado.";
        }else {

        }
        return textoAImprimir;
    }

    public String toString() {
        return "El producto " + this.nombre + " y código " + this.codigo + " es importado " + this.esImportado + ", su lote es " + this.nroLote + " y el producto es " + this.nroProducto;
    }
}
