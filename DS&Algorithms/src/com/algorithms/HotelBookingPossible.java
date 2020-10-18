package com.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HotelBookingPossible {

	public static void main(String[] args) {
          int k=3;
          List <Integer> arrive = new ArrayList<>();
          arrive.add(1);
          arrive.add(3);
          arrive.add(5);
          
          List <Integer> depart = new ArrayList<>();
          depart.add(2);
          depart.add(6);
          depart.add(8);
          
          boolean isHotelAvailable = hotel(arrive,depart,k);
          if(isHotelAvailable){
        	  System.out.println("Yes! There are more than enough hotels.");
          }else{
        	  System.out.println("No! The Rooms are not suffiecient.");  
          }
	}
	
	public static boolean hotel(List<Integer> arrival, List<Integer> departure, int K) {
		boolean available = true;
		int counter = K;
		int i=0,j=0;
		i=i+counter;
		counter=0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int k=0;k<arrival.size();k++){
			map.put(k, 1);
		}
		while(i<arrival.size()){
			j=0;
			while(j<i){
				if(map.get(j) == 1){
					if(departure.get(j)<arrival.get(i)){
						counter++;
						map.put(j, 0);
					}
					j++;
				}				
			}
		}
        return available; 

	}	
	
	
	

}
