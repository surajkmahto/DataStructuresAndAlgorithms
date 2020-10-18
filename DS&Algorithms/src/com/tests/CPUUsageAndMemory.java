package com.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CPUUsageAndMemory {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C://Users//suraj.mahto//Desktop//input.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String str="";
		Double cpuTime = 0.0;
		Double memory = 0.0;
		while((str = br.readLine())!=null){
			String[] array = str.split(" ");
			cpuTime += Double.parseDouble(array[1]);
			memory += Double.parseDouble(array[2]);
		}
		System.out.println("CPU Usage :: " + cpuTime);
		System.out.println("Memory :: " + memory);
	}

}
