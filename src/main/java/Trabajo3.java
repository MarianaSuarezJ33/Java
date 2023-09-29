import java.util.Scanner;
import java.io.*;

public class Trabajo3
{
    public static void main(String[] args) {
        double notas[] = new double[5]; // Crear un array para almacenar las notas de los estudiantes
        Scanner sc = new Scanner(System.in);

        // Solicitar las notas de los 5 estudiantes
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        // Calcular el promedio de las notas
        double suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += notas[i];
        }
        double promedio = suma / 5;

        // Mostrar el promedio
        System.out.println("El promedio de las notas es: " + promedio);

        // Cerrar el scanner
        sc.close();
    }
}