package Basico;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short max = 5;
        short total = 0;
        short choice = 0;
        String[] ninjas = new String[max];

        while (total < max) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            choice = sc.nextShort();

            if (choice == 3) {
                break;
            }
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Digite o Nome do Ninja: ");
                    ninjas[total] = sc.nextLine();
                    total++;
                    break;
                case 2:
                    System.out.println("Ninjas Registrados:");
                    for (int i = 0; i < total; i++) {
                        System.out.println(i+1 + ". " + ninjas[i]);
                    }
            }
        }

        sc.close();
    }
}
