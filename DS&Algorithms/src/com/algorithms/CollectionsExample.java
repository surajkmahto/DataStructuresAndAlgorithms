package com.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Binary Search using Collection
        int index = Collections.binarySearch(list, 4);
        System.out.println("The Index of 4 :: " + index);

        // Shuffle Elements of a list randomly
        Collections.shuffle(list);

        // Sort the elements of a list
        Collections.sort(list);

        System.out.println("The LIST::");
        for (Integer integer : list) {
            System.out.println(integer);
        }

	}

}
