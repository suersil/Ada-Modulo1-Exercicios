//Exercício 2
//Escreva um programa que captura nome, salário, idade, altura e sexo. Mostre na tela utilizando o printf.

import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;
        double salario;
        int idade;
        double altura;
        String sexo;

        System.out.println("Qual o seu nome?");
        nome = input.next();

        System.out.println("Qual o seu salário?");
        salario = input.nextDouble();

        System.out.println("Qual a sua idade?");
        idade = input.nextInt();

        System.out.println("Qual a sua altura?");
        altura = input.nextDouble();

        System.out.println("Qual o seu sexo?");
        sexo = input.next();

        System.out.printf("Oi %s, voce está feliz com o seu salário de R$ %.2f , tendo %d anos de idade, com uma altura de %.2f sendo do sexo %s ?", nome, salario, idade, altura, sexo);




    }
}