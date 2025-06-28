package Basico;

public class Array {
    public static void main(String[] args) {

        String[] team7 = new String[3];
        team7[0] = "Naruto";
        team7[1] = "Sasuke";
        team7[2] = "Sakura";

        System.out.println("Integrantes do Time 7:");
        for (int i = 0; i < team7.length; i++) {
            System.out.println(team7[i]);
        }

        int[] a = {1,2,3};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i+1]);
        }
    }
}
