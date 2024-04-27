import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Funciones.*;

public class CalculadoraGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        do {
            try {
                System.out.println("Seleccione la operación:");
                System.out.println("1. Área");
                System.out.println("2. Perímetro");
                System.out.println("3. Potencia");
                int opcionOperacion = scanner.nextInt();

                Operacion operacion = null;

                switch (opcionOperacion) {
                    case 1:
                        operacion = new Area();
                        break;
                    case 2:
                        operacion = new Perimetro();
                        break;
                    case 3:
                        operacion = new Potencia();
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }

                if (operacion != null) {
                    double resultado = calculadora.realizarOperacion(operacion, scanner);
                    System.out.println("El resultado es: " + resultado);
                }

            } catch (Exception e) {
                System.out.println("Error: Entrada inválida. Por favor ingrese un número válido.");
                scanner.next();
            }

            System.out.println("¿Desea realizar otra operación? (s/n)");
        } while (scanner.next().equalsIgnoreCase("s"));

        scanner.close();
    }
}

