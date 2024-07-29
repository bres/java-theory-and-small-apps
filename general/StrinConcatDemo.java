package org.example;

/**
 * @author george bres
 */
public class StrinConcatDemo {
    public static void main(String[] args) {
        String s1="george", s2="bres";
        String s3;

        s3=s1+s2;
        System.out.printf("s1=%s, s2=%s, s3=%s\n",s1,s2,s3 );

        s3 =s1.concat(s2);
        System.out.printf("s1=%s, s2=%s, s3=%s\n",s1,s2,s3 );


    }
}
