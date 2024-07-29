package org.example.ch3;

public class RegExMatches {

    public static void main(String[] args) {

        // boolean regExEquals = "red".matches("Red");
        //boolean regExOrGreen = "Red".matches(("Red|Green"));
        //boolean regExRedOrGreenFirstLetter= "green".matches("[Rr]ed|[Gg]reen");
        boolean RegExRange="fing".matches("[a-zA-Z]ing");
        boolean RegExRange2="fFing".matches("[a-z][A-Z]ing");


        //System.out.printf("%s", regExEquals ? "matches": "not matches");
        //System.out.printf("%s", regExOrGreen ? "matches": "not matches");
        //System.out.printf("%s", regExRedOrGreenFirstLetter ? "matches": "not matches");
        System.out.printf("%s", RegExRange ? "matches": "not matches");
    }
}
