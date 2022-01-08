package exercicios;

import java.util.Scanner;

/**
 * Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas vindas para ela:
 * Ex:
 * Qual é o seu nome?
 * Olá "nome", é um prazer te conhecer!
 */

public class Exercicio2 {

    public static void main(String[] args) {
        //Comando para ler dados do teclado
        Scanner scan = new Scanner(System.in);

        // Comando de saída. Mensagem perguntando o nome.
        System.out.print("Qual seu nome? ");

        // Comando de entrada. Leitura e armazenamento do valor "nome".
        String nome = scan.next();

        // Comando de saída com inserção do valor "nome" na mensagem de boas vindas!
        System.out.print("\nOlá " + nome + ", é um prazer conhecer!");
    }
}
