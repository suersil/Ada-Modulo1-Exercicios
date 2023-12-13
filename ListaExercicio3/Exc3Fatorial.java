//Função

//3- Dado um número escreva uma função que retorna o seu fatorial.

import java.util.Scanner;
public class Exc3Fatorial {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int numeroEscolhido;

        System.out.println("Escolha um número para achar o seu fatorial: ");
        numeroEscolhido = input.nextInt();

        fatorial(numeroEscolhido);
    }

    public static void fatorial(int num1){

        int fatorial = 1;

        // Loop
        for (int n = num1; n > 0 ; n--) {
            fatorial *= n;
        }
        System.out.println(fatorial);
    }

}

