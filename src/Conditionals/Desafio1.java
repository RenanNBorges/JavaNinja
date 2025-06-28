package Conditionals;

public class Desafio1 {
    public static void main(String[] args) {
        String nameNinja1 = "Naruto";
        int ageNinja1 = 13;
        String missionName1 = "Achar Cachorro Perdido";
        char missionRank1 = 'D';
        String missionStatus1;

        String nameNinja2 = "Sasuke";
        int ageNinja2 = 16;
        String missionName2 = "Ir atrás do Renegado Uchiha";
        char missionRank2 = 'S';
        String missionStatus2;

        String nameNinja3 = "Sakura";
        int ageNinja3 = 16;
        String missionName3 = "Ajudar Velinha";
        char missionRank3 = 'D';
        String missionStatus3;


    System.out.println(nameNinja1 + "foi realizar a missão: " + missionName1 + "...");
    if (ageNinja1 < 15 && (missionRank1 != 'C' && missionRank1 != 'D' )) {
        missionStatus1 = "Não Concluída";
    } else {
        missionStatus1 = "Concluída";
    }

    System.out.println("Status da Missão: = " + missionStatus1);


    System.out.println(nameNinja2 + " foi realizar a missão: " + missionName2 + "...");
    if (ageNinja2 < 15 && missionRank2 != 'C' && missionRank2 != 'D') {
        missionStatus2 = "Não Concluída";
    } else {
        missionStatus2 = "Concluída";
    }

    System.out.println("Status da Missão: = " + missionStatus2);


    System.out.println(nameNinja3 + " foi realizar a missão: " + missionName3 + "...");
    if (ageNinja3 < 15 && missionRank3 != 'C' && missionRank3 != 'D') {
        missionStatus3 = "Não Concluída";
    } else {
        missionStatus3 = "Concluída";
    }

    System.out.println("Status da Missão: = " + missionStatus3);
    }
}

