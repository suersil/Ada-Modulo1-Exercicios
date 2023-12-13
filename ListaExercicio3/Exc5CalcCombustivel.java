//Função

//Joãozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um
//automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de um simples programa.
//Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h).
// Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários.
// Mostre o valor com 3 casas /decimais após o ponto.

public class Exc5CalcCombustivel {

    public static void main(String[] args){

        calculo(80, 10);
    }

    public static void calculo(double velocidade, double tempo){

// Distancia percorrida: Multiplique a velocidade pelo tempo.
        double distancia =  velocidade * tempo;

//Quantidade combustivel necessário: Dividir a  distância percorrida (km) por 12 (km/L)
        double qtdCombustivel = distancia / 12;

        System.out.printf("A quantidade de litros de combustível gastos em uma viagem de um automóvel que faz 12 Km/L é: \n %.3f " ,qtdCombustivel);




    }
}
