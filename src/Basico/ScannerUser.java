package Basico;

import java.util.Scanner;

public class ScannerUser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("======= Criação de Ninja =======\nNome do Seu Ninja: ");

        String nameNinja = input.nextLine();

        System.out.println("Clã do Seu Ninja: ");
        String claNinja = input.nextLine();

        System.out.println("Idade do seu Ninja: ");

        int ageNinja = input.nextInt();

        System.out.println("***** Ficha Ninja *****\nNome: " + nameNinja + " " + claNinja  + "\nIdade: " + ageNinja);

        if (ageNinja >= 18) {
            System.out.println("Você é maior de idade");
        } else {

            System.out.println("Você não é maior de idade");
        }



        input.close();
    }
}
