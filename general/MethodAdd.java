package org.example;

/**
 * @author bres george
 */

public  class MethodAdd {

    public static void main(String[] args) {
        int num1 = 10, num2 =20;
        int result;

        result = MethodAdd.add(num1,num2);

        System.out.println(result);
    }

    public static int add (int a, int b) {
        int sum ;
        sum = a+b;
        return sum;
    }

}
