
package Vista;
import punto_4_herencia.*;
public class Vista {
    public static void main(String[] args) {
        Cuadrilatero Rectangulo1 = new Rectangulo(3, 7, 1, 2, 15, 4, -1, -7);
        System.out.println(Rectangulo1.Area() + "\n---------------------------");
        Cuadrilatero Cuadrado = new Cuadrado(9, 2, -7, 10, 8, -2, 6, 7);
        System.out.println(Rectangulo1.Area() + "\n---------------------------");
        Cuadrilatero Trapecio = new Trapecio(5, 8, 9, 3, -9, -6, 3, 6);
        System.out.println(Trapecio.Area() + "\n---------------------------");
    }
}
