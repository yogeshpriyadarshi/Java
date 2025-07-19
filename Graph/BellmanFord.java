package Graph;

import java.util.ArrayList;

public class BellmanFord {
       static class Edge{
        int src, dest, wt;
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

    public static void bellman(ArrayList<Edge>[] graph,int src){
        int v=graph.length;
        int[] dis = new int[v];
        for(int i=0; i<v; i++){
            dis[i]=Integer.MAX_VALUE;
        }
        dis[src]=0;
        for(int i=0; i<v-1; i++){
            for(int j=0; j<graph.length; j++){
                for(int k=0; k<graph[j].size(); k++){

                    Edge e = graph[j].get(k);
                    int x = e.src;
                    int y = e.dest;
                    int w = e.wt;
                    //   Relaxartion 
                    if( dis[x]!= Integer.MAX_VALUE && dis[x]+w < dis[y]){
                        dis[y] = dis[x] + w;
                    }

                }
            }
        }

        for(int i=0; i<dis.length; i++){
            System.out.print(dis[i]+"    ");
        }


    }


public static void main(String[]  args){
    int v=6;
    ArrayList<Edge>[] graph = new ArrayList[v];
    for(int i=0; i<v; i++){
        graph[i]= new ArrayList<Edge>();
    }
    createGraph(graph);
    bellman(graph,0);
}
    
}
