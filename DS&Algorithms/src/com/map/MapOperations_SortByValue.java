package com.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapOperations_SortByValue {
	public static void main(String[] args) {
		Map<String,Integer> duration = new HashMap<>();
		duration.put("A", 10);
		duration.put("C", 30);
		duration.put("B", 20);
		duration.put("D", 5);


		//HashMap to TreeMap
		TreeMap<String, Integer> treeMap = new TreeMap<>(duration);
		System.out.println(treeMap.toString());


		//Sort_By_Value
		Map<String, Integer> sortedByValue= duration.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println(sortedByValue.toString());


		//SortByValue_OtherMethod
		//LinkedHashMap :: Puts key value pair in their insertion order.
		List<Map.Entry<String,Integer>> list = new LinkedList<>(duration.entrySet());
		Collections.sort(list,(o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		Map<String,Integer> sortedByValue2nd = new LinkedHashMap<>();
		for (Entry<String, Integer> entry : list) {
			sortedByValue2nd.put(entry.getKey(), entry.getValue());
		}
		System.out.println(sortedByValue2nd.toString());
	}
}
