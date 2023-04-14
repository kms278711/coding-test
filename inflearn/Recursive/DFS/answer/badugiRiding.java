package inflearn.Recursive.DFS.answer;

import java.util.Scanner;

public class badugiRiding {
    static int answer = Integer.MAX_VALUE, c, n;
    public void DFS(int L, int sum, int[] arr) {
        if(sum>c) return;
        if(L == n) {
            answer=Math.max(answer, sum);
        }
        else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }
    public static void main(String[] args) {
        badugiRiding T = new badugiRiding();
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        T.DFS(0,0, arr);
        System.out.println(answer);
    }
}
