import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Funciones.*;

public class CalculadoraGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> resultados = new ArrayList<>();

        do {
            try {
                System.out.println("Seleccione la operación:");
                System.out.println("1. Área");
                System.out.println("2. Perímetro");
                System.out.println("3. Potencia");
                int opcionOperacion = scanner.nextInt();

                double resultado = 0;

                switch (opcionOperacion) {
                    case 1: // Área
                        resultado = Area.calcularArea(scanner);
                        break;
                    case 2: // Perímetro
                        resultado = Perimetro.calcularPerimetro(scanner);
                        break;
                    case 3: // Potencia
                        resultado = Potencia.calcularPotencia(scanner);
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }

                resultados.add(resultado);

                System.out.println("El resultado es: " + resultado);

            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor ingrese un número válido.");
                scanner.next();
            }

            System.out.println("¿Desea realizar otra operación? (s/n)");
        } while (scanner.next().equalsIgnoreCase("s"));

        System.out.println("Resultados:");
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println("Operación " + (i + 1) + ": " + resultados.get(i));
        }

        scanner.close();
    }
}

