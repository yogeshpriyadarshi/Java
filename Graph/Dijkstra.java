package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }


    static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add( new Edge(4, 5, 5));

    }
     static class Pair implements Comparable<Pair>{
        int node;
        int dis;

        public Pair(int n, int d) {
            this.node = n;
            this.dis = d;
        }  
        @Override
         public int compareTo(Pair p2) {
            return Integer.compare(this.dis, p2.dis);
            }
    }

    public static int[] dijkstra(ArrayList<Edge>[] graph, int src){
        int n=graph.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dis = new int[n];
        boolean[] vis = new boolean[n];
        for(int i=0; i<n; i++){
            if(i!=src){
                dis[i] = Integer.MAX_VALUE;
            }
        }
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            int node = curr.node;
            if(!vis[node]){
                vis[node]=true;
                for(int i=0; i<graph[node].size();i++){
                Edge e = graph[node].get(i);
                int u = e.src;
                int v = e.dest;
                if(dis[v] > e.wt + dis[u] ){
                    dis[v]= e.wt + dis[u];
                    pq.add( new Pair(v,dis[v]));
                }
            }
            }
        }
        return dis;
    }


    public static void main(String[] args){
        int vertex=6;
        ArrayList<Edge>[] graph = new ArrayList[vertex];
        createGraph(graph);
        int[] ans = dijkstra(graph, 0);
        for(int i=0; i<6; i++){
            System.out.println(ans[i]);
        }

        
    }
    
}
