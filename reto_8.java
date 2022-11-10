package Retos;
import java.util.Arrays;
import java.util.Scanner;
public class reto_8
 
{
    public static void main(String[] args) 
    {
        int cantCompetidores;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de commpetidores. ");
        cantCompetidores = scanner.nextInt();

        String [] nombre = new String [cantCompetidores];

        for( int i = 0; i < nombre.length; i++)
        {
            System.out.println("Ingrese el nombre del competidr. " + (i));
            nombre[i] = scanner.next();
        }

        double [] tiempo = new double [cantCompetidores];

        for( int i = 0; i < tiempo.length; i++)
        {
            System.out.println("Ingrese el tiempo que tardo el commpetidor. " + (i));
            tiempo[i] = scanner.nextDouble();
        }

        for( int i = 0; i < nombre.length && i < tiempo.length; i++)
        {      
        System.out.println(nombre[i] + " su tiempo fue " +  tiempo[i]);
        Arrays.sort(tiempo);  
        }
    scanner.close();    
    }
}
