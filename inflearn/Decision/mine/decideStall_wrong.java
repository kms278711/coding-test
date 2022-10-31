package inflearn.Decision.mine;

import java.util.Arrays;
import java.util.Scanner;

public class decideStall_wrong {
    public int solution(int n, int c, int[] arr) {
        int answer = 0, lt = Integer.MAX_VALUE, rt = Integer.MIN_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < n-1; i++) {
            lt = Math.min(Math.abs(arr[i]-arr[i+1]), lt);
            rt = Math.max(Math.abs(arr[i]-arr[i+1]), rt);
        }

        while(lt<=rt) {
            int mid = (lt+rt)/2;

        }
        return answer;
    }

    public static void main(String[] args) {
        decideStall_wrong T = new decideStall_wrong();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        System.out.println(T.solution(n, c, arr));
    }
}
