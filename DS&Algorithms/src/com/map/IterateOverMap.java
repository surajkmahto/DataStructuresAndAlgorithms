package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateOverMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        map.put("E",5);

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }

        Iterator<Map.Entry<String,Integer>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getKey());
            System.out.println(itr.next().getValue());
        }


    }
}
