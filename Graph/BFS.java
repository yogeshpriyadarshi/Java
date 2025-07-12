package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    static class Edge {
        int src, dest, wt;
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));
        graph[0].add(new Edge(0, 3, 0));

        graph[1].add(new Edge(1, 0, 0));
        graph[1].add(new Edge(1, 4, 0));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 0));
        graph[2].add(new Edge(2, 3, 0));
        graph[2].add(new Edge(2, 4, 0));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, 0));
        graph[3].add(new Edge(3, 0, 0));

        graph[4].add(new Edge(4, 1, 0));
        graph[4].add(new Edge(4, 2, 0));
    }

    public static void breadthFirstSearch( ArrayList<Edge>[] graph, int src  ){
        boolean[] visit =new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while (q.size()>0) { 
            int cur = q.remove();
            if(!visit[cur]){
                visit[cur]=true;
                System.out.print(cur +"  ");
                for(int i=0; i<graph[cur].size(); i++){
                    Edge e = graph[cur].get(i);
                    q.add(e.dest);
                }
            }  
        }
    }

    public static void main() {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for (int i = 0; i < v; i++) {  //Initialisation of graph.
            graph[i] = new ArrayList<Edge>();
        }
        createGraph(graph);
        breadthFirstSearch(graph,4);
    }

}
