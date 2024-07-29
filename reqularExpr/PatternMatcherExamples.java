package org.example.ch3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherExamples {

    public static void main(String[] args) {

        //String s1 ="login:george;pass:123456;";
        //Pattern patternGreedy = Pattern.compile(".*;");

        //String s2 ="B31:F45:D55:";

        //Pattern patternNonGreedy = Pattern.compile(".*?;");
        //Pattern patternStartOfString = Pattern.compile("^[A-Z].*?:");

        //Matcher matcher = patternStartOfString.matcher(s2);


        //String s3 ="B31:F454:D55:H78:";
        //afairesi synolon
        //Pattern patternNegation = Pattern.compile("[A-Z&&[^BFD]].*?:");

        //tomh synolon
        //Pattern patternCut = Pattern.compile("[A-Z&&[BFD]].*?:");

        //enosh synolon
        //Pattern patternUnion = Pattern.compile("[A-C[M-Z]].*?:");
        //Matcher matcher = patternUnion.matcher(s3);

        //
        String s ="12/31/2000";
        Pattern patterndate = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = patterndate.matcher(s);
        if (matcher.matches()){
            String month = matcher.group(1);
            String day = matcher.group(2);
            String year = matcher.group(3);

            String out = day + "/" +month + "/" + year + "\n";
            System.out.println(out);
        }else
            System.out.println("Pattern not matches");
         while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
