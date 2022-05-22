
package punto_5_herencia;

public class Empleado {  
private int Horas_trabajadas;
private int valor_Horas;
private int Semanas;

    public Empleado(int Horas_trabajadas, int valor_Horas, int Semanas) {
        this.Horas_trabajadas = Horas_trabajadas;
        this.valor_Horas = valor_Horas;
        this.Semanas = Semanas;
    }

    public int getHoras_trabajadas() {
        return Horas_trabajadas;
    }

    public void setHoras_trabajadas(int Horas_trabajadas) {
        this.Horas_trabajadas = Horas_trabajadas;
    }

  

    public int getValor_Horas() {
        return valor_Horas;
    }

    public void setValor_Horas(int valor_Horas) {
        this.valor_Horas = valor_Horas;
    }

    public int getSemanas() {
        return Semanas;
    }

    public void setSemanas(int Semanas) {
        this.Semanas = Semanas;
    }

 
   
}
