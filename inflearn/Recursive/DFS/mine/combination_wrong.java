package inflearn.Recursive.DFS.mine;

import java.util.Scanner;

public class combination_wrong {
    static int n, r, answer, cnt;
    static int[] ch;
    public void DFS(int L, int rR) {
        if(L==n-rR) return;
        if(rR==cnt) {
            answer++;
            cnt --;
        } else {
            for (int i = L; i < n-2; i++) {
                 if(ch[i]==0) {
                     ch[i] = 1;
                     cnt ++;
                     DFS(L+1, rR);
                     ch[i] = 0;
                 }
            }
        }
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        combination_wrong T = new combination_wrong();
        n = in.nextInt();
        r = in.nextInt();
        ch = new int[n-1];
        T.DFS(0, r-1);
        T.DFS(0, r);
        System.out.println(answer);
    }
}
