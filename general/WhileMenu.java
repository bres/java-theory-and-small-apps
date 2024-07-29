package org.example;

import java.util.Scanner;

public class WhileMenu {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num;

        do {
            System.out.println("parakalo epilexte ena aritmo apo 1-3 kai 0 gia exodo");
            num = in.nextInt();

            if (num == 0) {
                System.out.println("dosate to 0");
            } else if (num == 1) {
                System.out.println("dosate to 1");
            } else if (num == 2) {
                System.out.println("dosate to 2");
            } else if (num == 3) {
                System.out.println("dosate to 3");
            } else {
                System.out.println("parakalo epilexte ena aritmo apo 1-3 kai 0 gia exodo");
            }
        } while (num != 0);
        System.out.println("eyxaristoyme");
    }
}
