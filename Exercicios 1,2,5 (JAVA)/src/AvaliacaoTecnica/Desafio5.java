package AvaliacaoTecnica;

import java.util.Scanner;


//Desafio 5 - Inverter String

public class Desafio5 {
    
    public static String inverterString(String s) {
        String resultado = "";
    
        for (int i = s.length() - 1; i >= 0; i--) {
            resultado += s.charAt(i);
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string para inverter: ");
        String entrada = scanner.nextLine();
        
        String invertida = inverterString(entrada);
        System.out.println("String invertida: " + invertida);
        
        scanner.close();
    }
}
