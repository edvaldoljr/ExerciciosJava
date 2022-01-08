package exercicios;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
 * e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
 */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double dolar = 3.45f;

        // Comandos de entrada e saída de valores.
        System.out.println ("-----------------------------------");
        System.out.println ("--- Conversor de Real para Dólar ---");
        System.out.println ("-----------------------------------");
        System.out.println ("Qual valor em R$: ");
        double real = scan.nextFloat();

        double dolaresComprados = real / dolar;

        System.out.printf("Com R$: " + real + " posso comprar UR$: " + dolaresComprados);
    }
}
