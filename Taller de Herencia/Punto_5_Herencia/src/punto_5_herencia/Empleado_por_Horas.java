
package punto_5_herencia;

public class Empleado_por_Horas extends Empleado_Asalariado{
    // vinculado a empleado

    private int Horas_extra;

    public Empleado_por_Horas(int Horas_trabajadas, int valor_Horas, int Semanas, double Salario_fijo, int Horas_extra) {
        super(Horas_trabajadas, valor_Horas, Semanas, Salario_fijo);
        this.Horas_extra = Horas_extra;
    }


    public int getHoras_extra() {
        return Horas_extra;
    }

    public void setHoras_extra(int Horas_extra) {
        this.Horas_extra = Horas_extra;
    }

    public void Calcular_salario(){
        int operacion_semana = getSemanas() * 6;
        int operacion_t = getHoras_trabajadas() * operacion_semana;
  
        if (operacion_t > 40) {
            double operacion = (getHoras_trabajadas()+ getHoras_extra()) * getValor_Horas();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("El empleado trabajo mas de 40 horas por lo tanto recibe un sueldo por sus horas extras de: "+operacion);
        } else {
            double operacion2 = getHoras_trabajadas()* getValor_Horas();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("El empleado trabajo menos de 40 horas por lo tanto recibe un sueldo de: "+operacion2);
        }
    }
   
   
}
