package org.example;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,gradesSum,average ;

        System.out.println("doste plhtos mathimatos");
        n =in.nextInt();
        System.out.println("doste synolo batmologias");
        gradesSum = in.nextInt();

        if ( n!=0) {
            average = gradesSum / n;

            if (average >=0) {
                System.out.printf("mesos oros %d arista", average);
            } else if (average >=6 ) {
                System.out.printf("mesos oros %d lian kalos", average);
            } else if (average >=5 ) {
                System.out.printf("mesos oros %d kalos", average);
            }else {
                System.out.printf("mesos oros %d kato apo thn bash", average);
            }
        }else {
            System.out.println(" to plhtos ton mathmaton den mporei na einai 0");
        }
    }
}
