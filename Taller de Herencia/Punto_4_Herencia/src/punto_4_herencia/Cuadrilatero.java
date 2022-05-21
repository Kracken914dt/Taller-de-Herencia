
package punto_4_herencia;

public abstract class Cuadrilatero {
    private int Coordenada_X_A;
    private int Coordenada_X_B;
    private int Coordenada_X_C;
    private int Coordenada_X_D;
    private int Coordenada_Y_A;
    private int Coordenada_Y_B;
    private int Coordenada_Y_C;
    private int Coordenada_Y_D;

    public Cuadrilatero(int Coordenada_X_A, int Coordenada_X_B, int Coordenada_X_C, int Coordenada_X_D, int Coordenada_Y_A, int Coordenada_Y_B, int Coordenada_Y_C, int Coordenada_Y_D) {
        this.Coordenada_X_A = Coordenada_X_A;
        this.Coordenada_X_B = Coordenada_X_B;
        this.Coordenada_X_C = Coordenada_X_C;
        this.Coordenada_X_D = Coordenada_X_D;
        this.Coordenada_Y_A = Coordenada_Y_A;
        this.Coordenada_Y_B = Coordenada_Y_B;
        this.Coordenada_Y_C = Coordenada_Y_C;
        this.Coordenada_Y_D = Coordenada_Y_D;
    }

    public int getCoordenada_X_A() {
        return Coordenada_X_A;
    }

    public void setCoordenada_X_A(int Coordenada_X_A) {
        this.Coordenada_X_A = Coordenada_X_A;
    }

    public int getCoordenada_X_B() {
        return Coordenada_X_B;
    }

    public void setCoordenada_X_B(int Coordenada_X_B) {
        this.Coordenada_X_B = Coordenada_X_B;
    }

    public int getCoordenada_X_C() {
        return Coordenada_X_C;
    }

    public void setCoordenada_X_C(int Coordenada_X_C) {
        this.Coordenada_X_C = Coordenada_X_C;
    }

    public int getCoordenada_X_D() {
        return Coordenada_X_D;
    }

    public void setCoordenada_X_D(int Coordenada_X_D) {
        this.Coordenada_X_D = Coordenada_X_D;
    }

    public int getCoordenada_Y_A() {
        return Coordenada_Y_A;
    }

    public void setCoordenada_Y_A(int Coordenada_Y_A) {
        this.Coordenada_Y_A = Coordenada_Y_A;
    }

    public int getCoordenada_Y_B() {
        return Coordenada_Y_B;
    }

    public void setCoordenada_Y_B(int Coordenada_Y_B) {
        this.Coordenada_Y_B = Coordenada_Y_B;
    }

    public int getCoordenada_Y_C() {
        return Coordenada_Y_C;
    }

    public void setCoordenada_Y_C(int Coordenada_Y_C) {
        this.Coordenada_Y_C = Coordenada_Y_C;
    }

    public int getCoordenada_Y_D() {
        return Coordenada_Y_D;
    }

    public void setCoordenada_Y_D(int Coordenada_Y_D) {
        this.Coordenada_Y_D = Coordenada_Y_D;
    }
   
     public String calcularArea() {
        System.out.println("El area de la figura es: ");
        float Operacion;
        Operacion = (this.Coordenada_X_A * this.Coordenada_Y_D) + (this.Coordenada_X_D * this.Coordenada_Y_C) + (this.Coordenada_X_C * this.Coordenada_Y_B) + (this.Coordenada_X_B * this.Coordenada_Y_A)
                - (this.Coordenada_X_A * this.Coordenada_Y_B) - (this.Coordenada_X_B * this.Coordenada_Y_C) - (this.Coordenada_X_C * this.Coordenada_Y_D) - (this.Coordenada_X_D * this.Coordenada_Y_A);
        if (Operacion < 0) {
            return Operacion / 2 * (-1) + " Unidades Cuadradas ";
        } else if (Operacion > 0) {
            return Operacion / 2 + " Unidades Cuadradas ";
        }
        return null;
        
    }
     public abstract String Area();
}
