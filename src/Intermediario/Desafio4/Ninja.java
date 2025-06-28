package Intermediario.Desafio4;

public interface Ninja {

    void mostarInformacoes();

    void executarHabilidades();

    enum tipoHabilidade {
        TAIJUTSU, NINJUTSU, GENJUTSU, KATON, RINNENGAN
    }

}
