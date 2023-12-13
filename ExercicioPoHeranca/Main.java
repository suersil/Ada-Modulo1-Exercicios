package ExercicioPoHeranca;

public class Main {
    public static void main(String[] args){

        Aluno aluno = new Aluno();
        aluno.nome = "Ana";
        aluno.matricula = "0123";
        aluno.apresentar();
        aluno.emitirCarteriaEstudantil("12/12/23");

        Bolsista bolsista = new Bolsista();
        bolsista.nome = "Pedro";
        bolsista.matricula = "0345";
        bolsista.porcentagemDesconto = 30;
        bolsista.apresentar();
        bolsista.emitirCarteriaEstudantil("12 de Dezembro de 2023");


        Funcionario atendente = new Atendente();
        atendente.nome = "Laura";
        atendente.idFuncionario = "003";
        atendente.apresentar();

        Funcionario professor = new Professor();
        professor.nome = "Carlos";
        professor.idFuncionario = "002";
        professor.apresentar();

    }
}
