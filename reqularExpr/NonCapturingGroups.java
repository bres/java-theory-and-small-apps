package org.example.ch3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonCapturingGroups {

    public static void main(String[] args) {

//        String s ="HelloWorld HelloWorldWorld";
//        Pattern pattern = Pattern.compile("(Hello)(?=World)+");
//        Matcher matcher = pattern.matcher(s);
//
//        while (matcher.find()) {
//            for (int i=1; i<= matcher.groupCount();i++) {
//                System.out.print(matcher.group(i) + " ");
//            }
//            System.out.println();
//        }

        String s = "!@#ANXs";
        Pattern pattern = Pattern.compile("^(?=.*[a-z]).{6,}$");
        Matcher matcher = pattern.matcher(s);

        if(matcher.matches()) {
            System.out.println(matcher.group());
        }else
            System.out.println("password is not correct");
    }
}
