package exercicios;

import java.util.Scanner;

/**
 * Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
 * sucessor.
 * Ex:
 * Digite um número: 9
 * O antecessor de 9 é 8
 * O sucessor de 9 é 10
 */
public class Exercicio6 {

    public static void main(String[] args) {
        //Comando para ler dados do teclado
        Scanner scan = new Scanner(System.in);

        //Comandos de entrada e saída de valores
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();

        //Comando de saída com mensagem e operações.
        System.out.println("\nO antecessor de " + numero + " é " + (numero - 1));
        System.out.println("O sucessor de " + numero + " é " + (numero + 1));
    }
}
