package org.example;

/**
 *  dimioyrgei enan pinaka me new
 *  kai ton arxikopoei mesa ston kodika
 * @author bres george
 */
public class ArrayPopulatedHardCoded {

    public static void main(String[] args) {
        // initialize-populate the array
        int[] ages = new int[5];
        ages[0]=19;
        ages[1]=20;
        ages[2]=21;
        ages[3]=22;
        ages[4]=23;

        //print the array elements
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i] + " ");
        }

    }

}
