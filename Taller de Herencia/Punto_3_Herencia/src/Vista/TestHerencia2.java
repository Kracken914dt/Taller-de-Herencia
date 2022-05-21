
package Vista;

import Punto_3_Herencia.*;


public class TestHerencia2 {
    public static void main(String[] args) {
        Profesor profesorInterino = new ProfesorInterino("Pedro", "Ramiro ", "333-444-212", "Jueves May 12 12:45:02 cet 2020");
        System.out.print(profesorInterino.info());
        System.out.println(profesorInterino);
        
    }
}
