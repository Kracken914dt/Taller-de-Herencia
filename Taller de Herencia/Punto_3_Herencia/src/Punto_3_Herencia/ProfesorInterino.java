
package Punto_3_Herencia;

public class ProfesorInterino extends Profesor{
    private String Fecha_Incorporo;

    
    public ProfesorInterino(String Fecha_Incorporo, String Id) {
        super(Id);
        this.Fecha_Incorporo = Fecha_Incorporo;
    }

    public ProfesorInterino( String Nombre, String Apellido, String Id, String Fecha_Incorporo) {
        super(Nombre, Apellido, Id);
        this.Fecha_Incorporo = Fecha_Incorporo;
    }

    public String getFecha_Incorporo() {
        return Fecha_Incorporo;
    }

    public void setFecha_Incorporo(String Fecha_Incorporo) {
        this.Fecha_Incorporo = Fecha_Incorporo;
    }

    @Override
    public String toString() {
        return "Fecha en la que se incorporo:" + Fecha_Incorporo ;
    }

   

   
    
}
