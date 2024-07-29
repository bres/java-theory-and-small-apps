package org.example;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,result;

        try {
            System.out.println("doste dyo aritmoys");
            a = in.nextInt();
            b = in.nextInt();

            result = a/b;
            System.out.println("to apotelesma ths diareshs einai :" + result);
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println("apagoryetai h diaresh me to 03");
        }
    }
}