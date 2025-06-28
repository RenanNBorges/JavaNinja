package Intermediario;

public class Ninja {
        String nome;
        String cla;
        String aldeia;
        char sexo;
        String rank;
        double moedas = 0;
        int vida_max;
        int vida_atual;
        int forca;

        public Ninja(String nome, String cla, String aldeia, char sexo, String rank, double moedas, int vida_max, int vida_atual, int forca) {
                this.nome = nome;
                this.cla = cla;
                this.aldeia = aldeia;
                this.sexo = sexo;
                this.rank = rank;
                this.moedas = moedas;
                this.vida_max = vida_max;
                this.vida_atual = vida_atual;
                this.forca = forca;
        }

        Jutsu[] jutsus = new Jutsu[10];

        public void atacar(Ninja ninja) {
        System.out.println(this.nome + " PV: " + this.vida_max + "/" + this.vida_atual + "   |   " + ninja.nome + " PV: " + ninja.vida_max + "/" + ninja.vida_atual);
            System.out.println(this.nome + " Atacou " + ninja.nome);
            ninja.vida_atual = ninja.vida_atual - (this.forca / 2);
            System.out.println("O golpe tirou " + this.forca/2 + " de dano\n" + ninja.nome + " ficou com " + ninja.vida_atual + " pontos de vida.");
        }

        public void usarHabilidade() {
        }

}
