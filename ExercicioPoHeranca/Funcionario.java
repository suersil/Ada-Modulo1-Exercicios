package ExercicioPoHeranca;

public abstract class Funcionario extends Pessoa {

    String idFuncionario;
    String nome;

    @Override
    public void apresentar() {
        System.out.println("Oi sou funcionario da escola, meu id é: " + this.idFuncionario);
    }

    public void baterPonto() {
        System.out.println("Colhendo a Digital: " + this.nome + " " + this.idFuncionario);

    }
}