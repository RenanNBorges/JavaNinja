package Intermediario.Desafio4;

public class NinjaAvançado extends NinjaBasico{
    String especialidade;

    public NinjaAvançado(String nome, int idade, tipoHabilidade habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostarInformacoes() {
        super.mostarInformacoes();
        System.out.println("Especialdade: " + especialidade);
    }

    @Override
    public void executarHabilidades() {
        super.executarHabilidades();

    }
}
