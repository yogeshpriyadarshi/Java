package Graph;
import java.util.*;

public class DFS {
    static class Edge{
        int src, dest, wt;
        public Edge(int s, int d, int w){
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

        public static void DepthFirstSearch(ArrayList<Edge>[]  graph, int src ){
            boolean[] visit = new boolean[graph.length];
            Stack<Integer> s = new Stack<>();
            s.push(src);
            while(s.size()>0){
                int curr = s.pop();
                if(!visit[curr]){
                 visit[curr]=true;
                System.out.print(curr + "  ");
                for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                s.push(e.dest);
            }
                }
            }
            }
            
    

    public static void main(String[] args){
        int v=5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i=0; i<v; i++){
            graph[i]= new ArrayList<Edge>();
        }

        createGraph(graph);
        DepthFirstSearch(graph,0);
    } 
}
