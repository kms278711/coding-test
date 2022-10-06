package inflearn.Array.mine;

import java.util.Scanner;

//틀림
public class rockPaperScissors_wrong {
    public char[] solution(int n, int[] a, int[] b) {
        char[] answer = new char[n];
        for(int i=0; i<n; i++) {
            if(a[i] == b[i]) answer[i] = 'D';
            else if(a[i] > b[i] && Math.abs(a[i]-b[i]) == 1) answer[i] = 'A';
            else answer[i] = 'B';
        }
        return answer;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<a.length; i++) {
            a[i] = in.nextInt();
        }
        for(int i=0; i<a.length; i++) {
            b[i] = in.nextInt();
        }
        rockPaperScissors_wrong T = new rockPaperScissors_wrong();
        for(char x : T.solution(n, a, b)) {
            System.out.println(x);
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish-startTime);
    }
}
