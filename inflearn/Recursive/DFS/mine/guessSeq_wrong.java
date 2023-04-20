package inflearn.Recursive.DFS.mine;

import java.util.Scanner;

public class guessSeq_wrong {
    static int n, f;
    static boolean answer = false, chB;
    static int[] ch, arr;
    public void DFS1(int L) {
        if(L==n) {
//            DFS2(0, arr);
            for (int i = 1; i <= 4; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        else {
            for (int i = 1; i <= n; i++) {
                if(ch[i]==0) {
                    ch[i] = 1;
                    arr[i] = i;
                    DFS1(L+1);
                    ch[i] = 0;
                    DFS1(L+1);
                }
            }
        }
    }
    public void DFS2(int L, int[] arr) {
        if(L==n) return;
        else {
            for (int i = 0; i < n; i++) {
                if(ch[i]==0) {
                    ch[i]=1;
                    DFS2(L+1, arr);
                }
            }
        }
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        guessSeq_wrong T = new guessSeq_wrong();
        n = in.nextInt();
        f = in.nextInt();
        arr = new int[(1+n)*(n/2)+1];
        ch = new int[n+1];
        T.DFS1(0);
    }
}
