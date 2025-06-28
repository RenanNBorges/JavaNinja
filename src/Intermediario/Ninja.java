package Intermediario;

public abstract class Ninja {
    String nome;
    int idade;
    String cla;
    tipoVilaOculta vilaOculta;

    public Ninja(String nome, int idade,  tipoVilaOculta vilaOculta) {
        this.nome = nome;
        this.idade = idade;
        this.vilaOculta = vilaOculta;

    }

    void usarKunai(){
        System.out.println(nome + " atirou uma Kunai");
    }

    void apresentar() {
        System.out.println("Oi! Meu nome é " + nome + " e sou um ninja da Vila Oculta da " + vilaOculta);
    }

    public abstract void usarJutsu();

    enum tipoVilaOculta {FOLHA, NUVEM, AREIA}
}
