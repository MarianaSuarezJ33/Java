//Crea una lista de números enteros, por ejemplo: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
//Utiliza un Stream para realizar las siguientes operaciones en la lista:
//a. Filtra los números pares.
//b. Duplica cada número en la lista.
//c. Suma todos los números duplicados.
//d. Encuentra el número más grande en la lista de números duplicados.
//e. Imprime los resultados de cada operación.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;
public class Trabajo5
{
    public static void main(String[] args)
    {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usar Stream para filtrar números pares
        List<Integer> numerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Números pares: " + numerosPares);

        List<Integer> numerosDuplicados = numeros.stream()
                .map(numero -> numero * 2)
                .collect(Collectors.toList());

        // Imprimir los números duplicados
        System.out.println("Números duplicados: " + numerosDuplicados);


        // Utilizar Stream para duplicar los números y luego sumarlos
        int suma = numeros.stream()
                .map(numero -> numero * 2)  // Duplicar cada número
                .mapToInt(Integer::intValue) // Convertir a un flujo de enteros
                .sum();                      // Sumar los números duplicados

        // Imprimir la suma de los números duplicados
        System.out.println("Suma de números duplicados: " + suma);

        // Utilizar Stream para encontrar el número más grande
        Optional<Integer> maxNumero = numerosDuplicados.stream()
                .max(Integer::compareTo);

        // Comprobar si se encontró el número más grande y mostrarlo
        if (maxNumero.isPresent()) {
            System.out.println("Número más grande: " + maxNumero.get());
        } else {
            System.out.println("La lista está vacía.");
        }

    }

}
