package org.example;

/**
 *  ektyponei ena string se morfh substring
 * @Author george bres
 */
public class SubStringDemo {

    public static void main(String[] args) {

        String s = "this is a string";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i+1));
        }
    }
}
