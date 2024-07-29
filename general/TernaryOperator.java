package org.example;

import java.util.Scanner;

/**
 * ypologizei to apolyto me thn xrhsh triadikoy telesth
 * @author george bres
 */

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,abs;

        n = in.nextInt();
        abs = (n>=0)? n:-n;

        System.out.printf("h apolyth timh toy n einai %d:",abs);
    }
}
