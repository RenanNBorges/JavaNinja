package Basico;

import java.util.Scanner;

public class SwitchCasesStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um Personagem:\n1. Naruto\n2. Sasuke\n3. Sakura");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Naruto: Dattebayo!");
            case 2:
                System.out.println("Sasuke: Itachi...");
                break;
            case 3:
                System.out.println("Sakura: Sasuke-kun!!!");
                break;
            default:
                System.out.println("Erro");
        }

        sc.close();
    }
}
