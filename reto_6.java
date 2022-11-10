package Retos;
import java.util.Scanner;
import java.util.Random;
public class reto_6

{
    public static void main(String[]args)
    {
        int i = 0;
        int cantDinero;
        int caraSello;
        int aleatorio;
        int incrementar = 1000;
        int quitar = 1000;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Monto a apostar");
        cantDinero = scanner.nextInt();

        do
        {
            Random Aleatorio = new Random();

            aleatorio = Aleatorio.nextInt()%2+1;

            System.out.println("Elija cara o sello.");
            System.out.println("Escrriba la opción 1 si desea cara, la opción 2 si desea sello.");
        
            caraSello = scanner.nextInt();

            if (caraSello == 1)
            {
                if (aleatorio == 1)
                {
                System.out.println("Salio cara, ha ganado el juego");
                System.out.println("La cantidad de dinero acumulado es de:" + (cantDinero + incrementar)); 
                }
                else 
                {
                System.out.println("Salio sello, ha perdido el juego");
                System.out.println("La cantidad de dinero acumulado es de:" + (cantDinero - quitar));
                }
            }
            else 
            {
                if (aleatorio == 2)
                {
                System.out.println("Salio sello, ha ganado el juego");
                System.out.println("La cantidad de dinero acumulado es de:" + (cantDinero + incrementar)); 
                }                  
                else 
                {
                System.out.println("Salio cara, ha perdido el juego");
                System.out.println("La cantidad de dinero acumulado es de:" + (cantDinero - quitar)); 
                } 
            }
            i++;
            
        }
        while (cantDinero != 0);
        scanner.close();        
    }
}