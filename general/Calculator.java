package org.example;

import java.io.IOException;
import java.util.Scanner;

/**
 * ypologisths tsephs
 * @author bres george
 */

public class Calculator {

    public static void main(String[] args) throws IOException {
        //dilosh k arxikopoihsh
        Scanner in = new Scanner(System.in);
        int num1,num2,result;

        char ch;

        System.out.println("parakalo doste enter gia kate" +
                " aritmo kai gia to symbolo ths praxhxs");
        num1 = in.nextInt();
        ch = (char)System.in.read();
        num2 = in.nextInt();


        //switch
        switch (ch) {
            case '+':
                result =num1+num2;
                break;
            case '-':
                result =num1-num2;
                break;
            case '*':
                result =num1*num2;
                break;
            case '%':
                result =num1%num2;
                break;
            default:
                result = 0;
                break;
        }
        System.out.println("to apotelesma einai :"+result);

    }
}
