
package Punto_3_Herencia;


public class Persona {
private String Nombre;
private String Apellido;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

 
    public String info() {
        return "Nombre de profesor: " + Nombre +" "+ Apellido ;
    }

}
