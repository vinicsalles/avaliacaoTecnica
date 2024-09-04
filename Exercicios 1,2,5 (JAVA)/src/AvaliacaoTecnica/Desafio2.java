package AvaliacaoTecnica;

import java.util.Scanner;

//Desafio 2 - Fibonacci

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        
        if (fibon(numero)) {
            System.out.println("O número " + numero + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence a sequência de Fibonacci.");
        }
        
        scanner.close();
    }

    public static boolean fibon(int numero) {
        int a = 0;
        int b = 1;
        while (a < numero) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a == numero;
    }
}
