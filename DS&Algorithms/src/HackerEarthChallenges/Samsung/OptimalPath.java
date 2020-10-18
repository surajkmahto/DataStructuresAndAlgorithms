package HackerEarthChallenges.Samsung;

import java.util.Scanner;



public class OptimalPath {



    static int minDistance(long dist[], Boolean sptSet[] , int V)
    {
        // Initialize min value
        long min = Integer.MAX_VALUE;
        int min_index=-1;

        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min)
            {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n,k;
        while(t-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long ans = getOptimalPath(arr, n, k);
            System.out.println(ans);
        }
    }

    private static long getOptimalPath(long[] arr, int n, int k) {

        long[][] g = new long[n+1][n+1];
        for(int i=1;i<n;i++){
            g[i][i+1] = arr[i-1];
            int temp = i+1+(i%k);
            if(temp<n+1){
                g[i][temp] = arr[i-1];
            }

        }

        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                System.out.print(g[i][j] + " ");
            }
            System.out.println();
        }
        long ans = dijkstra(g,1,n+1);
        return ans + arr[n-1];

    }

    static long dijkstra(long graph[][], int src,int V)
    {
        long dist[] = new long[V]; // The output array. dist[i] will hold
        // the shortest distance from src to i

        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean sptSet[] = new Boolean[V];

        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < V; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // Distance of source vertex from itself is always 0
        dist[src] = 0;

        // Find shortest path for all vertices
        for (int count = 0; count < V-1; count++)
        {
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed. u is always equal to src in first
            // iteration.
            int u = minDistance(dist, sptSet , V);

            // Mark the picked vertex as processed
            sptSet[u] = true;

            // Update dist value of the adjacent vertices of the
            // picked vertex.
            for (int v = 0; v < V; v++)

                // Update dist[v] only if is not in sptSet, there is an
                // edge from u to v, and total weight of path from src to
                // v through u is smaller than current value of dist[v]
                if (!sptSet[v] && graph[u][v]!=0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u]+graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }

        return dist[V-1];
    }
}























