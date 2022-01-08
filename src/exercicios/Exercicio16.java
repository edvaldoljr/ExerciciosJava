package exercicios;

import java.util.Scanner;

/**
 * Escreva um programa para calcular a redução do tempo de vida de um
 * fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
 * já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
 * quantos dias de vida um fumante perderá e exiba o total em dias.
 */
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Comandos de entrada e saída de dados.
        System.out.println ("-------------------");
        System.out.println (" DEVDRIVER ALERTA! ");
        System.out.println ("FUMAR TIRA SUA VIDA");
        System.out.println ("-------------------");
        System.out.println ("Vamos calcular quantos anos de vida perderás para o cigarro?");
        System.out.println ("Digite quantos cigarros fuma por dia: ");
        double cigarrosFumadoPorDia = scan.nextInt();
        System.out.println ("Há quantos anos fuma: ");
        double anosFumando = scan.nextInt();

        //Atribuição de variáveis com operações.
        double horasFumando = (cigarrosFumadoPorDia * 10)/60;
        double diasPerdidos = (horasFumando * 365)/24;
        double perdidos = diasPerdidos * anosFumando;

        //Comandos de saída de dados com operações.
        System.out.println("Com " + cigarrosFumadoPorDia + " cigarros fumados por dia, durante " + anosFumando + " anos.");
        System.out.println("Você perderá " + perdidos + " dias de vida!");
    }
}
