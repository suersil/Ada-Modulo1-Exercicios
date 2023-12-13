//3- Dado um array nums. Definimos uma soma acumulada de um array como nums[i] = soma(nums[0]…nums[i]),
// ou seja, cada elemento deve ser a soma de todos os elementos anteriores e o atual. Por fim, retorne a array com as somas.

import java.util.Arrays;
public class Exc3ArraySoma {

    public static void main (String[] args) {

        int[] num = {1, 2, 3, 4};

        System.out.println(Arrays.toString(num));
        int[] result = soma(num);

        System.out.println("A soma é " + Arrays.toString(result));

    }
    public static int[] soma(int[] num) {

        int[] acumulados =new int[num.length];

        for (int i = 0; i < acumulados.length ; i++) {
            for (int j = 0; j <= i; j++) {
                acumulados[i] += num[j];
            }

        }

        

        return acumulados;


    }
}
