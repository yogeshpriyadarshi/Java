package Graph;

import java.util.ArrayList;

public class CycleUndirected {

    static class Edge {

        int src;
        int dest;
        int wei;

        public Edge(int src, int dest, int wei) {
            this.src = src;
            this.dest = dest;
            this.wei = wei;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));

        graph[1].add(new Edge(1, 5, 0));
        graph[1].add(new Edge(1, 4, 0));
        graph[1].add(new Edge(1, 0, 0));

        graph[2].add(new Edge(2, 3, 0));
        graph[2].add(new Edge(2, 0, 0));


        graph[3].add(new Edge(3, 4, 0));
        graph[3].add(new Edge(3, 2, 0));

        graph[4].add(new Edge(4, 1, 0));
        graph[4].add(new Edge(4, 3, 0));

        graph[5].add(new Edge(5, 1, 0));


    }

    static boolean checkCycle(ArrayList<Edge>[] graph, int parent, boolean[] visit, int curr) {
        visit[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (e.dest != parent) {
                if (visit[e.dest]) {
                     return true;
                } else {
                    if (checkCycle(graph, curr, visit, e.dest)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean isCycle(ArrayList<Edge>[] graph) {
        int vertex = graph.length;
        boolean[] visit = new boolean[vertex];
        for (int i = 0; i < vertex; i++) {
            if (checkCycle(graph, -1, visit, i)) {
                System.out.println("yes! It has cycle!");
                return true;
            } else {
                System.out.println("given cycle is not found");
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int vertex = 7;
        ArrayList<Edge>[] graph = new ArrayList[vertex];
        for (int i = 0; i < vertex; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        createGraph(graph);
        if (isCycle(graph)) {
            System.out.println("cycle is available");
        } else {
            System.out.println("cycle is not available!");
        }
    }
}
