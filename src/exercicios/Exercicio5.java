package exercicios;

import java.util.Scanner;

/**
 * Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
 * na tela a sua média na disciplina.
 * Ex:
 * Nota 1: 4.5
 * Nota 2: 8.5
 * A média entre 4.5 e 8.5 é igual a 6.5
 */
public class Exercicio5 {

    public static void main(String[] args) {
        //Comando para ler dados do teclado
        Scanner scan = new Scanner(System.in);

        System.out.println(">> NOTAS <<");

        // Comandos de entrada e saída de valores.
        System.out.print("\nDigite a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("\nDigite a segunda nota:");
        double nota2 = scan.nextDouble();

        // Atribuição de operações a variável "media".
        double media = (nota1 + nota2) / 2;

        //Comando de saída com valores das variáveis.
        System.out.print("\nA média entre " + nota1 + " e " + nota2 + " é igual a " + media);
    }
}
