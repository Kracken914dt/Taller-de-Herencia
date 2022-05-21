
package punto_2_herencia;

public class Directivo extends Empleado{
      public Directivo(String Nombre) {
        super(Nombre);
    }

    

    @Override
    public String toString() {
        
        return super.toString()+" = Directivo"; 
    }
    
}
