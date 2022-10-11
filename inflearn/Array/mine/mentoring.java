package inflearn.Array.mine;

import java.util.Scanner;

public class mentoring {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int[][] can = new int[n+1][n+1];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                can[arr[i]][arr[j]] = 1;
            }
        }

        for (int k = 1; k < m; k++) {
            for (int i = k*n; i < k*n+n; i++) {
                for (int j = i+1; j < k*n+n; j++) {
                    if(can[arr[j]][arr[i]] == 1) can[arr[j]][arr[i]] = 0;
                }
            }
        }

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < n+1; j++) {
                if(can[i][j] == 1) answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        mentoring T = new mentoring();
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[] = new int[m*n];
        for (int i = 0; i < m*n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
