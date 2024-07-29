package org.example;

import java.util.Scanner;

/**
 * anazhthsh xarakthra se ena string poy dinei o xrhsths
 * @author bres george
 */

public class StringSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;

        System.out.println("doste ena string");
        s=in.next();

        // anazhthtsh xarakthra (a)
        System.out.printf("o xarakthras a %s periexetai sto string %s\n",(s.contains("a"))? "" : "den",s);
        System.out.printf("%s", (s.contains("a")) ? (String.format("thesh:&d", 5)) : "");
    }
}
