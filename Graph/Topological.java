package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class Topological {
    static class Edge{
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src=s;
            this.dest=d;
            this.wt=w;
        }  
    }
    public static void createGraph(ArrayList<Edge>[] graph){

        graph[1].add(new Edge(1, 2, 0));

        graph[2].add(new Edge(2, 0, 0));
        graph[2].add(new Edge(2, 5, 0));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 4, 0));

        graph[4].add(new Edge(4, 2, 0));

        graph[5].add(new Edge(5, 0, 0));

    }
    public static void WriteTopological(ArrayList<Edge>[] graph, boolean[] visit, Stack<Integer> s  , int curr ){
        visit[curr]=true;
        for(int i=0; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dest]){
                WriteTopological(graph, visit, s, e.dest);
            }
        }
        s.add(curr);
    }


    public static void TopologicalSort(ArrayList<Edge>[] graph){
        int v = graph.length;
        boolean[] visit = new boolean[v];
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<v; i++){
            if(!visit[i]){
             WriteTopological(graph, visit, s, i );
            }
        }
        while(s.size()>0){
                System.out.print(s.pop()+"   ");
        }
        
    }



    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i=0; i<v; i++){
            graph[i]= new ArrayList<>();
        }
        createGraph(graph);
        TopologicalSort(graph);
    }
    
}
