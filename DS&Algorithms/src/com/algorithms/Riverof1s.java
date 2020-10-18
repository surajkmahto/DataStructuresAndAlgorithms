package com.algorithms;


public class Riverof1s {

	static int R = 5;
	static int C = 5;
	static int count;
	static boolean visited [][] = new boolean[R][C];
	static int rowNbr[] = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int colNbr[] = {-1, 0, 1, -1, 1, -1, 0, 1};



	public static void main(String[] args) {
		int arr[][] = { {0, 0, 1, 1, 0},
				{1, 0, 1, 1, 0},
				{0, 1, 0, 0, 0},
				{0, 0, 0, 0, 1},
				{0, 0, 0, 0, 1}};
		int maxlength = getMaxLength(arr);
		System.out.println(maxlength);

	}

	private static int getMaxLength(int[][] arr) {
		int ans = 0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(arr[i][j]==1 && visited[i][j]==false){
					count = 1;
					dfs(arr,i,j);
					ans = Math.max(count, ans);
				}
			}
		}
		return ans;
	}

	private static void dfs(int[][] arr, int i, int j) {
		visited[i][j] =  true;
		for(int k=0;k<8;k++){
			if(isSafe(arr, i + rowNbr[k], j + colNbr[k], visited)){
				count++;
				dfs(arr, i + rowNbr[k], j + colNbr[k]);
			}
		}
	}

	static boolean isSafe(int[][] M, int row, int col, boolean[][] visited)
	{
		return ((row >= 0) && (row < R) && (col >= 0) && (col < C) && (M[row][col] == 1 && !visited[row][col]));
	}

}
