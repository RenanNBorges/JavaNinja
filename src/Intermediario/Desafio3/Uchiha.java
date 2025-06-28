package Intermediario.Desafio3;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println(nome + " Uchiha usou " + habilidadeEspecial);
    }

    public void mostarInformações(){
        System.out.println("======= Ficha Ninja=======\n" +
                "Nome: " + nome +
                "\nIdade: " + idade +
                "\nMissão: " + missao +
                "\nNível de Dificuldade: " + nivelDeDificuldade +
                "\nStatus: " + statusMissao +
                "\nHabilidade: " + habilidadeEspecial);
    }
}
