package exercicios;

import java.util.Scanner;

/**
 * Desenvolva um programa que leia uma distância em metros e mostre os valores
 * relativos em outras medidas.
 * Ex:
 * Digite uma distância em metros: 185.72
 * A distância de 85.7m corresponde a:
 * 0.18572Km
 * 1.8572Hm
 * 18.572Dam
 * 1857.2dm
 * 18572.0cm
 * 185720.0mm
 */
public class Exercicio8 {

    public static void main(String[] args) {
        //Comando para ler dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Comandos de entrada e saída.
        System.out.print("Digite uma distância em metros: ");
        float distancia = scanner.nextFloat();

        // Comandos de saída com operadores de conversão e valores das operações.
        System.out.println("Km: " + (distancia / 1000));
        System.out.println("Hm: " + (distancia / 100));
        System.out.println("Dam: " + (distancia / 10));
        System.out.println("dm: " + (distancia * 10));
        System.out.println("cm: " + distancia * 100);
        System.out.println("mm: " + distancia * 1000);

    }
}
