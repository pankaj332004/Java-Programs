package Graph;

import java.util.*;
class Pair{
    int node;
    int distance;
    Pair(int node , int distance){
        this.distance=distance;
        this.node=node;
    }
}
public class dijkstraUsingQueue {
    public static void bfs4(int i , List<Pair>[] adj , int[] dist){
        Queue<Pair> q = new LinkedList<>();
        dist[i]=0;
        q.add(new Pair(i,0));
        while(!q.isEmpty()){
            Pair p = q.poll();
            int currNode = p.node;
            int currDist = p.distance;

            if(currDist>dist[currNode]) continue;

            for(Pair edge : adj[currNode]){
                int edgeNode = edge.node;
                int edgeDist = edge.distance;

                if(dist[currNode]+edgeDist < dist[edgeNode]){
                    currDist = dist[currNode]+edgeDist;
                    dist[edgeNode]=currDist;
                    q.add(new Pair(edgeNode,dist[edgeNode]));
                }
            }
        }
    }
    public static void main(String[] args) {
        int n=5;
        List<Pair>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i]=new ArrayList<>();
        }
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i]=Integer.MAX_VALUE;
        }
        adj[0].add(new Pair(1,30));
        adj[0].add(new Pair(4,5));
        adj[0].add(new Pair(3,20));
        adj[1].add(new Pair(0,30));
        adj[1].add(new Pair(2,4));
        adj[2].add(new Pair(1,4));
        adj[2].add(new Pair(3,7));
        adj[2].add(new Pair(4,30));
        adj[3].add(new Pair(0,20));
        adj[3].add(new Pair(2,7));
        adj[3].add(new Pair(4,6));
        adj[4].add(new Pair(0,5));
        adj[4].add(new Pair(2,8));
        adj[4].add(new Pair(3,6));
        bfs4(0,adj,dist);

        for (int i = 0; i < n; i++) {
            System.out.print(dist[i]+" ");
        }
    }
}

