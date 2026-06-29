package Graph;

import java.util.*;

public class PrimsAlgorithm {
    static class Triplet implements Comparable<Triplet>{
        int node;
        int parent;
        int wt;
        Triplet(int node , int parent, int wt){
            this.node=node;
            this.parent=parent;
            this.wt=wt;
        }
        public int compareTo(Triplet t){
            if(this.wt==t.wt) return Integer.compare(this.node,t.node);
            return Integer.compare(this.wt,t.wt);
        }
    }

    static  class Pair{
        int node;
        int wt;
        Pair(int node , int wt){
            this.node=node;
            this.wt=wt;
        }
    }
    public static void main(String[] args) {
        int n =5;
        List<Pair>[] adj = new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        adj[0].add(new Pair(1,2));
        adj[0].add(new Pair(2,5));
        adj[0].add(new Pair(4,1));
        adj[1].add(new Pair(0,2));
        adj[1].add(new Pair(4,2));
        adj[1].add(new Pair(3,1));
        adj[2].add(new Pair(0,5));
        adj[2].add(new Pair(4,2));
        adj[2].add(new Pair(3,5));
        adj[3].add(new Pair(4,4));
        adj[3].add(new Pair(1,1));
        adj[3].add(new Pair(2,5));
        adj[4].add(new Pair(0,1));
        adj[4].add(new Pair(2,3));
        adj[4].add(new Pair(1,2));
        adj[4].add(new Pair(3,4));

        boolean[] vis = new boolean[n];
        //vis[0]=true;
        List<List<Integer>> mst = new ArrayList<>();
        PrimsMST(adj,vis,mst);
        int sum = 0;
        for(List<Integer> arr : mst){
            sum += arr.get(2);
        }
        System.out.println(sum);
    }
    public static void PrimsMST(List<Pair>[] adj,boolean[] vis,List<List<Integer>> mst){
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0,-1,0));

        while(!pq.isEmpty()){
            Triplet front = pq.poll();
            int node = front.node;
            int parent = front.parent;
            int wt = front.wt;

            if(vis[node]) continue;
            else vis[node]=true;

            if(parent!=-1){
                mst.add(new ArrayList<>(Arrays.asList(parent,node,wt)));
            }

            for(Pair p : adj[node]){
                if(!vis[p.node]){
                    pq.add(new Triplet(p.node,node,p.wt));

                }
            }
        }
    }
}
