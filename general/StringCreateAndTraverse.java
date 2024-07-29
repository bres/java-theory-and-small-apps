package org.example;

/**
 * djmioyrgei kai diasxizei enan enan toys xarakthres enos string
 * @author bres george
 *
 */

public class StringCreateAndTraverse {
    public static void main(String[] args) {
        String s1 = "this is a string";

        for (int i = 0; i <s1.length() ; i++) {
            System.out.print(s1.charAt(i));
        }
        System.out.println();

        // antistrofh diasxish
        for (int i = s1.length()-1; i >=0 ; i--) {
            System.out.print(s1.charAt(i));
        }
    }
}

