package Intermediario.Desafio3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusMissao;


    public void mostarInformações(){
        System.out.println("======= Ficha Ninja=======\n" +
                "Nome: " + nome +
                "\nIdade: " + idade +
                "\nMissão: " + missao +
                "\nNível de Dificuldade: " + nivelDeDificuldade +
                "\nStatus: " + statusMissao);
    }
}
