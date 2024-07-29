package org.example;


/**
 * antikatista kai diagrafei enan xaraxthra apo ena string
 */

public class StringReplaceAndDelete {

    public static void main(String[] args) {
        String s ="this-is a string";

        s=s.replace("-","&");
        System.out.println(s);

        //antikatastash me keno shmainei diagrafh
        s=s.replace("&","");
        System.out.println(s);
    }
}
