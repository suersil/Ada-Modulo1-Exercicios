//Condicionais e Loops

//2- Desenvolver uma calculadora que o usuário será capaz de escolher uma das opções abaixo e passar 2 números para o processamento.
//i. Somar
//ii. Subtrair
//iii. Dividir // não permitir divisão por ZERO
//iv. Multiplicar
//v. Resto
//vi. Raiz
//vii. Potência

import java.util.Scanner;
import java.lang.Math;
public class Exc2Calculadora {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Escolha uma opção do menu:\n A-Somar\n B-Subtrair\n C-Dividir\n D-Multiplicar\n E-Resto\n F-Raiz\n G-Potência\n");
        String escolha = input.nextLine();

        System.out.println("Informe 2 números para realizar a operação");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        double result;

        switch (escolha) {
            case "a":
                System.out.println("O resultado da soma é: " + (result = num1 + num2));
                break;

            case "b":
                System.out.println("O resultado da subtração é: " + (result = num1 - num2));
                break;

            case "c":
                if ( num2 != 0){
                    System.out.printf("O resultado da divisão é: %.2f" , + (result = (double) num1 / num2));
                } else {
                    System.out.println("Não é permitido divisão por O. Recomece e escolha um novo número");
                }
                break;

            case "d":
                System.out.println("O resultado da multiplicação é: " + (result = num1 * num2));
                break;

            case "e":
                System.out.println("O resto é: " + (result = num1 % num2));
                break;

            case "f":
                System.out.println("A raiz (quadrada) de " + num1 + " é: " + Math.sqrt(num1) + " e a raiz (quadrada) de " + num2 + " é: " + Math.sqrt(num2));
                break;

            case "g":
                System.out.println("A potência é: " + + Math.pow(num1, num2));
                break;

            default:
                System.out.println("Opção inválida. Recomece");
        }

    input.close();
    }
}

//        if (escolha == 1){
//            result = num1 + num2;
//        } else if (escolha == 2) {
//            result = num1 - num2;
//        } else if (escolha == 3 && escolha != 0){
//            result = (double) num1 / num2;
//        } else if (escolha == 4){
//            result = num1 * num2;
//        } else if (escolha == 5) {
//            result = num1 % num2;
//        } else if (escolha == 6) {
//            result =;
//        } else if (escolha == 7){
//            result =;


    //java.lang.Math.sqrt()
// Returns the square root of a value of type double passed to it as argument. If the argument is NaN or negative, then the result is NaN.
// If the argument is positive infinity, then the result is positive infinity.
// If the argument passed is positive zero or negative zero then the result will be same as that of the argument.



    //java.lang.Math.pow()
// Is used to calculate a number raise to the power of some other number.
// This function accepts two parameters and returns the value of first parameter raised to the second parameter. There are some special cases as listed below:
//If the second parameter is positive or negative zero then the result will be 1.0.
//If the second parameter is 1.0 then the result will be same as that of the first parameter.
//If the second parameter is NaN then the result will also be NaN.
//The function java.lang.Math.pow() always returns a double datatype.