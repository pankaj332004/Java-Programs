package Graph;

import java.util.*;


public class dijkstraUsingPriorityQueue {
    static class pair implements Comparable<pair>{
        int node;
        int distance;
        pair(int node , int distance){
            this.node = node;
            this.distance = distance;
        }
        public int  compareTo(pair other){
            return Integer.compare(this.distance, other.distance);
        }
    }
    public static void bfs5(int i , List<pair>[] adj , int[] dist){
        PriorityQueue<pair> pq = new PriorityQueue<>();
        dist[i]=0;
        pq.add(new pair(i,0));
        while(!pq.isEmpty()){
            pair curr = pq.poll();
            int u = curr.node;
            int d = curr.distance;

            if(d > dist[u]) continue;

            for(pair edge : adj[u]){
                int v = edge.node;
                int w = edge.distance;

                if(dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;
                    pq.add(new pair(v,dist[v]));
                }
            }
        }
    }
    public static void main(String[] args) {
        int n=5;
        List<pair>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i]=new ArrayList<>();
        }
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i]=Integer.MAX_VALUE;
        }
        adj[0].add(new pair(1,30));
        adj[0].add(new pair(4,5));
        adj[0].add(new pair(3,20));
        adj[1].add(new pair(0,30));
        adj[1].add(new pair(2,4));
        adj[2].add(new pair(1,4));
        adj[2].add(new pair(3,7));
        adj[2].add(new pair(4,30));
        adj[3].add(new pair(0,20));
        adj[3].add(new pair(2,7));
        adj[3].add(new pair(4,6));
        adj[4].add(new pair(0,5));
        adj[4].add(new pair(2,8));
        adj[4].add(new pair(3,6));
        bfs5(0,adj,dist);

        for (int i = 0; i < n; i++) {
            System.out.print(dist[i]+" ");
        }
    }
}
