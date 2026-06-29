package Graph;
import java.util.*;

public class cycleDetectionInDirectedGraph {
    public static void main(String[] args) {
        int  v = 6;
        List<Integer>[] adj = new ArrayList[v];
        for(int i=0;i<v;i++){
            adj[i]=new ArrayList<>();
        }
        adj[0].addAll(Arrays.asList(2,3));
        adj[1].addAll(Arrays.asList(2,4));
        adj[3].add(2);
        adj[4].addAll(Arrays.asList(2,3,5));
        adj[5].add(1);
        int[] indegree = new int[v];
        for (int i = 0; i < v; i++) {
            for(int j : adj[i]){
                indegree[j]++;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        bfs(v,adj,indegree,arr);
        if (arr.size()!=v){
            System.out.println("There is Cycle present in the graph");
        }
        else{
            System.out.println("There is No Cycle present in the graph");
        }
    }
    public static void bfs(int v,List<Integer>[] adj, int[] indegree,ArrayList<Integer> arr){
        Queue<Integer>  q = new LinkedList<>();
        for (int i = 0; i < v; i++) {
            if(indegree[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int front = q.poll();
            arr.add(front);

            for(int ele : adj[front]){
                indegree[ele]--;
                if (indegree[ele]==0){
                    q.add(ele);
                }
            }
        }
    }
}
