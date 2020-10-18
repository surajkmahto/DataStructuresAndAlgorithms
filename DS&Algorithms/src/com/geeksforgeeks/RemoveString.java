package com.geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while(t-- > 0){
			String str = br.readLine();
			String removeStr = br.readLine();
			char[] strarr  =  removeStr.toCharArray();
			String newS =str;
			for (char c : strarr) {
				String regex = String.valueOf(c);
				newS = newS.replaceAll(regex,"");
			}
			System.out.println(newS);
		}

	}
}
