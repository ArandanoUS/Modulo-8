package Funciones;

import java.util.Scanner;

public class Calculadora {
    public double realizarOperacion(Operacion operacion, Scanner scanner)
    {
        return operacion.calcular(scanner);
    }
}
