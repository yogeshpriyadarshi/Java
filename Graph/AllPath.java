package Graph;

import java.util.ArrayList;

public class AllPath {

    static class Edge {
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, -1));
        graph[2].add(new Edge(2, 4, 2));

        graph[3].add(new Edge(3, 1, -1));
        graph[3].add(new Edge(3, 4, 0));
        graph[3].add(new Edge(3, 5, 0));

        graph[4].add(new Edge(4, 2, -1));
        graph[4].add(new Edge(4, 3, 0));
        graph[4].add(new Edge(4, 5, 0));

        graph[5].add(new Edge(5, 3, -1));
        graph[5].add(new Edge(5, 4, 0));
        graph[5].add(new Edge(5, 6, 0));

        graph[6].add(new Edge(6, 5, -1));

    }


    public static void  AllPathFromSrcToTar(ArrayList<Edge>[] graph, int src, int tar,boolean[] visit, ArrayList<Integer> path){
        path.add(src);
        visit[src]=true;
        if(src==tar){
        System.out.println(path);
        return;
    }
        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!visit[e.dest]){
                AllPathFromSrcToTar(graph,e.dest,tar,visit,path);
                visit[e.dest]=false;
                path.remove(path.size()-1);
            }
        } 
        return;
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println("Print all paths from src=0 to tar=5");
        ArrayList<Integer> path = new ArrayList<>();
        boolean[] visit = new boolean[7];
        int src=0;
        int tar=5;
        AllPathFromSrcToTar(graph,src,tar,visit,path);
    }
}
