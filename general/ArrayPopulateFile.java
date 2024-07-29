package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * arxikopoei ton pinaka diabazontas kapoio arxeio
 *
 */
public class ArrayPopulateFile {

    public static void main(String[] args) throws FileNotFoundException {
        int[] ages = new int[5];
        File intFile = new File("/home/devops/IdeaProjects/aueb/src/main/java/org/example/myIntFile.txt");
        Scanner in = new Scanner(intFile);

        for (int i = 0; i < ages.length; i++) {
            ages[i] = in.nextInt();
        }
        for (int age : ages) {
            System.out.print(age + " ");
        }
        in.close();
    }
}