package edu.rw.lecture13.hw1;

import java.util.HashMap;
import java.util.Map;

public class HashMapHw {
    public static void main(String[] args) {
        Map<Integer, String> linkIDandCust = new HashMap<>();
        linkIDandCust.put(123, "Nareshbhai Khunt");
        linkIDandCust.put(456, "Niravbhai Goyani");
        linkIDandCust.put(789, "Yash Desai");
        System.out.println(linkIDandCust);
        System.out.println("Size of HashMap is: "+linkIDandCust.size());     // getting size
        for (int x : linkIDandCust.keySet()) {        // printing each key value
            System.out.print(x + " ");
        }
        System.out.println();
        for (String x : linkIDandCust.values()) {     // printing each element value
            System.out.println(x + " ");
        }
    }

}
