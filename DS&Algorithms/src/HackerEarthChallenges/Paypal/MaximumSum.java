package HackerEarthChallenges.Paypal;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class MyPair
{
    int num,freq;
    MyPair(int number, int frequency){
        num = number;
        freq = frequency;
    }
}

class MaximumSum_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int b[] = Arrays.copyOf(arr,arr.length);
            Arrays.sort(b);

            int f[] = new int[n];
            for(int i=0;i<k;i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                x--;
                if(x>=0 && x<n){
                    f[x]++;
                }
                if(y<n){
                    f[y]--;
                }
            }

            for(int i=1;i<n;i++){
                f[i] += f[i-1];
            }
            int c = n-1;
            PriorityQueue<MyPair> pq = new PriorityQueue<>((MyPair x, MyPair y)->y.freq-x.freq);
            for(int i=0;i<n;i++){
                if(f[i]>0){
                    pq.add(new MyPair(i,f[i]));
                }
            }

            long sum =0;
            while(!pq.isEmpty()){
                MyPair p = pq.remove();

                sum += (long)p.freq*b[c] - (long)p.freq*arr[p.num];
                c--;
            }
            System.out.println(sum);
        }
    }
}
