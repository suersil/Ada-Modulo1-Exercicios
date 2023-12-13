//Condicionais e Loops

//3- Receba X notas e calcule a média. (O usuário vai dizer a quantidade de valores que quer calcular)

import java.util.Scanner;
public class Exc3Media {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double somaDasNotas = 0;


        System.out.println("Qual a quatidade de notas?");
        int quantidadeNotas = input.nextInt();

        for (int i = 0; i < quantidadeNotas ; i++) {
            System.out.println("Insira a nota de número " + i + ": ");

            double notaAtual = input.nextDouble();

            somaDasNotas += notaAtual;              //somaDasNotas = somaDasNotas + notaAtual
         //   System.out.println(somaDasNotas);
        }

        double mediaDasNotas = somaDasNotas / quantidadeNotas;
        System.out.println("A média das suas notas é: " + mediaDasNotas);

        input.close();




    }
}
