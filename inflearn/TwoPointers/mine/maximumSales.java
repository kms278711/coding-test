package inflearn.TwoPointers.mine;

import java.util.Scanner;

public class maximumSales {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;
        int p1 = 0;
        int p2 = k;
        while(p2<n) {
            sum = sum-arr[p1]+arr[p2];
            p1++;
            p2++;
            if(sum>answer) answer = sum;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        maximumSales T = new maximumSales();
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}
