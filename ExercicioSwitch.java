
public class ExercicioSwitch {
    public static void main(String[] args) {

            int nota = 0;

            int truncatedGrade = nota /10;
            System.out.println(truncatedGrade);

            switch (truncatedGrade) {
                case 10:
                    System.out.println("Uau!");
                case 9:
                    System.out.println("Voce tirou nota A.");
                    break;
                case 8:
                   System.out.println("Voce tirou nota B.");
                   break;
                case 7:
                    System.out.println("Voce tirou nota C.");
                    break;

                default:
                    System.out.println("Voce está de recuperação :/");
            }
    }

}