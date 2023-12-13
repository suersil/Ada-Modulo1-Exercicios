//Condicionais e Loops

//4- Dado um inteiro, X, imprima seus primeiros 10 múltiplos. Cada múltiplo X * i (onde 1 <= i <= 10) deve ser impresso em uma
//nova linha na forma: X x i = resultado.

import java.util.Scanner;
public class Exc4Multiplos {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

            int i;

        System.out.println("Escolha 1 número inteiro: ");
        int num = input.nextInt();

        for ( i = 0; i <= 10; i++) {
            int x = num * i;

            System.out.println(num + "x" +i + " = " + x);

        }

        input.close();
    }

}
