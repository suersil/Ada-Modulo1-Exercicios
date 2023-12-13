package ExercicioPoHeranca;

public final class Bolsista extends Aluno{

    int porcentagemDesconto;

    @Override
    public void apresentar() {
        super.apresentar();         //chamando a classe apresentar do SUPER(pai), podendo acrescentar + coisas.
        System.out.println("Possuo uma bolsa de: " + this.porcentagemDesconto + " %");
    }
}
