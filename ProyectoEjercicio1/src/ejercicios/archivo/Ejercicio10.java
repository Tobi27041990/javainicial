package ejercicios.archivo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 
{
    public static void main(String[] args) 
    {

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int cont = 0, n = 0, cantidad;

        do{
            System.out.println("Introduce número: ");
            cantidad = sc.nextInt();
        }while(cantidad < 1);

        try (PrintWriter salida = new PrintWriter("c:/ficheros/caracteres.txt"))
        {

            while (cont < cantidad) 
            {

                n++; //= rnd.nextInt(1000); //se obtiene un número 
               
                salida.println(n);
                cont++;

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}