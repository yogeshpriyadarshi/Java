package Graph;

import java.util.ArrayList;

public class CycleDirected {
    static class Edge{
        int src, dest, wt;
        public Edge(int s, int d, int w){
            this.src= s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));

        graph[1].add(new Edge(1, 3, 0));
        graph[1].add(new Edge(1, 4, 0));

        graph[2].add(new Edge(2, 6, 0));

        graph[3].add(new Edge(3, 4, 0));

        // graph[5].add(new Edge(5, 2, 0));

        graph[6].add(new Edge(6, 5, 0));
    }
    public static boolean checkCycle(ArrayList<Edge>[] graph, boolean[] visit, boolean[] path, int curr){
        visit[curr]=true;
        path[curr]=true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(path[e.dest]){
                return true;
            }
            if(!visit[e.dest]){
                if(checkCycle(graph, visit, path, e.dest)){
                    return true;
                }
            }
        }
        path[curr]=false;
       return false;
    }


    public static boolean isCycle(ArrayList<Edge>[] graph){
        int v= graph.length;
        boolean[]  visit = new boolean[v];
        boolean[]  path = new boolean[v];

        for(int i=0; i<v; i++){
            if(!visit[i]){
            if(checkCycle(graph, visit, path,i)){
                return true;
            }
            }
        }
      return false;
    }


    public static void main(String[] args){
        int vertex =7;
        ArrayList<Edge>[] graph = new ArrayList[vertex];
        for(int i=0; i<vertex; i++){
            graph[i]=new ArrayList<Edge>();
        }
        createGraph(graph);
        if(isCycle(graph)){
            System.out.print("Yes!!! Cycle Exist!!!");
        }else{
            System.out.print("No!!! Cycle does not Exist!!!");
        }

    }
    
}
