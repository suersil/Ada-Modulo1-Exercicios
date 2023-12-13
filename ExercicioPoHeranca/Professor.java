package ExercicioPoHeranca;

public class Professor extends Funcionario{

    String materia;
    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Sou o professor " + this.nome + ", Bom dia!");
    }
    @Override
    public void baterPonto() {
        System.out.println("Colhendo Digital");

    }


}
