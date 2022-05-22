
package Vista;
import punto_5_herencia.*;
public class Vista {
    public static void main(String[] args) {
        Empleado_Asalariado empleado1 = new Empleado_Asalariado(8, 0, 7, 5.000000);
        empleado1.Salario();
        Empleado_por_Horas empleado2 = new Empleado_por_Horas(8, 5000, 3, 0, 5);
        empleado2.Calcular_salario();
        Empleado_por_Horas empleado5 = new Empleado_por_Horas(3, 5000, 2, 0, 0);
        empleado5.Calcular_salario();
        Empleado_Comision empleado3 = new Empleado_Comision(6, 5000, 3, 0, 0, 8, 100000, 15);
        empleado3.calcular_salario_comision();
        Empleado_asalariado_porComision empleado4 = new Empleado_asalariado_porComision(8, 5000, 3, 5.000000, 0, 0, 0, 0, 10);
        empleado4.Calcular_salario_10();
    }
}
