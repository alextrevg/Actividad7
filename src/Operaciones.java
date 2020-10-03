import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.*;
public class Operaciones {
    private static int rango;

    public static void Primos() {

        System.out.println("Ingresa el limite de numeros que desees conocer, acerca de los numeros primos y Sucesion Fibonacci");
        Scanner A = new Scanner(System.in);
        rango = A.nextInt();

        System.out.println("Numeros primos: ");

        int n = 0, j = 0, div = 0, raiz = 0;

        for (n = 2; n < rango; n++) {
            div = 0;
            raiz = (int) sqrt(n);
            for (j = 1; j <= raiz; j++) {
                if (n % j == 0)
                    div++;
            }
            if (div <= 1)

                System.out.print(n +",");
        }
    }
    public  void SFibonacci(){
        System.out.println("\nSucesion Fibonacci");

        int inicio = 0;
        int suma = 1;
        int result;
        int l = 100;

        System.out.print(inicio + "," +  suma +",");

        while(suma + inicio <= rango){
            result = inicio;
            inicio = suma;
            suma = result + inicio;
            System.out.print(suma + ",");
        }
    }
    }

