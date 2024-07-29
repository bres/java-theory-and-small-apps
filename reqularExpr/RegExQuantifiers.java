package org.example.ch3;


import java.sql.SQLOutput;
import java.util.Scanner;

/**
 *  ? (0 or 1 appearances of the latest token
 *  + (1 or more appearances)
 *  * (0 or more appearances)
 *  {n} (n appearances)
 *  {n,m} (between n to m appearances)
 *  {n,}  (at least n appearances)
 *  {,m} (not more appearances than m)
 */
public class RegExQuantifiers {

    public static void main(String[] args) {
        /*
        * elenxei an h dieythnsh email einai valid
        * xxx.yyy@zzz.com
        * xxx.yyy@zzz.gr
        * yyy@zzz.com
        * yyy@zzz.gr
         */

        boolean isValidEmail = "geo.bres@gmail.com".matches("\\w*\\.?\\w+@\\w+\\.(com|gr)");

        //System.out.printf("%s", isValidEmail ? "Matches" : "Not matches");

        //data apo ton xrhsth  me morfh 2 grammata kefalaia akoloytemena apo payla kai akoloytoymena apo 7 aritmoys
        //Scanner in = new Scanner(System.in);
        //PROMPT THE USER TO ENTER THE INPUT
        //System.out.println("enter the input");
        //String input = in.nextLine();

        //Define the regular expression
        //String pattern = "^[A-Z]{2}-\\d{7}$";
        //boolean isTwoLettersDashSevenDigits = input.matches(pattern);
        //System.out.printf("%s", isTwoLettersDashSevenDigits ? "Matches" : "Not matches");
        //in.close();

        //split one or more spaces
        String[] tokens = "java   advanced   level".split("\\s+");
        for (String token:tokens){
            System.out.println(token);
        }

        String s = "java   advanced   level".replaceAll("\\s+"," ");
        System.out.println(s);

        String s1 ="george bres".replaceAll("(.*)\\s+(.*)","$2 $1");
        System.out.println(s1);
    }
}
