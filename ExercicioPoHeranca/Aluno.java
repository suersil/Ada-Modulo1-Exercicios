package ExercicioPoHeranca;

public class Aluno extends Pessoa {

    String matricula;

    @Override
    public void apresentar() {
        System.out.println("Sou aluno, me chamo " + this.nome + ", minha matricula é " + this.matricula);
    }

    public final void emitirCarteriaEstudantil(String dataEmissao){
        System.out.println("Carteira estudantil emitida em " + dataEmissao + " para o aluno "
                + this.nome + ", matricula " + this.matricula);
    }


}