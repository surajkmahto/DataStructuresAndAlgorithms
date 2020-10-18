package com.algorithms;

import java.util.*;

public class LRUCache {

    //queue represents the cache
    static Deque<Integer> dq = new LinkedList<>();

    // to check if page is there in cache or not
    static Set<Integer> map = new HashSet<>();

    static int cacheSize=3;


    public static void main(String[] args) {

        refer(3);
        refer(4);
        System.out.println("LRU_Page : " + lru_page());
        refer(3);
        refer(5);
        refer(6);
        System.out.println("LRU_Page : " + lru_page());
        display_cache();

    }

    static void refer(int page){
        if(map.contains(page)){
            dq.removeFirstOccurrence(page);
            dq.addFirst(page);
        }
        else{
            if(dq.size()<cacheSize){
                dq.addFirst(page);
                map.add(page);
            }
            else{
                dq.removeLast();
                dq.addFirst(page);
                map.add(page);
            }

        }

    }

    //to get least recently used page
    static int lru_page(){
        return dq.peek();
    }

    // to show contents of cache
    static void display_cache(){
        System.out.println(dq.toString());
    }
}
