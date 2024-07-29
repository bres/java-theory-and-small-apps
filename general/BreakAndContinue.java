package org.example;

/**
 *  paradeigmata break kai continue
 * @author george bres
 */



public class BreakAndContinue {

    public static void main(String[] args) {
        int i =0;
        int j =0;
        int result = 0;

        //tha ektelestei 5 fores
        while (true) {
            i++;
            if (i ==5) break;
            System.out.println("ekteloumai");
        }
        /**
         *  briskei to atroisma ton 10 proton aritmon ektos toy 5 aritmoy
         *
         */
         while ( j<=10) {
             j++;
             if (j ==5) continue;
             result = result + j;
             System.out.println(result);

         }
    }
}
