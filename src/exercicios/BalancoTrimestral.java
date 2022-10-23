package exercicios;

/**
 * Na empresa em que trabalhamos, há tabelas com o quanto foi gasto em cada mês. Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15.000 reais, em fevereiro, 23.000 reais, e, em março, 17.000 reais, faça um programa que calcule e imprima o gasto total no trimestre e a média mensal de gastos. Siga esses passos:
 *
 * Crie uma classe chamada BalancoTrimestral com um bloco main, como nos exemplos anteriores;
 * Dentro do main (o miolo do programa), declare uma variável inteira chamada gastosJaneiro e inicialize-a com 15.000;
 * Crie também as variáveis gastosFevereiro e , inicializando-as com 23.000 e 17.000, respectivamente. Utilize uma linha para cada declaração;
 * Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras três variáveis;
 * Crie uma variável chamada mediaPorMes e inicialize-a com a divisão de gastosTrimestre por três.
 * Imprima a variável gastosTrimestre.
 */
public class BalancoTrimestral {

    public static void main(String[] args) {


        int gastoJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int gastosTrimestre = gastoJaneiro + gastosFevereiro + gastosMarco;

        int mediaPorMes = gastosTrimestre/3;

        System.out.println("Gastos Trimestre R$: " + gastosTrimestre);

    }
}
