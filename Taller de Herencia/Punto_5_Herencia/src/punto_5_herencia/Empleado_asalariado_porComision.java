
package punto_5_herencia;

public class Empleado_asalariado_porComision extends Empleado_Comision {
    // vinculado a empleado asalariado
    private double Pocenta_agregado;

   
    public Empleado_asalariado_porComision(int Horas_trabajadas, int valor_Horas, int Semanas, double Salario_fijo, int Horas_extra, int Ventas_Hechas, int Valor_articulo, double pocentaje_venta,double Pocenta_agregado) {
        super(Horas_trabajadas, valor_Horas, Semanas, Salario_fijo, Horas_extra, Ventas_Hechas, Valor_articulo, pocentaje_venta);
        this.Pocenta_agregado = Pocenta_agregado;
    }

    public double getPocenta_agregado() {
        return Pocenta_agregado;
    }

    public void setPocenta_agregado(double Pocenta_agregado) {
        this.Pocenta_agregado = Pocenta_agregado;
    }
    
    public void Calcular_salario_10(){
        double porcent = getPocenta_agregado()/100;
        int operacion_semana = getSemanas() * 6;
        int operacion_t = getHoras_trabajadas() * operacion_semana;
        double sueldo = ((getSalario_fijo()*porcent)+getSalario_fijo());
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.printf("El empleado asalariado por comision, tiene un salario fijo: %f",getSalario_fijo());
        System.out.println(" y trabajo "+ operacion_t);
        System.out.printf("horas pero tiene un 10 porciento de agregado a su salario base entonces su salario quedaria asi: %f", sueldo);
        System.out.printf("\n");                  
    }
}
