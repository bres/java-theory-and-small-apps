package org.example;

import java.util.Scanner;

/**
 *
 * ylopoiei ena menu me thn xrhsh ths metodoy
 */

public class MethodMenu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("epitixis eisagogh");
                    break;
                case 2:
                    System.out.println("epitixis enhmerosh");
                    break;
                case 3:
                    System.out.println("epitixis diagrafh");
                    break;
                case 4:
                    System.out.println("epitixis anazhthsh");
                    break;
                case 5:
                    System.out.println("antio");
                    break;
                default:
                    System.out.println("doste epilogh apo 1-5");
                    break;
            }
        } while (choice != 5);
    }

    public static void showMenu() {
        System.out.println("epilexte");
        System.out.println("1 gia eisagogh");
        System.out.println("2 gia enhmerosh");
        System.out.println("3 gia diagrafh");
        System.out.println("4 gia anazhthsh");
        System.out.println("5 gia exodo");
        System.out.println("doste epilogh");
    }

}
