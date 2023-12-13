//Função

//Crie a função converterTemperatura(...), onde você deve receber a temperatura atual, a medida atual e a medida final.
//Após a conversão mostrar na tela o resultado final.

//Ex:   Temperatura atual = 100
//      Medida atual = celsius
//      Medida final = kelvin
//      Output = 373,15


import java.util.Scanner;
public class Exc2ConvertendoTemp {
    public static void main(String[] args) {

        //Recebendo valores:

        Scanner input = new Scanner(System.in);
        System.out.println("Qual a temperatura atual? ");
        double temperaturaAtual = input.nextDouble();

        System.out.println(" 1-Celsius ou 2-Kelvin? ");
        int medidaAtual = input.nextInt();

        convertendoTemp(temperaturaAtual, medidaAtual);
    }
    public static void convertendoTemp(double temperaturaAtual, int medidaAtual) {

        double temperaturaFinal = 0;

        switch (medidaAtual) {
            case 1:
                System.out.println("A medida atual é " + temperaturaAtual + " Celsius");

                temperaturaFinal = temperaturaAtual + 273.15;
                String medidaFinal = "kelvin";

                System.out.println("A temperatura final/convertida é: " + temperaturaFinal + " " + medidaFinal);
                break;

            case 2:
                System.out.println("A medida atual é " + temperaturaAtual + " Kelvin");

                temperaturaFinal = temperaturaAtual - 273.15;
                String medidaFinal2 = "Celsius";

                System.out.println("A temperatura final/convertida é: " + temperaturaFinal + " " + medidaFinal2);
                break;

            default:
                System.out.println("Temperatura não cadastrada!");
        }
    }
}

