package com.dp;

public class LongestPalindromeSubsequence {

	private static int getLPS(String str) {
		if(str==null){
			return 0;
		}
		else if(str.length()==1){
			return 1;
		}
		else if(str.length()==2){
			if(str.charAt(0) == str.charAt(1)){
				return 2;
			}else{
				return 0;
			}
		}
		else if(str.charAt(0) == str.charAt(str.length()-1)){
			return (2 + getLPS(str.substring(1, str.length()-1)));
		}
		else{
			return Math.max(getLPS(str.substring(0, str.length()-1)),getLPS(str.substring(1, str.length())));
		}

	}

	public static void main(String[] args) {
		String str = "e of e";
		int lps = getLPS(str);
		System.out.println("The length of LPS: " + lps);

	}
}
