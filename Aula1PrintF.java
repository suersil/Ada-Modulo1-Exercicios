import java.util.Scanner;

public class Aula1PrintF {

    public static void main(String[] args){
        System.out.print("Hello, World!\n"); // \n = usado para pular linha

        //Print , Println , Printf
        //System.out.print(""\n); -> Para pular linha tbm, sem usar println

        // PRINTF() = an optional method to ocntrol, format, and display text to the console
        //            two arguments = format string + (object/variable/value)
        //            % [flags] [precision] [width] [conversion-character]

        boolean myBolean = true;    // "%b"
        char myChar = '@';          // "%c"
        String myString = "Sue";    // "%s"
        int myInt = 27;             // "%d"
        double myDouble = 2023;     // "%f"

        // [conversion-character]
        System.out.printf("%b",myBolean);
        System.out.printf("%c",myChar);
        System.out.printf("%s",myString);
        System.out.printf("%d",myInt);
        System.out.printf("%f",myDouble);
        // "%n" equivale ao "\n" - mas só funciona no printF

        System.out.println("A " + myString + " tem " + myInt + " anos de idade.");
        System.out.printf("A %s tem %d anos de idade%n", myString, myInt);

        // [width] - minimum number of characters to be written as output. Ex:
        System.out.printf("Hello %10s",myString); //o numero antes do '%' indica quantos characters (podem ser espaços em branco tbm) entre o "Hello" e a String

        // [precision] - sets/limit the number of digits (after decimal '.')  /Precision when outputting floating-point values. Ex:
        System.out.printf("You have this much money %.2f ",myDouble);

        // [flags] - add an effect to output based on the flag added to format specifier
        //              - : left-justify
        //              + : output a plus (+) or minus (-) sign for a numeric value
        //              0 : numeric values are zero-padded
        //              , : comma grouping separator if numbers > 1000

        //Input e Output
        Scanner input = new Scanner(System.in);

        String txt = input.nextLine();
        System.out.println(txt);

        //Data Types
        // ex: var teste = 1.0;  -> Se criar uma variavel "var" (sem dizer tipo da variavel) o Java denominará automaticamente o tipo a depender do valor informado.

        //Operadores - incrementos

    }
}
