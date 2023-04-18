package inflearn.Recursive.DFS;

import java.util.Scanner;

public class permutation {
    static int[] pm;
    static int n, m;
    public void DFS(int L) {
        if(L==m) {
            for (int x : pm) System.out.print(x+ " ");
            System.out.println();
        }
        else {
            for (int i = 1; i <= n; i++) {
                pm[L]=i;
                DFS(L+1);
            }
        }
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        permutation T = new permutation();
        n = in.nextInt();
        m = in.nextInt();
        pm=new int[m];
        T.DFS(0);
    }
}
