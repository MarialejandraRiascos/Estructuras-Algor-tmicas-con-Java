package Retos;
import java.util.Scanner;
public class reto_1

{
	public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura °F :");
        double gradosF = scanner.nextDouble();

        System.out.println ();

        double resultado = (gradosF - 32) / 1.8;

        System.out.printf("%f grados Farenheit °F = %f grados centigrados °C\n", gradosF, resultado);
    }
     
}