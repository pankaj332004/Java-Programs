package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dfs {
    public static void main(String[] args) {
        int n =6;
        List<Integer>[] adj = new ArrayList[n+1];
        boolean[] vis = new boolean[n+1];

        for(int i=0;i<=n;i++){
            adj[i] = new ArrayList<>();
        }
        adj[1].addAll(Arrays.asList(2,3,5));
        adj[2].addAll(Arrays.asList(1,4));
        adj[3].addAll(Arrays.asList(1,6));
        adj[4].addAll(Arrays.asList(2));
        adj[5].addAll(Arrays.asList(1));
        adj[6].addAll(Arrays.asList(3));

        dfs1(5, vis , adj);

    }
    public static void dfs1(int start,boolean[] vis,List<Integer>[] adj){
        vis[start] = true;
        System.out.print(start+" ");

        for(int ele : adj[start]){
            if(!vis[ele]){
                dfs1(ele,vis,adj);
            }
        }
    }
}
