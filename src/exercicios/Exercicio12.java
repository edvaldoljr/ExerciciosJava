package exercicios;

import java.util.Scanner;

/**
 *Crie um programa que leia o preço de um produto, calcule e mostre o seu
 * PREÇO PROMOCIONAL, com 5% de desconto.
 */
public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Comandos de saída e entrada de dados
        System.out.println ("---------------------------");
        System.out.println ("Bem vindo a Loja DEVDRIVER!");
        System.out.println ("---------------------------");
        System.out.println ("Temos cupons de 5% disponíveis.");
        System.out.println ("Qual valor da sua compra? R$ ");

        float valorProdutos = scan.nextFloat();

        // Cálculo do desconto de 5%
        float desconto = 0.05f;
        float valorPromocional = (valorProdutos - (valorProdutos * desconto));

        // Comandos com saída de dados
        System.out.println ("-------  PARABÉNS!  -------");
        System.out.println ("Com nosso desconto de 5% sua compra ficará no valor de R$ " + valorPromocional);

    }
}
