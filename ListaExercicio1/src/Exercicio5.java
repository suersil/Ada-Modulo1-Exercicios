//Exercício 5
//Faça um programa que calcula o IMC (IMC = peso / (altura * altura))
public class Exercicio5 {

    public static void main(String[] args){

        double alturaPaciente = 1.80;
        double pesoPaciente = 70;
        double imc = pesoPaciente / (alturaPaciente * alturaPaciente);

        System.out.printf("O IMC é: %.2f " , imc);

        if (imc < 17) {
            System.out.println ("Muito abaixo do peso");
        }

        if (imc >= 17 && imc <= 18.49) {
            System.out.println ("Abaixo do peso :(");
        }

        if (imc >= 18.50 && imc <= 24.99) {
            System.out.println ("Peso normal ;)");
        }

        if (imc >= 25 && imc <=29.99) {
            System.out.println ("Acima do peso :/");
        }

        if (imc >= 30 && imc <= 34.99) {
            System.out.println ("Obesidade 1 :S");
        }

        if (imc >= 35 && imc <= 39.99) {
            System.out.println ("Obesidade 2 (Severa) :o");
        }
        if (imc > 40) {
            System.out.println ("Obesidade 3 (Mórbida) :O");
        }

    }
}
