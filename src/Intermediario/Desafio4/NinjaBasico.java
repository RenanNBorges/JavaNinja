package Intermediario.Desafio4;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    tipoHabilidade habilidade;

    public NinjaBasico(String nome, int idade, tipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void executarHabilidades() {
        System.out.println(nome + " usou " + habilidade);
    }

    @Override
    public void mostarInformacoes() {
        System.out.println(" ======= Ninja Básico ======= ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }
}
