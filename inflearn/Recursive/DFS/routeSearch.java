package inflearn.Recursive.DFS;

import java.util.Scanner;

public class routeSearch {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v) {
        if(n == v) answer ++;
        else {
            for (int i = 1; i < n; i++) {
                if(graph[v][i] == 0 && ch[i]==0) {
                    ch[i]=1;
                    DFS(i);
                    ch[i]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        routeSearch T = new routeSearch();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph[a][b]=1;
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);

    }
}
