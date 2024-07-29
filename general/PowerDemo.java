package org.example;

import java.util.Scanner;

/**
 * @author Bres.George
 *
 */

public class PowerDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        long result = 1;
        int i = 1;

        System.out.println("δωσε δυο ακέραιους");
        a = in.nextInt();
        b = in.nextInt();

        while (i <= b) {
            result = result * a;
            i++;
        }
        System.out.printf("Ο αριθμός % d υψώνεται στην δύναμη % d με αποτέλεσμα % d", a, b, result);

    }
}