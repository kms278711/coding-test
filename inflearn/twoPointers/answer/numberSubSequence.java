package inflearn.twoPointers.answer;

import java.util.Scanner;

public class numberSubSequence {
    public int solution(int n, int m, int[] arr) {
        int answer=0, sum=0, lt=0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if(sum==m) answer ++;
            while(sum>=m) {
                sum -= arr[lt++];
                if(sum==m) answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        numberSubSequence T = new numberSubSequence();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
