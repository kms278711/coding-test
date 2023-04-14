package inflearn.Recursive.DFS.mine;

import java.util.Scanner;

public class badugiRiding {
    static int n, answer, c= 0;
    static int min = Integer.MAX_VALUE;
    static int[] arr;
    public void DFS(int L, int sum) {
        if(sum > c) return;
        if(L == n) {
            if(c-sum < min) {
                min = c - sum;
                answer = sum;
            }
            return;
        }
        else {
            DFS(L+1, sum+arr[L]);
            DFS(L+1, sum);
        }
    }
    public static void main(String[] args) {
        badugiRiding T = new badugiRiding();
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        T.DFS(0,0);
        System.out.println(answer);
    }
}
