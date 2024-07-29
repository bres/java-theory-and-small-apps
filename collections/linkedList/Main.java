package collections.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main  {
    /*
     * ArrayLists manage arrays internally.
     * [0][1][2][3][4][5]...
     */

    /*
     * LinkedLists consists of elements where each element
     * has a reference to the previous and next element
     * [0]->[1]->[2]..
     *
     */

    public static void main(String[] args) {
        //add or remove items in the end
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //add or remove items from the middle or the start
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        //implement the interface list
        doTimings("arrayList",arrayList);
        doTimings("linkedList",linkedList);
    }

    private static void doTimings(String type, List<Integer> list) {
        for (int i=0; i<1E5; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();

        //add items at the end of the list
//        for (int i = 0; i <1E5 ; i++) {
//            list.add(i);
//        }

        // add items elsewhere in list
        for (int i = 0; i < 1E5; i++) {
            list.add(0,i);
        }

        long end =  System.currentTimeMillis();

        System.out.println("time taken: " +(end -start) + " ms for " + type);
    }

}
