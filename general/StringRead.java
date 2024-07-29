package org.example;

import java.util.Scanner;

/**
 * simple string I/O program
 * @george bres
 */
public class StringRead {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;

        System.out.println("parakalo doste ena string");
        s =in.next();
        System.out.println("dosate to string:" +s);
        in.close();
    }
}
