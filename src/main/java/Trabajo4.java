//Enunciado del ejercicio:
//Escribe un programa en Java que solicite al usuario ingresar dos números enteros.
// Luego, usa un bucle while para mostrar la multiplicación de los números ingresados hasta que el resultado sea mayor que 100.
// Utiliza un bucle do-while para pedir al usuario que ingrese nuevamente los números si la multiplicación no supera 100.
// Agrega manejo de excepciones con try-catch para evitar errores de división por cero si el segundo número es igual a cero.
// Registra todos los pasos importantes del programa en un archivo de registro (log) para un seguimiento detallado de su ejecución.

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Trabajo4
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt"))) {
            do {
                System.out.print("Ingresa el primer número entero: ");
                num1 = scanner.nextInt();
                System.out.print("Ingresa el segundo número entero: ");
                num2 = scanner.nextInt();

                int producto = 0;
                int iteraciones = 0;

                try {
                    while (producto <= 100) {
                        producto = num1 * num2;
                        writer.println("Multiplicación: " + num1 + " * " + num2 + " = " + producto);
                        num1++;
                        iteraciones++;
                    }

                    writer.println("Número de iteraciones: " + iteraciones);
                } catch (Exception e) {
                    writer.println("Error: " + e.getMessage());
                }

                System.out.println("El resultado es mayor que 100.");

                System.out.print("¿Quieres ingresar nuevos números? (S/N): ");
            } while (scanner.next().equalsIgnoreCase("S"));
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo de registro: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Error: Debes ingresar un número entero válido.");
        } finally {
            scanner.close();
        }
    }
}
