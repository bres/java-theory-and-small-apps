package org.example;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String result = "";
        long timeStart, timeEnd;
        double stringConcatTime, stringBuilderConcatTime;

        timeStart = System.currentTimeMillis();
        for (int i = 0; i < 50_000; i++) {
            result = result +i;
        }

        timeEnd = System.currentTimeMillis();
        stringConcatTime = (double) (timeEnd -timeStart)/1000;

        timeStart = System.nanoTime();
        for (int i = 0; i < 50_000; i++) {
            sb.append(i);
        }

        timeEnd = System.nanoTime();
        stringBuilderConcatTime = (double) (timeEnd -timeStart)/1_000_000;

        System.out.println( "Concatenation time :string vs string builder in sec");
        System.out.println(stringConcatTime + " sev vs " +stringBuilderConcatTime + " sec");
    }
}
