import java.util.Scanner;

public class Trabajo1
{


        public static void main(String[] args)
        {

            Scanner ingreso = new Scanner(System.in);

            double peso, dolar;

            System.out.println("escriba el valor en dolares");
            dolar = ingreso.nextDouble();
            peso = dolar * 4020.50;

            System.out.println("el valor en pesos es: " + peso);
        }

}
