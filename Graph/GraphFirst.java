package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphFirst {

    static class Edge {

        int src;
        int dest;
        int wei;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wei = w;
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
static boolean[] visit = new boolean[7];

    public static void DFS(ArrayList<Edge>[] graph, int src, int tar, ArrayList<Integer> path){
      if(src==tar){
        System.out.println(path);
        return;
    }
        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(visit[e.dest]==false){
                path.add(e.dest);
                visit[e.dest]=true;
                DFS(graph,e.dest,tar,path);
                visit[e.dest]=false;
                path.remove(path.size()-1);
            }
        } 
        return;
    }

    public static void BFS(ArrayList<Edge> graph[], int V){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        q.add(0);
        while(!q.isEmpty()){
            int curr= q.remove();
            if(vis[curr]==false){
                System.out.println(curr);
                vis[curr]=true;
                // visit neighbour and add to queue;
                for(int i=0; i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }

        }

    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        // print all neighour
        // for (int i = 0; i < graph[2].size(); i++) {
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.dest + " , " + e.wei);
        // }

        // Breadth first Search
        // BFS(graph,v);

        // Deapth first Search
        System.out.println("Print all paths from src=0 to tar=5");
        ArrayList<Integer> path = new ArrayList<>();
        int src=0;
        int tar=5;
        visit[src]=true;
        path.add(src);
        DFS(graph,src,tar,path);

    }

}
