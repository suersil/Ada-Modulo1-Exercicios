//Exercício 3
//Suponha que precisamos trabalhar em um projeto da NASA que pretende lançar um novo satélite.
// A economia de memória é muito importante nessa missão, pois vamos ter uma quantidade de memória limitada.
// Vamos trabalhar em 3 módulos e não podemos ultrapassar o limite de memória de cada módulo.
// Ao iniciar o programa o operador deve digitar os dados da missão para que armazene todos os dados em cada um dos módulos e no final
// deve ser printado todos os valores por ele escolhidos.
//
//  Módulo 01 - Controle de tempo x funcionários:
//        - Memória disponível: 3 bytes
//        - Requisitos: Armazenar o ano atual da missão (max 9999), quantidade de funcionários envolvidos (max 100).
//
//  Módulo 02 - Controle de distância x velocidade:
//        - Memória disponível: 6 bytes
//        - Requisitos: Armazenar a distância que o satélite ficará da terra (max 2 milhões), velocidade máxima (max 30.000 km/h).
//
//  Módulo 03 - Status da missão:
//        - Memória disponível: 17 bytes
//        - Requisitos: Armazenar o estado da missão (se já iniciou ou não), distância que será percorrida durante a missão em km
//        (max 3 bilhões de km) e calibragem das antenas (número racional com precisão de no mínimo 14 casas decimais).

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            //Modulo 1 - Controle de tempo x funcionários: (Max.3 bytes)
            short ano;                  //2 bytes
            byte quantidade;            //1 byte

            System.out.println("Qual o ano atual da missão?");
            ano = input.nextShort();

            System.out.println("Qual o número de funcionários que estará participando dessa missão?");
            quantidade = input.nextByte();

            System.out.println("Sejam bem vindos a missão X no ano " + ano + ", Boa Sorte a todos os " + quantidade + " participantes! (Max.100)\n");


            //Modulo 2 - Controle de distância x velocidade: (Max. 6 bytes)
            int distanciaSatelite;              //4 bytes
            short velocidadeMax;                //2 bytes

            System.out.println("Qual a distância que o satélite ficará da terra?");
            distanciaSatelite = input.nextInt();

            System.out.println("E qual será sua velocidade máxima (km/h)?");
            velocidadeMax = input.nextShort();

            System.out.println("A distância que o satélite ficará da terra será de " + distanciaSatelite + ", e sua velocidade máxima será de " + velocidadeMax + " km/h");

            //Modulo 3 - Status da missão: (Max 17 bytes)
            String estado;              //1 byte
            long distancia;             //8 bytes
            double calibragem;          //8 bytes

            System.out.println("A missão já foi iniciada? Responda \"S\" (sim) ou \"N\"(não)\n");
            estado = input.next();

            System.out.println("Qual será a distância que será percorrida durante a missão (km)");
            distancia = input.nextLong();

            System.out.println("Qual é a calibragem das antenas (valor preciso)?");
            calibragem = input.nextDouble();

            System.out.println("O estado da missão é: " + estado + " (\"S\"- Sim | \"N\"- Não). A distancia percorrida durante a missão será de " + distancia + "Km, e a calibragem das antenas será de " +calibragem);
    }
}
