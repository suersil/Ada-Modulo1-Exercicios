//Dado uma array turma onde cada um dos seus elementos é uma array com as notas de cada um dos alunos,
//calcule e mostre a média de cada aluno e a média da turma.

public class Exc2ArrayTurma {
    public static void main(String[] args) {

        int[][] turma = {
                {8, 9, 7, 8},
                {9, 8, 7, 9},
                {6, 7, 8, 6},
        };

        calcularMedias(turma);
    }

    public static void calcularMedias(int[][] turma) {

        // Calcular e exibir a média de cada aluno:
        for (int i = 0; i < turma.length; i++) {
            int somaNotasAluno = 0;

            for (int j = 0; j < turma[i].length; j++) {
                somaNotasAluno += turma[i][j];
            }

            double mediaAluno = (double) somaNotasAluno / turma[i].length;
            System.out.println("Média do Aluno " + (i + 1) + ": " + mediaAluno);
        }


        // Calcular e exibir a média da turma:
        double somaMediasTurma = 0;
        for (int i = 0; i < turma.length; i++) {
            int somaNotasAluno = 0;

            for (int j = 0; j < turma[i].length; j++) {
                somaNotasAluno += turma[i][j];
            }

            double mediaAluno = (double) somaNotasAluno / turma[i].length;
            somaMediasTurma += mediaAluno;
        }

        double mediaTurma = somaMediasTurma / turma.length;
        System.out.printf("Média da Turma: %.2f" ,mediaTurma);
    }
}






