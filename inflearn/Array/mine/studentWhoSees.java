package inflearn.Array.mine;

import java.util.Scanner;

public class studentWhoSees {
    public int solution(int[] arr) {
        int answer = 0;
        int maxlen = 0;
        for(int x : arr) {
            if(maxlen < x) {
                answer ++;
                maxlen = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        studentWhoSees T = new studentWhoSees();
        int n = in.nextInt();
        int[] len = new int[n];
        for(int i=0; i<len.length; i++) {
            len[i] = in.nextInt();
        }
        System.out.println(T.solution(len));
    }
}
