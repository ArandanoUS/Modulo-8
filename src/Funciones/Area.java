package Funciones;

import java.util.Scanner;

public class Area {
    public static double calcularArea(Scanner scanner) {
        System.out.println("Seleccione la figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
        int opcionFigura = scanner.nextInt();

        double area = 0;

        switch (opcionFigura) {
            case 1: // Círculo
                System.out.println("Ingrese el radio del círculo:");
                double radioCirculo = scanner.nextDouble();
                area = Math.PI * radioCirculo * radioCirculo;
                break;
            case 2: // Cuadrado
                System.out.println("Ingrese el lado del cuadrado:");
                double ladoCuadrado = scanner.nextDouble();
                area = ladoCuadrado * ladoCuadrado;
                break;
            case 3: // Triángulo
                System.out.println("Ingrese la base del triángulo:");
                double baseTriangulo = scanner.nextDouble();
                System.out.println("Ingrese la altura del triángulo:");
                double alturaTriangulo = scanner.nextDouble();
                area = (baseTriangulo * alturaTriangulo) / 2;
                break;
            case 4: // Rectángulo
                System.out.println("Ingrese la base del rectángulo:");
                double baseRectangulo = scanner.nextDouble();
                System.out.println("Ingrese la altura del rectángulo:");
                double alturaRectangulo = scanner.nextDouble();
                area = baseRectangulo * alturaRectangulo;
                break;
            case 5: // Pentágono
                System.out.println("Ingrese el lado del pentágono:");
                double ladoPentagono = scanner.nextDouble();
                System.out.println("Ingrese la apotema del pentágono:");
                double apotemaPentagono = scanner.nextDouble();
                area = (5 * ladoPentagono * apotemaPentagono) / 2;
                break;
            default:
                System.out.println("Opción no válida.");
        }

        return area;
    }
}
