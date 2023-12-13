//Condicionais e Loops

//1- Dado um inteiro, X, execute as seguintes ações condicionais:
//a. Se X for ímpar, imprima "Weird"
//b. Se X for par e estiver no intervalo inclusivo de 2 a 5, imprima "Not Weird"
//c. Se X for par e estiver no intervalo inclusivo de 6 a 20, imprima "Weird"
//d. Se X for par e maior que 20, imprima "Not Weird"

import java.util.Scanner;

public class Exc1Inteiros {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);

        System.out.println(" Escreva 1 inteiro ");
        int x = input.nextInt();

        if (x % 2 != 0){
            System.out.println("Weird!");
        }
        else if (x >= 2 && x <= 5) {
            System.out.println("Not Weird!");

        } else if (x >= 6 && x <= 20) {
            System.out.println("Weird!");
        }
        else if ( x > 20){
            System.out.println("Not Weird!");
        }

    input.close();
    }
}
