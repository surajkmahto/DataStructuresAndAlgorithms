package com.dp;

public class LargestPalindromeSubstring {

	public static void main(String[] args) {

		String str = "aaaabbaa";
		int size = str.length();
		int dp[][] = new int[size][size];
		int start_point = 0;
		int offset = 0;
		int max_offset=0;
		for(int i=0;i<size;i++){
			dp[i][i] = 1;
		}
		for(int i=0;i<size-1;i++){
			if(str.charAt(i)==str.charAt(i+1)){
				offset=1;
				dp[i][i+1]=1;
				if(max_offset<offset){
					start_point=i;
					max_offset=offset;
				}
			}else{
				dp[i][i+1]=0;
			}
		}
		for(int i=3;i<=size+i-1;i++){
			for(int j=0;j<size-i;j++){
				int k = i+j-1;
				if(str.charAt(j)==str.charAt(k) && dp[j+1][k-1] == 1){
					dp[j][k] = 1;
					offset=j-k+1;
					if(max_offset<offset){
						start_point=j;
						max_offset=offset;
					}
				}else{
					dp[j][k] = 0;
				}
			}
		}


		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();

		}

		System.out.println(start_point + " " + max_offset);
		System.out.println("Longest Palindrome SubString : " + str.substring(start_point, start_point+max_offset+1));
	}

}
