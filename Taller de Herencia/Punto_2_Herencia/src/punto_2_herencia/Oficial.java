
package punto_2_herencia;


public class Oficial extends Operario{

    public Oficial(String nombre) {
        super(nombre);
    }
    
  
    @Override
    public String toString() {
        return super.toString()+" = Oficial"; 
    }
    
}
