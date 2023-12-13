package ExercicioPoHeranca;

public class Atendente extends Funcionario{

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Sou atendente " + this.nome + ", Se voce precisar de ajuda pode me chamar.");
    }

    @Override
    public void baterPonto() {
        System.out.println("Colhendo Digital");

    }
}
