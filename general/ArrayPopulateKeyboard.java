package org.example;

import java.util.Scanner;

public class ArrayPopulateKeyboard {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] ages= new int[5];

        for (int i = 0; i <ages.length ; i++) {
            System.out.println("doste ena aritmo gia thn thesh:"+ (i+1));
            /**
             *  dinoume i+1 gia na einai pio filiko gia ton xrhsth
             */
            ages[i] = in.nextInt();
        }
        for (int i = 0; i <ages.length ; i++) {
            System.out.println(ages[i]+ " ");
        }
        in.close();
    }
}
