package org.example;

public class ArrayPopulatedUnsized {

    public static void main(String[] args) {

        //initialize - populate the array
        int[] ages = {19,20,23,22,30};

        //print the array
        for (int i = 0; i <ages.length ; i++) {
            System.out.print(ages[i] + " ");
        }
        System.out.println("\n");
        //print the array elements with more safe way
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
