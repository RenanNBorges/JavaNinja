package Intermediario.Desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico Naruto = new NinjaBasico(
                "Naruto", 13, Ninja.tipoHabilidade.NINJUTSU);

        NinjaBasico Sasuke = new NinjaBasico(
                "Sasuke", 13, Ninja.tipoHabilidade.KATON);

        NinjaBasico RockLee = new NinjaBasico(
                "Rock Lee", 13, Ninja.tipoHabilidade.TAIJUTSU);

        NinjaAvançado Itachi = new NinjaAvançado(
                "Itachi", 28, Ninja.tipoHabilidade.GENJUTSU, "Sharingan");

        NinjaAvançado Kakashi = new NinjaAvançado(
                "Kakashi", 32, Ninja.tipoHabilidade.NINJUTSU, "Sharingan Copiador");

        NinjaAvançado Pain = new NinjaAvançado("Pain", 30, Ninja.tipoHabilidade.RINNENGAN, "Caminhos do Rinnengan");

        Naruto.mostarInformacoes();
        Sasuke.mostarInformacoes();
        RockLee.mostarInformacoes();
        Itachi.mostarInformacoes();
        Kakashi.mostarInformacoes();
        Pain.mostarInformacoes();

        Pain.executarHabilidades();



    }
}
