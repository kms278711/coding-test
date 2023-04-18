package inflearn.Recursive.DFS.mine;

import java.util.Scanner;

public class changeCoin_timeLimit {
    static int answer=Integer.MAX_VALUE, n, m;
    static int[] coin;
    public void DFS(int L, int sum) {
        if(sum > m) return;
        if(sum == m) {
            answer = Math.min(answer, L);
            return;
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L+1, sum+coin[i]);
            }
        }
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        changeCoin_timeLimit T = new changeCoin_timeLimit();
        n = in.nextInt();
        coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = in.nextInt();
        }
        m = in.nextInt();
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
