package New_batch_leetcode.daily_challenge;

import java.util.*;

public class ShortestDistanceAfterRoadAddition {
    public static int[] shortestPathLength(int n, int[][] queries) {
        // Initializing the adjacency list for the graph
        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding initial roads (0 -> 1 -> 2 -> ... -> n-1)
        for (int i = 0; i < n - 1; i++) {
            graph[i].add(new int[]{i + 1, 1}); // Edge with weight 1
        }

        // To store the shortest path lengths after each query
        int[] answer = new int[queries.length];

        // Processing each query
        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0];
            int v = queries[i][1];

            // Add the new road
            graph[u].add(new int[]{v, 1}); // Adding edge with weight 1

            // Find the shortest path from city 0 to city n-1 using Dijkstra's algorithm
            answer[i] = dijkstra(graph, n);
        }

        return answer;
    }

    private static int dijkstra(List<int[]>[] graph, int n) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        int[] distances = new int[n];
        Arrays.fill(distances, Integer.MAX_VALUE);

        distances[0] = 0;
        pq.offer(new int[]{0, 0}); // {node, distance}

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int distance = current[1];

            if (distance > distances[node]) continue;

            for (int[] neighbor : graph[node]) {
                int nextNode = neighbor[0];
                int edgeWeight = neighbor[1];
                int newDist = distance + edgeWeight;

                if (newDist < distances[nextNode]) {
                    distances[nextNode] = newDist;
                    pq.offer(new int[]{nextNode, newDist});
                }
            }
        }

        // Return the shortest distance to city n-1
        return distances[n - 1];
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] queries = {{0, 3}, {2, 4}, {0, 4}};
        int[] result = shortestPathLength(n, queries);

        System.out.println(Arrays.toString(result)); // Output the result

    }

}
