package New_batch_leetcode.daily_challenge;

import java.util.Arrays;

public class FindChampionDAG2924 {
    public static int findChampion(int n, int[][] edges) {
        int[] inDegree = new int[n];

        for (int[] edge : edges) {
            inDegree[edge[1]]++;
        }
        System.out.println(Arrays.toString(inDegree));
        int champion = -1; // Default to no champion
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                if (champion != -1) {
                    return -1;}
                champion = i;}}

        return champion; // Either
    }
    public static void main(String[] args) {
        int[][] edges={{0,1},{1,2}};
        int n=3;
        System.out.println(findChampion(n,edges));
    }
}
