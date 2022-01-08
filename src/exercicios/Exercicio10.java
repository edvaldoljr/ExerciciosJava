package exercicios;

import java.util.Scanner;

/**
 *  Faça um algoritmo que leia a largura e altura de uma parede, calcule e
 * mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
 * sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
 */

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Comandos de entrada e saída de valores.
        System.out.println("-------------------------------");
        System.out.println ("Calculadora para pintar paredes");
        System.out.println ("-------------------------------");

        System.out.print("Altura (m²): ");
        float altura = scan.nextFloat();
        System.out.print("Largura (m²): ");
        float largura = scan.nextFloat();

        // Atribuição de operadores nas variáveis.
        float area = altura * largura;
        float quantidadeTinta = area / 2;

        // Comandos de saída com valores das operações.
        System.out.println("O tamanho da área a ser pintada é de " + area + " mts²");
        System.out.println("E são necessários " + quantidadeTinta + " Lts de tinta.");
    }
}
