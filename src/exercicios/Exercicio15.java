package exercicios;

import java.util.Scanner;

/**
 *  Crie um programa que leia o número de dias trabalhados em um mês e mostre o
 * salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
 * por hora trabalhada.
 */
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Comandos de entrada e saída de dados.
        System.out.println ("--------------------");
        System.out.println ("FOLHA DEVDRIVER LTDA");
        System.out.println ("--------------------");
        System.out.println ("Digite o Nome do Funcionário: ");
        String nome = scan.next();
        System.out.println("Quantos dias foram trabalhados durante este mês? ");
        int diasTrabalhados =  scan.nextInt();

        //Atribuição de dados a variável
        float hora = 8 * 25;
        float salario = diasTrabalhados * hora;

        // Comandos de saída com dados.
        System.out.println ("O Funcionário " + nome + ", trabalhou " + diasTrabalhados + " dias.");
        System.out.println ("Com isso receberá o salário no valor de R$ " + salario);

        System.out.println("salario: " + salario);
    }
}
