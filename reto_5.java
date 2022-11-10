package Retos;
import java.util.Scanner;
public class reto_5

{
public static void main(String[] args) 
    {
        int productos;
        int precioP;
        int totalCompra =0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de productos que va llevar: ");
        productos = scanner.nextInt();
        
        for(int i = 0; i < productos ; i++)
        {
            System.out.println("Ingrese el precio del producto que va llevar: ");
            precioP = scanner.nextInt();

            totalCompra = totalCompra + precioP;
        }
        System.out.println("El total de la compra es = " + totalCompra);
        scanner.close();
    }
}