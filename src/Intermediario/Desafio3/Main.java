package Intermediario.Desafio3;



public class Main {
    public static void main(String[] args) {
        Uchiha Itachi = new Uchiha();
        Itachi.nome = "Itachi";
        Itachi.idade = 28;
        Itachi.missao = "Espionar a Akatsuki";
        Itachi.nivelDeDificuldade = "S+";
        Itachi.statusMissao = "Em Andamento";
        Itachi.habilidadeEspecial = "Sharingan: Amaterasu";

        Itachi.mostarInformações();
        Itachi.mostrarHabilidadeEspecial();

    }
}

