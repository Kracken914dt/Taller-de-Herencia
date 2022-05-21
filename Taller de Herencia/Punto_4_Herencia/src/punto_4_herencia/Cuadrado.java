
package punto_4_herencia;

public class Cuadrado extends Cuadrilatero{
    
    public Cuadrado(int Coordenada_X_A, int Coordenada_X_B, int Coordenada_X_C, int Coordenada_X_D, int Coordenada_Y_A, int Coordenada_Y_B, int Coordenada_Y_C, int Coordenada_Y_D) {
        super(Coordenada_X_A, Coordenada_X_B, Coordenada_X_C, Coordenada_X_D, Coordenada_Y_A, Coordenada_Y_B, Coordenada_Y_C, Coordenada_Y_D);
    }
    public String Area() {
        return super.calcularArea()+" Cuadrado ";
    }
}
