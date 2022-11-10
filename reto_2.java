package Retos;
import java.util.Scanner;
public class reto_2

{
	public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el peso del paciente en kg: ");
        float Peso = scanner.nextFloat();

        System.out.println("Ingrese los meses del paciente: ");
        int Meses = scanner.nextInt();
    
  
    double Dosis = ((Peso + 10) /(Meses *10) * 8);
    System.out.println("La dosis necesaria para el paciente es: " + Dosis);
    }
    
}