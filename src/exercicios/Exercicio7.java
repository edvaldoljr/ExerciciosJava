package exercicios;

import java.util.Scanner;

/**
 *  Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
 * sua terça parte.
 * Ex:
 * Digite um número: 3.5
 * O dobro de 3.5 é 7.0
 * A terça parte de 3.5 é 1.16666
 */
public class Exercicio7 {

    public static void main(String[] args) {
        //Comando para ler dados do teclado
        Scanner scan = new Scanner(System.in);

        // Comandos de entrada e saída de valores.
        System.out.print("Digite um número:");
        float numero = scan.nextFloat();

        // Atribuição de operadores as variáveis.
        float dobro = numero + numero;
        float terca = numero / 3;

        // Comandos de saída com valores das operações.
        System.out.println("O dobro de " + numero + " é " + dobro);
        System.out.println("A terça parte de " + numero + " é " + terca);
    }
}
