package Intermediario;

public class Ninja{
        String nome;
        String cla;
        String aldeia;
        char sexo;
        String rank;
        double moedas = 0;
        int vida_max;
        int vida_atual;
        int forca;

        public void atacar(Ninja ninja) {
        System.out.println(this.nome + " PV: " + this.vida_max + "/" + this.vida_atual + "   |   " + ninja.nome + " PV: " + ninja.vida_max + "/" + ninja.vida_atual);
            System.out.println(this.nome + " Atacou " + ninja.nome);
            ninja.vida_atual = ninja.vida_atual - (this.forca / 2);
            System.out.println("O golpe tirou " + this.forca/2 + " de dano\n" + ninja.nome + " ficou com " + ninja.vida_atual + " pontos de vida.");
        }

        public void usarHabilidade() {

        }

}
