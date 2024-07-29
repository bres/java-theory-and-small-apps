package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StrindRead2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("/home/devops/IdeaProjects/aueb/src/main/java/org/example/string.txt"));
        String s;

        s = in.next();
        System.out.println("to arxeio periexei to string: " +s);
        in.close();
    }
}
