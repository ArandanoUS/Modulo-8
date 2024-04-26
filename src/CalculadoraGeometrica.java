import java.util.Scanner;

public class CalculadoraGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
        int opcionFigura = scanner.nextInt();
        
        System.out.println("Seleccione la operación:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");
        int opcionOperacion = scanner.nextInt();

        double resultado = 0;

        switch (opcionFigura) {
            case 1: // Círculo
                if (opcionOperacion == 1) { // Área
                    System.out.println("Ingrese el radio del círculo:");
                    double radioCirculo = scanner.nextDouble();
                    resultado = Math.PI * radioCirculo * radioCirculo;
                } else if (opcionOperacion == 2) { // Perímetro
                    System.out.println("Ingrese el radio del círculo:");
                    double radioCirculo = scanner.nextDouble();
                    resultado = 2 * Math.PI * radioCirculo;
                }
                break;
            case 2: // Cuadrado
                if (opcionOperacion == 1) { // Área
                    System.out.println("Ingrese el lado del cuadrado:");
                    double ladoCuadrado = scanner.nextDouble();
                    resultado = ladoCuadrado * ladoCuadrado;
                } else if (opcionOperacion == 2) { // Perímetro
                    System.out.println("Ingrese el lado del cuadrado:");
                    double ladoCuadrado = scanner.nextDouble();
                    resultado = 4 * ladoCuadrado;
                }
                break;
            case 3: // Triángulo
                if (opcionOperacion == 1) { // Área
                    System.out.println("Ingrese la base del triángulo:");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.println("Ingrese la altura del triángulo:");
                    double alturaTriangulo = scanner.nextDouble();
                    resultado = (baseTriangulo * alturaTriangulo) / 2;
                } else if (opcionOperacion == 2) { // Perímetro
                    System.out.println("Ingrese el lado 1 del triángulo:");
                    double lado1Triangulo = scanner.nextDouble();
                    System.out.println("Ingrese el lado 2 del triángulo:");
                    double lado2Triangulo = scanner.nextDouble();
                    System.out.println("Ingrese el lado 3 del triángulo:");
                    double lado3Triangulo = scanner.nextDouble();
                    resultado = lado1Triangulo + lado2Triangulo + lado3Triangulo;
                }
                break;
            case 4: // Rectángulo
                if (opcionOperacion == 1) { // Área
                    System.out.println("Ingrese la base del rectángulo:");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.println("Ingrese la altura del rectángulo:");
                    double alturaRectangulo = scanner.nextDouble();
                    resultado = baseRectangulo * alturaRectangulo;
                } else if (opcionOperacion == 2) { // Perímetro
                    System.out.println("Ingrese la base del rectángulo:");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.println("Ingrese la altura del rectángulo:");
                    double alturaRectangulo = scanner.nextDouble();
                    resultado = 2 * (baseRectangulo + alturaRectangulo);
                }
                break;
            case 5: // Pentágono
                if (opcionOperacion == 1) { // Área
                    System.out.println("Ingrese el lado del pentágono:");
                    double ladoPentagono = scanner.nextDouble();
                    System.out.println("Ingrese la apotema del pentágono:");
                    double apotemaPentagono = scanner.nextDouble();
                    resultado = (5 * ladoPentagono * apotemaPentagono) / 2;
                } else if (opcionOperacion == 2) { // Perímetro
                    System.out.println("Ingrese el lado del pentágono:");
                    double ladoPentagono = scanner.nextDouble();
                    resultado = 5 * ladoPentagono;
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }

        // Mostrar resultado
        if (opcionOperacion == 1) {
            System.out.println("El área es: " + resultado);
        } else if (opcionOperacion == 2) {
            System.out.println("El perímetro es: " + resultado);
        }

        scanner.close();
    }
}