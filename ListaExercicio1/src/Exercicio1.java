//Exercício 1
//Escreva um programa que captura nome, idade e profissão do usuário e mostra na tela os valores.
//(Utilize a classe Scanner e os 3 métodos print, printf e println).

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;
        String profissao;
        int idade;

        System.out.print("Qual o seu nome?");
        nome = input.nextLine();
        System.out.println("Oi " + nome);

        System.out.println (nome + " qual a sua profissão?");
        profissao = input.next();

        System.out.print("E qual é a sua idade " + nome + " ?\n");
        idade = input.nextInt();

        System.out.printf("Então %s voce tem %d anos de idade, e sua profissão é %s. Parabéns!" ,nome, idade, profissao );

    }
}