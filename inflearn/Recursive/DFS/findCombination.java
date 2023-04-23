package inflearn.Recursive.DFS;

import java.util.Scanner;

public class findCombination {
    static int[] combi;
    static int n, m;
    public void DFS(int L, int s) {
        if(L==m) {
            for (int x : combi) System.out.print(x+ " ");
            System.out.println();
        }
        else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
    public static void main(String[] args) {
        findCombination T = new findCombination();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];
        T.DFS(0, 1);
    }
}
