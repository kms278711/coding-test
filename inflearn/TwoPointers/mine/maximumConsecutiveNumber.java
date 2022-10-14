package inflearn.TwoPointers.mine;

import java.util.Scanner;

public class maximumConsecutiveNumber {
    public int solution(int n, int k, int[] arr) {
        int answer = 0, lt = 0, rt = 0, cnt = 0;

        while(rt < n) {
            if(arr[lt] == 0) {
                cnt ++;
                arr[lt] = 1;
            } else if (arr[rt] == 0) {
                cnt++;
                rt++;
            } else {
                rt++;
            }
            if(cnt == k + 1) {
                answer = Math.max(answer, rt-lt-1);
                lt ++;
                rt = lt;
                cnt = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        maximumConsecutiveNumber T = new maximumConsecutiveNumber();
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(n, k , arr));
    }
}
