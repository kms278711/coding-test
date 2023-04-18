package inflearn.Recursive.DFS.mine;

import java.util.Scanner;

public class maxScore {
    static int n, m;
    static int[] score, time;
    static int max = Integer.MIN_VALUE;
    public void DFS(int L, int Tsum, int Ssum) {
        if(Tsum > m) {
            return;
        }
        if(L==n){
            max = Math.max(max, Ssum);
            return;
        } else {
            DFS(L+1, Tsum+time[L], Ssum+score[L]);
            DFS(L+1, Tsum, Ssum);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        maxScore T = new maxScore();
        n = in.nextInt();
        m = in.nextInt();
        score = new int[n];
        time = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = in.nextInt();
            time[i] = in.nextInt();
        }
        T.DFS(0, 0, 0);
        System.out.println(max);
    }
}
