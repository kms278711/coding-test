package inflearn.Recursive.DFS.answer;

import java.util.Scanner;

public class maxScore {
    static int answer = Integer.MIN_VALUE, n, m;
    boolean flag = false;
    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        if(time>m) return;
        if(L==n) {
            answer = Math.max(answer, sum);
        }
        else {
            DFS(L+1, sum+ps[L], time+pt[L], ps, pt);
            DFS(L+1, sum, time, ps, pt);
        }
    }
    public static void main(String[] args) {
        maxScore T = new maxScore();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
        }
        T.DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }
}
