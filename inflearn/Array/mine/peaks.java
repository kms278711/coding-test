package inflearn.Array.mine;

import java.util.Scanner;

public class peaks {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if(arr[i][j-1] < arr[i][j] && arr[i][j+1] < arr[i][j] && arr[i-1][j] < arr[i][j] && arr[i+1][j] < arr[i][j]) answer ++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        peaks T = new peaks();
        int n = in.nextInt();
        int[][] arr = new int[n+2][n+2];
        for(int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}