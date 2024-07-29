package collections.hashMaps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer,String>();

        map.put(5,"Five");
        map.put(6,"Six");
        map.put(7,"Seven");
        map.put(2,"Two");
        map.put(1,"One");

        map.put(6,"Hello");

        String text = map.get(6);//can not have duplicate keys
        System.out.println(text);
        for(Map.Entry<Integer,String> entry:map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
