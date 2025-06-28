package Intermediario;

public class Uchiha extends Ninja {

    public Uchiha(String nome, int idade, tipoVilaOculta vilaOculta) {
        super(nome, idade, vilaOculta);
        this.cla = "Uchiha";
        this.vilaOculta = tipoVilaOculta.FOLHA;
    }

    @Override
    public void usarJutsu() {
        System.out.println("Jutsu: Bola de Fogo!");
    }
}
