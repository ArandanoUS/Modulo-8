package Funciones;

import java.util.Scanner;

public class Perimetro implements Operacion {
    @Override
    public double calcular(Scanner scanner) {
        System.out.println("Seleccione la figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");

        int opcionFigura = scanner.nextInt();
        double perimetro = 0;

        switch (opcionFigura) {
            case 1: // Círculo
                System.out.println("Ingrese el radio del círculo:");
                double radioCirculo = scanner.nextDouble();
                perimetro = 2 * Math.PI * radioCirculo;
                break;
            case 2: // Cuadrado
                System.out.println("Ingrese el lado del cuadrado:");
                double ladoCuadrado = scanner.nextDouble();
                perimetro = 4 * ladoCuadrado;
                break;
            case 3: // Triángulo
                System.out.println("Ingrese el lado 1 del triángulo:");
                double lado1Triangulo = scanner.nextDouble();
                System.out.println("Ingrese el lado 2 del triángulo:");
                double lado2Triangulo = scanner.nextDouble();
                System.out.println("Ingrese el lado 3 del triángulo:");
                double lado3Triangulo = scanner.nextDouble();
                perimetro = lado1Triangulo + lado2Triangulo + lado3Triangulo;
                break;
            case 4: // Rectángulo
                System.out.println("Ingrese el lado 1 del rectángulo:");
                double lado1Rectangulo = scanner.nextDouble();
                System.out.println("Ingrese el lado 2 del rectángulo:");
                double lado2Rectangulo = scanner.nextDouble();
                perimetro = 2 * (lado1Rectangulo + lado2Rectangulo);
                break;
            case 5: // Pentágono
                System.out.println("Ingrese el lado del pentágono:");
                double ladoPentagono = scanner.nextDouble();
                perimetro = 5 * ladoPentagono;
                break;
            default:
                System.out.println("Opción no válida.");
        }

        return perimetro;
    }
}