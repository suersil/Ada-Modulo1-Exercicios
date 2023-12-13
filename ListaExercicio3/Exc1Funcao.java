//Função

//1- Crie uma calculadora onde cada operação tem sua própria função.
// Ex: somar(...), subtrair(...), dividir(...), multiplicar(...)
public class Exc1Funcao {

    public static void main(String[] args) {

        somar(10,20);

        subtrair(100, 50);

        dividir(20,2);

        multiplicar(3,3);


    }

    //Somar
    private static void somar(int num1, int num2) {
        System.out.println("Somando " + num1 + " + " + num2 +":");
        double result = num1 + num2;
        System.out.println(result);
    }


    //Subtrair
    private static void subtrair(int num1, int num2){
        System.out.println("Subtraindo " + num1 + " - " + num2 +":");
        double result = num1 - num2;
        System.out.println(result);
    }

    //Dividir
    private static void dividir(int num1, int num2){
        System.out.println("Dividindo  " + num1 + " / " + num2 + ":");
        double result = num1 / num2;
        System.out.println(result);
    }

    //Multiplicar
    private static void multiplicar(int num1, int num2){
        System.out.println("Multiplicando  " + num1 + " * " + num2 + ":");
        double result = num1 * num2;
        System.out.println(result);
    }
}