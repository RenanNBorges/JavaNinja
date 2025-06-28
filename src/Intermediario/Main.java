package Intermediario;

public class Main {

    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();
        Uchiha Sasuke = new Uchiha();
        Hyuuga Hinata = new Hyuuga();

        Hinata.nome = "Hinata";
        Hinata.usarHabilidade();

        Sasuke.nome = "Sasuke";
        Sasuke.usarHabilidade();

        Naruto.nome = "Naruto";
        Naruto.usarHabilidade();




//
//        System.out.println(" ========= Batalha Ninja Começando! ========= \n    " +
//                batalha[0].nome + " " + batalha[0].cla + " Vs " + batalha[1].nome + " " + batalha[1].cla);
//        int turno = 1;
//        while (batalha[0].vida_atual > 0 && batalha[1].vida_atual > 0) {
//            System.out.println("===== Turno " + turno + " =====");
//            batalha[0].atacar(batalha[1]);
//            System.out.println("-----------------");
//            batalha[1].atacar(batalha[0]);
//            turno++;
//        }
//
//        if (batalha[0].vida_atual == 0) {
//            System.out.print(batalha[1].nome);
//        } else {
//            System.out.print(batalha[0].nome);
//        }
//        System.out.println(" Venceu!");
//
//
//    }


    }
}
