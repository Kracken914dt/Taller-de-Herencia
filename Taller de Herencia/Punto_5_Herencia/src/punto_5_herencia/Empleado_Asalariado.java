
package punto_5_herencia;

public class Empleado_Asalariado extends Empleado{
private double Salario_fijo;

    public Empleado_Asalariado(int Horas_trabajadas, int valor_Horas, int Semanas, double Salario_fijo) {
        super(Horas_trabajadas, valor_Horas, Semanas);
        this.Salario_fijo = Salario_fijo;
    }


    public double getSalario_fijo() {
        return Salario_fijo;
    }

    public void setSalario_fijo(double Salario_fijo) {
        this.Salario_fijo = Salario_fijo;
    }

   public void Salario(){
       System.out.println("----------------------------------------------------------------------------------------------------------------");
       System.out.printf("El empleado asalariado trabajo "+getHoras_trabajadas()+ " horas en " +getSemanas()+ " semanas y recibe un salario de %f",getSalario_fijo());
       System.out.printf("\n");
   }

}
