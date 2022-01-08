package exercicios;

import java.util.Scanner;

/**
 * Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
 * entre eles.
 * Ex:
 * Digite um valor: 8
 * Digite outro valor: 5
 * A soma entre 8 e 5 é igual a 13.
 */
public class Exercicio4 {

    public static void main(String[] args) {
        //Comando para ler dados do teclado
        Scanner scan = new Scanner(System.in);

        System.out.println(">> SOMA DE 2 VALORES <<\n");

        // Comandos de saída com mensagem e comando de entrada dos valores "valor1, valor2".
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scan.nextInt();

        System.out.print("\nDigete o segundo valor: ");
        int valor2 = scan.nextInt();

        // Atribuição da operação de soma a variável "resultado".
        int resultado = valor1 + valor2;

        // Comando de saída com mensagem, valores de entrada e variável "resultado" com resultado.
        System.out.print("\nA soma entre " + valor1 + " e " + valor2 + " é igual a " + resultado);

    }
}
