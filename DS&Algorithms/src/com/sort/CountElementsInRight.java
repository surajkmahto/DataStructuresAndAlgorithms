package com.sort;

public class CountElementsInRight {
    static class MySet{
        int number;
        int countOfZeroes;

        public MySet(int number, int countOfZeroes, int index) {
            this.number = number;
            this.countOfZeroes = countOfZeroes;
            this.index = index;
        }

        int index;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 4, 2, 1};
        MySet[] updatedArray = GetUpdatedArray(arr);
        int[] ans = new int[arr.length];
        sort(updatedArray, 0 , arr.length-1);
        for (MySet myset:updatedArray) {
            ans[myset.index] = myset.countOfZeroes;
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(ans[i] + " ");
    }

    private static MySet[] GetUpdatedArray(int[] arr) {
        MySet[] updatedArray = new MySet[arr.length];
        for(int i=0;i<arr.length;i++){
            updatedArray[i] = new MySet(arr[i], 0, i);
        }
        return updatedArray;
    }

    private static void sort(MySet arr[], int l, int r)
    {
        if (l < r) {
            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    private static void merge(MySet[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        MySet L[] = new MySet[n1];
        MySet R[] = new MySet[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].number <= R[j].number) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                arr[k].countOfZeroes += R.length-j;
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
