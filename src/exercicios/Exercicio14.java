package exercicios;

import java.util.Scanner;

/**
 * A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
 * um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
 * quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
 * sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
 */
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Comandos de entrada e saída de dados.
        System.out.println ("-------------------------");
        System.out.println ("DEVDRIVER RENT A CAR LTDA");
        System.out.println ("-------------------------");
        System.out.println ("Quantos quilômetros foram percorridos? ");
        float quantidadeDeKm = scan.nextFloat();
        float valorKm =  quantidadeDeKm * 0.20f;
        System.out.println("Quantodade de Dias: ");
        int quantidadeDeDias = scan.nextInt();
        float valorDias = quantidadeDeDias * 90f;

        //Atribuição das variáveis com os cálculos.
        float totalPagar = valorKm + valorDias;

        // Comandos de saída de dados com valores.
        System.out.print("Com " + quantidadeDeDias + " dias alugados e " + quantidadeDeKm + " Km rodados, o preço TOTAL a pagar será de R$ " + totalPagar);
    }
}
