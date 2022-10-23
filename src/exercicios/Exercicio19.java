package exercicios;

/**
 * Imprima a soma de 1 até 1000.
 */
public class Exercicio19 {

    public static void main(String[] args) {

        int soma = 0;
        int i = 1;

        while (i <= 1000) {
            soma = soma + i;
            System.out.println(soma);
            i++;
        }


        for ( ; i <= 1000; i++) {
            soma = soma + i;
            System.out.println(soma);
        }
    }

}
