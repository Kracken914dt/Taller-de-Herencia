
package Vista;

import Punto_3_Herencia.*;


public class TestHerencia1 {
    public static void main(String[] args) {
        Persona profesor1 = new Profesor("Jairo", "Sejuanes", "Prof 34-789-109");
        System.out.print(profesor1.info());
        System.out.println(profesor1);
    }
}
