
//1- Dado duas arrays A e B, escreva uma função que faça a concatenação das arrays de forma alternada.
// Obs: Ambas as arrays sempre serão do mesmo tamanho e não nulas.

import java.util.Arrays;     //Para imprimir os Arrays com valores certos (String)
import java.util.Scanner;
public class Exc1ArrayAeB {

    public static void main(String[] args){

        int[] a = new int[3];
        int[] b = new int[3];


        Scanner input = new Scanner (System.in);

        //Adicionando valores Array A:
        System.out.println("Escolha o primeiro número da Array \"A\" ");
        a[0] = input.nextInt();

        System.out.println("Escolha o segundo número da Array \"A\" ");
        a[1] = input.nextInt();

        System.out.println("Escolha o terceiro número da Array \"A\" ");
        a[2] = input.nextInt();


        //Adicionando valores Array B:
        System.out.println("Escolha o primeiro número da Array \"B\" ");
        b[0] = input.nextInt();

        System.out.println("Escolha o segundo número da Array \"B\" ");
        b[1] = input.nextInt();

        System.out.println("Escolha o terceiro número da Array \"B\" ");
        b[2] = input.nextInt();

    //Imprimindo Array A e B:
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    //Chamando Metodo/Função:
        concatenacaoArrays(a, b);

        input.close();

    }

    //Criando Metodo para Concatenar as arrays A e B:
    public static void concatenacaoArrays(int[] a, int[] b){

        int sumLength = a.length + b.length;
        // int concatenado[] = new int [6];
        int[] concatenado = new int[sumLength];

        for (int i = 0; i < a.length ; i++) {
            concatenado[i*2] = a[i];
            concatenado[i*2+1] = b[i];
        }

        System.out.println("Arrays concatenadas: " + Arrays.toString(concatenado));
    }


//  Concatenar apenas, sem embaralhar:
//        for (int i = 0; i < a.length ; i++) {
//            concatenado[i] = a[i];
//        }
//        for (int i = 0; i < b.length ; i++) {
//            concatenado[i+a.length] = b[i];
//        }



}



//Arrays.toString() é um método estático da classe array que pertence ao pacote java.util.
//Ele retorna uma representação de string do conteúdo do array especificado. Podemos imprimir arrays unidimensionais usando esse método.