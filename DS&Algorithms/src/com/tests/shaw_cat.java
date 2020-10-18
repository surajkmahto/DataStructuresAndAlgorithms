package com.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class shaw_cat {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String,Integer> myMap = new HashMap<>();
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0){
			String str = br.readLine();
			String[] arr = str.split("#");
			for (String string : arr) {
				if(string.length()>0){
					if(myMap.containsKey(string)){
						int existingValue = myMap.get(string);
						myMap.put(string, existingValue+1);
					}else{
						myMap.put(string, 1);
					}

				}
			}
		}
		System.out.println(myMap.toString());
		Iterator<Map.Entry<String, Integer>> it = myMap.entrySet().iterator();
		int max = 1;
		while(it.hasNext()){
			int current_value = it.next().getValue();
			if(current_value>max){
				max=current_value;
			}
		}
		List<String> list =  new ArrayList<>();
		Iterator<Map.Entry<String, Integer>> it2 = myMap.entrySet().iterator();
		while(it2.hasNext()){
			String current_key = it2.next().getKey();
			if(myMap.get(current_key)==max){
				list.add("#"+current_key);
			}
		}
		Collections.sort(list);
		System.out.println(list.toString());

	}
}
