import java.util.Scanner;

public class Trabajo2
{
    public static void main(String[] args)
    {
        Scanner cuadrado = new Scanner(System.in);
        System.out.println(cuadrado);


        System.out.println("Indica la base o altura: ");
        double num1 = cuadrado.nextInt();

        System.out.println("");


        area(num1);
    }

    private static void area(double num1)
    {
        System.out.println("El area del cuadrado es:"+(num1*num1));
    }
}
