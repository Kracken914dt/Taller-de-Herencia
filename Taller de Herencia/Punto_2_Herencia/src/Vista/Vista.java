
package Vista;

import punto_2_herencia.*;

public class Vista {
    public static void main(String[] args) {
        Empleado Empleado1=new Empleado("Juan");
        Directivo Directivo1=new Directivo("Lucas");
        Operario Operativo1=new Operario("Marcos");
        Oficial Oficial1=new Oficial("Hector");
        Tecnico Tecnico1=new Tecnico("Diego");
        System.out.println(Empleado1);
        System.out.println(Directivo1);
        System.out.println(Operativo1);
        System.out.println(Oficial1);
        System.out.println(Tecnico1);
    }
}
