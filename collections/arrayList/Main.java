package collections.arrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //adding
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        //retrieving
        System.out.println(numbers.get(0));

        //other way
        System.out.println("\nIteration #1");
        //indexed for loop iteration
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        //foreach
        System.out.println("\nIteration #2");
        for(Integer iterator:numbers) {
            System.out.println(iterator);
        }

        //removing items (last item is fast)
        numbers.remove(numbers.size()-1);

        //this is very slow because when I remove items from an arrayList(first item specially)
        //what it does is it all, if you remove the first item it will then copy all the items (subsequent items)
        //one step back to fill the gap.We use linkedList..
        numbers.remove(0);

        //foreach
        System.out.println("\nIteration #3 --removed items");
        for(Integer iterator:numbers) {
            System.out.println(iterator);
        }
    }
}
