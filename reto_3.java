package Retos;
import java.util.Scanner;
import java.util.Random;
public class reto_3

{
    public static void main(String[]args)
    {
        int caraSello;
        int aleatorio;

        Scanner scanner = new Scanner(System.in);

        Random Aleatorio = new Random();

        aleatorio = Aleatorio.nextInt()%2+1;

        System.out.println("Elija cara o sello.");
        System.out.println("Escrriba la opción 1 si desea cara y la opción 2 si desea sello.");
        
        caraSello = scanner.nextInt();

        if (caraSello == 1)
        {
            if (aleatorio == 1)
            {
            System.out.println("Salio cara, ha ganado el juego");
            }
            else 
            {
            System.out.println("Salio sello, ha perdido el juego");
            }
        }
        else 
        {
            if (aleatorio == 2)
            {
            System.out.println("Salio sello, ha ganado el juego");
            }    
            else 
            {
            System.out.println("Salio cara, ha perdido el juego");
            } 
        }
        scanner.close();        
    }
}