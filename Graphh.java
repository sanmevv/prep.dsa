import java.util.*;

public class Graphh {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;

        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2, 2));
        graph[0].add(new Edge(0, 1, 2));
        graph[1].add(new Edge(1, 3, 10));
        graph[1].add(new Edge(1, 0, 0));
        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 4, 10));
        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 4, -1));
        graph[3].add(new Edge(3, 5, -1));
        graph[4].add(new Edge(4, 2, 0));
        graph[4].add(new Edge(4, 3, 0));
        graph[4].add(new Edge(4, 5, 0));
        graph[5].add(new Edge(5, 6, 0));
        graph[5].add(new Edge(5, 4, 0));
        graph[5].add(new Edge(5, 3, 0));
        graph[6].add(new Edge(6, 5, 0));
    }

    public static void bfsGraph(ArrayList<Edge> graph[], int V, boolean[] vis, int start) {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (vis[curr] == false) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfsGraph(ArrayList<Edge> graph[], int curr, boolean[] vis) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (vis[e.dest] == false) {
                dfsGraph(graph, e.dest, vis);
            }
        }
    }

    public static void allPaths(ArrayList<Edge> graph[], boolean[] vis, int curr, String path, int target) {
        if (curr == target) {
            System.out.println(path);
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                vis[curr] = true;
                allPaths(graph, vis, e.dest, path + e.dest, target);
                vis[curr] = false;
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        for (int j = 0; j < graph.length; j++) {
            for (int i = 0; i < graph[j].size(); i++) {
                Edge e = graph[j].get(i);
                System.out.println(e.src + "->" + e.dest + " w = " + e.weight);
            }
        }
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                bfsGraph(graph, V, vis, i);
            }
        }
        System.out.println();

        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                dfsGraph(graph, i, vis);
            }
        }
        System.out.println();
        int src = 0, target = 5;
        allPaths(graph, new boolean[V], src, "0", target);
    }
}