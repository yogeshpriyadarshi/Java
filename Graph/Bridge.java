package Graph;

import java.util.ArrayList;

public class Bridge {

    static class Edge{
        int src, dest, wt;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
             this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));
        graph[0].add(new Edge(0, 3, 0));

        graph[1].add(new Edge(1, 0, 0));
        graph[1].add(new Edge(1, 2, 0));

        graph[2].add(new Edge(2, 1, 0));
        graph[2].add(new Edge(2, 0, 0));

        graph[3].add(new Edge(3, 0, 0));
        graph[3].add(new Edge(3, 5, 0));
        graph[3].add(new Edge(3, 4, 0));

        graph[4].add(new Edge(4, 3, 0));
        graph[4].add(new Edge(4, 5, 0));

        graph[5].add(new Edge(5, 3, 0));
        graph[5].add(new Edge(5, 4, 0));
    }
    public static void CheckBridge(ArrayList<Edge>[] graph, int par,int curr, boolean[] visit, 
    int time, int[] dt, int[] low){
        visit[curr]=true;
        dt[curr]= low[curr]=  time++;

        for(int i=0; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(visit[e.dest]){
                if(par!=e.dest){
                    low[curr]=Math.min(dt[e.dest],low[curr]);
                }
            }else{
                CheckBridge(graph, curr, e.dest, visit, time, dt, low);
                low[curr]= Math.min(low[e.dest],low[curr]);
                // check bridge exist!!!
                if(dt[curr]<low[e.dest]){
                    System.out.println("Bride exist from " + curr + "  to  " + e.dest);
                }
            }
        }
    }


    public static void FindBridge(ArrayList<Edge>[] graph){
        int v = graph.length;
        boolean[] visit = new boolean[v];
        int time=0;
        int[]  dt = new int[v];
        int[]  low = new int[v];
        for(int i=0; i<v; i++){
            if(!visit[i]){
                CheckBridge(graph, -1,i, visit, time, dt, low);
            }
        }
    }

    public static void main(String[] args) {
        int v= 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for( int i=0; i<v; i++){
            graph[i] = new ArrayList<Edge>();
        }
        createGraph(graph);    
        FindBridge(graph);
    }
    
}
