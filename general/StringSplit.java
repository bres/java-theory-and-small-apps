package org.example;

public class StringSplit {

    public static void main(String[] args) {

        String s = "athens university of economics";

        String[] tokens = s.split(" ");

        for (String token:tokens) {
            System.out.println(token);
        }
    }

}
