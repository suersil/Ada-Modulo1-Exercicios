import java.sql.SQLOutput;

//Exercício 4
//Faça um programa que calcula a área das seguintes figuras geométricas - Retângulo, Triângulo, Círculo e Trapézio.
public class Exercicio4 {

    public static void main(String[] args){

        //Área do Retangulo (A = a * b)
        double alturaRetangulo = 5;
        int baseRetangulo = 5;

        System.out.println("A área do Retangulo é " + (alturaRetangulo * baseRetangulo));

        //Áera do Triangulo (A = (a * b) / 2)
        double alturaTriangulo = 10;
        int baseTriangulo = 10;

        System.out.println("A área do Triangulo é " + (alturaTriangulo * baseTriangulo) / 2);

        //Área do Círculo (A = Pi * (r * r))
        double pi = 3.14;
        int raio = 5;

        System.out.println("A área do círculo é " + pi * (raio * raio));

        //Área do Trapézio (A = ((bMaior + bMenor) * a) / 2)
        int baseMaior = 5;
        int baseMenor = 2;
        double alturaTrapezio = 4;

        System.out.println("A área do Trapézio é " + ((baseMaior + baseMenor) * alturaTrapezio) / 2);
    }
}
