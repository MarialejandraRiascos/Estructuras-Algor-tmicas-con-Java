package Retos;
import java.util.Scanner;
public class reto_7 
{
    public static void main(String[] args) 
    {
        int cantNotas;
        double suma = 0;
        double promedio;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de notas.");
        cantNotas = scanner.nextInt();

        double [] notas = new double [cantNotas];

        for ( int i = 0; i < notas.length; i++)
        {
            System.out.println("Ingrese la nota desde 10 hasta 50. " + i );
            notas [i] = scanner.nextDouble();
        }

        for ( int i = 0; i < notas.length; i++)
        {
            suma = suma + notas[i];
        }

        promedio = suma / cantNotas;
        System.out.println("Su promedio es" + promedio);

        if (promedio < 30)
        {
            System.out.println("Reprobaste.");
        }

        else if (promedio >= 30 && promedio <= 40)
        {
            System.out.println("Pasaste raspando.");
        }

        else if (promedio > 40)
        {
            System.out.println("Aprobaste con buenos resultados.");
        }
        scanner.close();
    }
}
