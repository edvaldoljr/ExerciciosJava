package exercicios;

import java.util.Scanner;

/**
 * Crie um programa que leia o nome e o salário de um funcionário, mostrando no
 * final uma mensagem.
 * Ex:
 * Nome do Funcionário: Maria do Carmo
 * Salário: 1850,45
 * O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
 */
public class Exercicio3 {

    public static void main(String[] args) {
        //Comando para ler dados do teclado
        Scanner scan = new Scanner(System.in);

        // Comandos de saída perguntado os valor "nome"
        System.out.print("Digite o nome do funcionário: ");

        // Comandos de entrada guardando os valor "nome"
        String nome = scan.next();

        // Comandos de saída perguntado os valor do "salario"
        System.out.print("\nQual salário do funcionário? ");

        // Comandos de entrada guardando os valor salario"
        double salario = scan.nextDouble();

        // Comando de saída mensagem, com os valores de entrada.
        System.out.print("\nNome do Funcionário: " + nome + "\nSalário: " + salario);
        System.out.print("\nFuncionário " + nome + " te um salário de " + salario + " em Junho");

    }
}
