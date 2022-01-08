package exercicios;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
 * seu novo salário, com 15% de aumento.
 */

public class Exercicio13 {
    public static void main(String[] args) {
        //Comando para ler dados do teclado
        Scanner scan = new Scanner(System.in);

        // Comandos de entrada e saída de dados.
        System.out.println ("--------------");
        System.out.println ("DEVDRIVER LTDA");
        System.out.println ("--------------");
        System.out.print ("Nome do Funcionário: ");
        String nome = scan.next();
        System.out.print ("Salário do funcionário: R$ " );
        float salario = scan.nextFloat();

        // Cálculo do aumento de 15%.
        float aumento = 0.15f;
        float novoSalario = (salario + (salario * aumento));

        // Saída de dados com valores.
        System.out.println ("O novo salário do funcionário " + nome + " com aumento de 15% será de R$ " + novoSalario);

    }
}
