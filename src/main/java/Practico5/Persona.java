package Practico5;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

  public Persona(){
      this.nombre = "No nombre";
      this.apellido = "No apellido";
      this.edad = 0;
  }

    public Persona(String unNombre, String unApellido, int unaEdad) {
        this.nombre = unNombre;
        this.apellido = unApellido;
        this.edad = unaEdad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String lastName) {
        this.apellido = lastName;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int age) {
        this.edad = age;
    }

}
