package Retos;
import java.util.Scanner;
public class reto_4

{
    public static void main(String[]args)
    {
        int jugador;

        Scanner scanner = new Scanner(System.in);

        int aleatorio = (int)(Math.random() * 3) + 1;

        System.out.println("Elija una de estas tres opciones: ");
        System.out.println("1. Piedra. ");
        System.out.println("2. Papel. ");
        System.out.println("3. Tijera. ");
        jugador = scanner.nextInt();

        System.out.println("La maquina eligio: ");
        switch (aleatorio)
        {
            case 1:

            System.out.println("Piedra");
            switch(jugador)
            {
                case 1: 
                System.out.println("Empate."); 
                break;
                case 2:
                System.out.println("Ganador."); 
                break;
                case 3: 
                System.out.println("Perdedor, la maquina gano."); 
                break;
             }

            break;

            case 2:

            System.out.println("Papel");
            switch(jugador)
            {
                case 1: 
                System.out.println("Perdedor, la maquina gano."); 
                break;
                case 2: 
                System.out.println("Empate."); 
                break;
                case 3: 
                System.out.println("Ganador."); 
                break;
             }

            break;

            case 3:

            System.out.println("Tijera");
            switch(jugador)
            {
                case 1:
                System.out.println("Ganador."); 
                break;
                case 2:
                System.out.println("Perdedor, la maquina gano."); 
                break;
                case 3: 
                System.out.println("Empate."); 
                break;
             }

            break;
        }
        scanner.close();
    }    
}