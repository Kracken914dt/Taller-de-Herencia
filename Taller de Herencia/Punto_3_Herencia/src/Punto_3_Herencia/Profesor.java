package Punto_3_Herencia;

public class Profesor extends Persona {

    private String Id;

    public Profesor(String Id) {
        this.Id = Id;
    }

    public Profesor(String Nombre, String Apellido, String Id) {
        super(Nombre, Apellido);
        this.Id = Id;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return " con Id de profesor:" + Id + '}';
    }

}
