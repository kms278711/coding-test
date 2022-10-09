package inflearn.Array.mine;

import java.util.Scanner;

public class classMonitor_wrong {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        int check[] = new int[n];
        int same[] = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < n; k++) {
                    if(i != k) {
                        if(arr[i][j] == arr[k][j]) {
                            check[k] = 1;
                        }
                    }
                }
            }
            for(int x : check) {
                if(x == 1) same[i]++;
            }
            check = new int[n];
        }

        for (int i = same.length - 1; i >= 0; i--) {
            if(cnt < same[i]) {
                cnt = same[i];
                answer = i;
            }
        }
        return answer + 1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        classMonitor_wrong T = new classMonitor_wrong();
        int n = in.nextInt();
        int[][] arr = new int[n][5];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
