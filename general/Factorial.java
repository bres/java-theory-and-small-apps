package org.example;

import java.util.Scanner;

/**
 * @author bres.george
 */

public class Factorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i = 1, n;
        int x=0;
        int facto = 1;

        System.out.println("Δώστε εναν ακέραιο αριθμο");

            while (!in.hasNextInt()) {
                System.out.println("μη έγκυρος ακέραιος");
                in.next();//clear the scanner tube
                System.out.println("εισάγεται ενα θετικό ακέραιο(αρνητικό για έξοδο");
            }
            n = in.nextInt();
            if (n<=0) {
                System.out.println("number must be >0");
            }else {
                while (i <= n) {
                    facto = facto * i;
                    i++;
                }
                System.out.printf("Το παραγοντικο του αριθμου %d είναι: %d\n", n, facto);

            }


    }
}