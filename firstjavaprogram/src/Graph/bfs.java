package Graph;

import java.util.*;

public class bfs {
    public static void bfs1(List<Integer>[] adj, int start){
        boolean[] visited = new boolean[adj.length];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()){
            int v = q.poll();
            System.out.print(v+" ");

            for(int n : adj[v]){
                if(!visited[n]){
                    visited[n]=true;
                    q.add(n);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v = 9;
        List<Integer>[] adj = new ArrayList[v];

        for(int i=0;i<v;i++){
            adj[i]=new ArrayList<>();
        }

        adj[1].addAll(Arrays.asList(2,3,4));
        adj[2].addAll(Arrays.asList(1,5,6));
        adj[3].addAll(Arrays.asList(1));
        adj[4].addAll(Arrays.asList(1,7));
        adj[5].addAll(Arrays.asList(2));
        adj[6].addAll(Arrays.asList(2));
        adj[7].addAll(Arrays.asList(4,8));
        adj[8].addAll(Arrays.asList(7));

        System.out.println("BFS from verte 4 : ");
        bfs1(adj,4);
    }
}
