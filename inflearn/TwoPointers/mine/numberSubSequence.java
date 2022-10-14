package inflearn.TwoPointers.mine;

import java.util.Scanner;

public class numberSubSequence {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int p1 = 0;
        int p2 = 0;
        int sum = arr[p1];
        while(p2<n) {
            if(sum==m) {
                answer ++;
                p1++;
                p2 = p1;
                sum = arr[p1];
            } else if(sum>m) {
                p1++;
                p2 = p1;
                sum = arr[p1];
            } else {
                p2++;
                if(p2<n) sum += arr[p2];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        numberSubSequence T = new numberSubSequence();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
