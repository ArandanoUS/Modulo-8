package Funciones;

import java.util.Scanner;

public class Potencia {
    public static double calcularPotencia(Scanner scanner) {
        System.out.println("Ingrese la base:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese el exponente:");
        int exponente = scanner.nextInt();
        return potencia(base, exponente);
    }

    private static double potencia(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente > 0) {
            return base * potencia(base, exponente - 1);
        } else {
            return 1 / (base * potencia(base, -exponente - 1));
        }
    }
}

