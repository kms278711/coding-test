package inflearn.twoPointers.mine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class commonElement {
    public ArrayList<Integer> solution(int n, int m, ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        Collections.sort(a);
        Collections.sort(b);
        while(p1<n && p2<m) {
            if(a.get(p1).equals(b.get(p2))) {
                answer.add(a.get(p1));
                p1++;
                p2++;
            } else if(a.get(p1) > b.get(p2)){
                p2++;
            } else {
                p1++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        commonElement T = new commonElement();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());
        }
        int m = in.nextInt();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            b.add(in.nextInt());
        }
        for (int x : T.solution(n, m, a, b)) System.out.print(x + " ");
    }
}
