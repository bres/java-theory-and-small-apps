package org.example;

/**
 * ypologizei to atroisma kai to ginomeno ton
 * 10 proton aritmon
 * @author bres george
 */

public class ForSumMul {
    public static void main(String[] args) {
        int sum =0;
        int mul =1;

        for (int i = 0; i <= 10; i++) {
            sum = sum+i;
        }
        for (int i = 1; i <= 10; i++) {
            mul =  mul*i;
        }
        System.out.println("atroisma kai ginomeno ton 10 proton aritmon");
        System.out.printf("atroisma: %d\t ginomeno : %d\t",sum , mul);
    }
}
