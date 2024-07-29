package org.example;

import java.util.Scanner;

/**
 * ylopoishs aploy ypologisth
 */

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int choice;
        int num1=0;
        int num2 =0;

        do {
            showMenu();
            choice = in.nextInt();

            if ((choice >=1) && (choice<=5)) {
                System.out.println("doste dyo aritmoys");
                num1 =in.nextInt();
                num2 =in.nextInt();
            }
            switch (choice) {
                case 1:
                    System.out.println("atroisma" +add(num1,num2));
                    break;
                case 2:
                    System.out.println("diafora" +sub(num1,num2));
                    break;
                case 3:
                    System.out.println("ginomeno" +mul(num1,num2));
                    break;
                case 4:
                    System.out.println("phliko" +div(num1,num2));
                    break;
                case 5:
                    System.out.println("ypoloipo" +mod(num1,num2));
                    break;
                case 6:
                    System.out.println("antio");
                    break;
                default:
                    System.out.println("doste epilogh apo 1-6");
                    break;
            }
        }while (choice !=6);
    }

    public static int add (int num1,int num2) {
        return num1 +num2;
    }
    public static int sub (int num1,int num2) {
        return num1 -num2;
    }
    public static int mul (int num1,int num2) {
        return num1 *num2;
    }
    public static int div (int num1,int num2) {
        return num1 /num2;
    }
    public static int mod (int num1,int num2) {
        return num1 %num2;
    }

    public static void showMenu() {
        System.out.println("epilexte");
        System.out.println("1 gia prostesh");
        System.out.println("2 gia afairesh");
        System.out.println("3 gia pollaplasiasmo");
        System.out.println("4 gia diairesh");
        System.out.println("5 gia ypoloipo");
        System.out.println("6 gia exodo");
        System.out.println("doste epilogh");
    }
}
