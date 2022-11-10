package Retos;
import java.util.Scanner;
public class reto_9 

{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        String[][]Productos = new String[4][4];
        int[][]Precio = new int[4][4];

        for(int f = 0; f < 4; f++)
        {
            for(int c = 0; c < 4; c++)
            {
                System.out.println("Ingrese el producto: ");
                Productos[f][c] = scanner.next();
                System.out.println("Ingrese el precio del producto: ");
                Precio[f][c] = scanner.nextInt();
            }
        }
   
        for(int fila = 0; fila < 4; fila++)
        {
            for(int columna = 0; columna < 4; columna++)
            {
                System.out.print(fila + " " + columna + " " + Productos[fila][columna] + " " + Precio[fila][columna] + "\n");
            }
        }
        scanner.close();
    }      
}
