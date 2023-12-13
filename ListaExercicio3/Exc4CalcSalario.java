//Função

//4- Escreva uma função que recebe o nome de um funcionário, seu número de horas trabalhadas por mês, o valor da hora
//e calcula o salário anual desse funcionário. (Mostre o valor com 2 casas decimais após o ponto).

import java.util.Scanner;
public class Exc4CalcSalario {

    public static void main (String[] args){

        //Recebendo dados do funcionário:
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, informe o seu nome");
        String nome = input.next();

        System.out.println("Quantas horas voce trabalha mensalmente?");
        double horasTrabalhadas = input.nextDouble();

        System.out.println("Qual o valor pago pela hora trabalhada ? (R$)");
        double valorHora = input.nextDouble();

        System.out.println(nome + ",");
        calculoSalarioAnual(horasTrabalhadas, valorHora);

        input.close();
    }

    public static void calculoSalarioAnual( double num1 , double num2){

        double salarioMensal = num1 * num2;
        double salarioAnual = salarioMensal * 12;

        System.out.printf("O seu salário anual é : R$ %.2f" ,salarioAnual );

    }

}
