////Condicionais e Loops

//Dado um número encontre o seu fatorial.

import java.util.Scanner;
public class Exc5Fatorial {

    public static void main(String[] args){

        int fatorial = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Escolha um número: ");
        int numeroEscolhido = input.nextInt();

        // Loop
        for (int n = numeroEscolhido; n > 0 ; n--) {
            fatorial *= n;
        }
        System.out.println(fatorial);

        input.close();
    }
}
