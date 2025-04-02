package figuras;

import java.util.Scanner;
import java.awt.Color;

public class PruebaFigura {
    // Actividad 1: Extract Constant
    private static final String AREA_MSG = "El área es: ";
    
    public static void main(String[] args) {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        do {
            opcion = mostrarMenu();
            if (opcion != 4) {
                System.out.print("Introduzca la coordenada x del centro: ");
                double x = teclado.nextDouble();
                System.out.print("Introduzca la coordenada y del centro: ");
                double y = teclado.nextDouble();
                
                switch (opcion) {
                    case 1:
                        procesarTriangulo(teclado, x, y);
                        break;
                    case 2:
                        procesarRectangulo(teclado, x, y);
                        break;
                    case 3:
                        procesarCuadrado(teclado, x, y);
                        break;
                }
            }
        } while (opcion != 4);
        teclado.close();
    }

    public static int mostrarMenu() {
        int opcion;
        System.out.println("1) Triangulo");
        System.out.println("2) Rectangulo");
        System.out.println("3) Cuadrado");
        System.out.println("4) Salir");
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Introduzca una opción (1-4): ");
            opcion = teclado.nextInt();
            if (opcion < 1 || opcion > 4)
                System.out.println("Debe introducir un número entre 1 y 4");
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }
    
    // Actividad 2: Extract Method
    private static void procesarTriangulo(Scanner teclado, double x, double y) {
        System.out.print("Introduzca el lado 1 del triángulo: ");
        double lado1 = teclado.nextDouble();
        System.out.print("Introduzca el lado 2 del triángulo: ");
        double lado2 = teclado.nextDouble();
        System.out.print("Introduzca el lado 3 del triángulo: ");
        double lado3 = teclado.nextDouble();
        Triangulo t = new Triangulo(x, y, Color.red, lado1, lado2, lado3);
        System.out.println("El perímetro es " + t.perimetro());
        System.out.println(AREA_MSG + t.area());
    }

    private static void procesarRectangulo(Scanner teclado, double x, double y) {
        System.out.print("Introduzca la base del rectángulo: ");
        double base = teclado.nextDouble();
        System.out.print("Introduzca la altura del rectángulo: ");
        double altura = teclado.nextDouble();
        Rectangulo r = new Rectangulo(x, y, Color.red, base, altura);
        System.out.println("El perímetro es " + r.perimetro());
        System.out.println(AREA_MSG + r.area());
    }
    
    private static void procesarCuadrado(Scanner teclado, double x, double y) {
        System.out.print("Introduzca el lado del cuadrado: ");
        double lado = teclado.nextDouble();
        Cuadrado c = new Cuadrado(x, y, Color.red, lado);
        System.out.println("El perímetro es " + c.perimetro());
        System.out.println(AREA_MSG + c.area());
    }
}
