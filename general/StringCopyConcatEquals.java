package org.example;

import java.util.Scanner;

public class StringCopyConcatEquals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1,s2; //se ayto to shmeio ta s1,s2 einai null

        System.out.println("doste ena string");
        s1=in.next();

        /*
        * parakato antigrafoyme ton deikth s1 ston s2
        * epomenos tora kai to s2 tha deixnei sto idio periexomeno
        */

        s2=s1;

        /*
        * parakato synenonoume ta s1,s2 kai ekxoroyme sto s2
        * to s2 payei na deixnei sto palio periexomeno kai dhmioyrgeite neo
        * string me thn nea synenonmenh timh.to s1 exakoloytei kai deixnei sto palio perieoxmeno
        */

        s2=s1+s2;

        /*
        *parakato sygkrinoume me th equals
        * arxika elgxo gia null giati an to s1=null
        * tha dhmioyrghtei sfalma sthn klhsh ths s1.equals()
         */
        System.out.println("s1 = " + s1 + " s2 = " +s2);
        if ((s1 !=null) && (s1.equals(s2))) {
            System.out.println("ta s1,s2 exoyn to idio periexomeno");
         }else {
            System.out.println("ta s1,s2 den exoyn idio periexomeno");
        }
    }
}
