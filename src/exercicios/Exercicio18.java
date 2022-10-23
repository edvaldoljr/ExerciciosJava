package exercicios;

/**
 * Imprima todos os números de 150 a 300.
 */
public class Exercicio18 {

    public static void main(String[] args) {

        int numero;
        int i = 150;

        for ( ; i <= 300 ; i++) {

            System.out.println(i);
        }

        System.out.println("=================");

        while (i <= 300 ) {

            System.out.println(i);
            i++;
        }
    }
}
