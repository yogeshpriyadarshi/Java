package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MST {

    static class Edge {

        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static class Pair implements Comparable<Pair> {
        int node, dis;

        public Pair(int n, int d) {
            this.node = n;
            this.dis = d;
        }
        @Override
        public int compareTo(Pair p2) {
            return Integer.compare(this.dis, p2.dis);
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

    public static int mst(ArrayList<Edge>[] graph, int src){
        int cost =0;
        boolean[] visit = new boolean[graph.length];
        visit[src]=true;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0; i< graph[src].size(); i++){
            Edge e = graph[src].get(i);
            pq.add(new Pair(e.dest, e.wt));
        }
        while(pq.size()>0){
            Pair curr = pq.remove();
            if(!visit[curr.node]){
            cost+=curr.dis;
            visit[curr.node]=true;
             for(int i=0; i< graph[curr.node].size(); i++){
            Edge e = graph[curr.node].get(i);
            if(!visit[e.dest])
            pq.add(new Pair(e.dest, e.wt));
            }
        } }
        return cost;
    }

    public static void main(String[] args){
        int v=6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i=0; i<v; i++){
            graph[i]= new ArrayList<Edge>();
        }
        createGraph(graph);
        int cost = mst(graph,0);
        System.out.println("Minimum cost of spanning tree   "+cost);

    }



}
