package inflearn.Array.mine;

import java.util.Scanner;

public class gratingSum {
    public int solution(int n, int[][] plate) {
        int answer = 0;
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += plate[i][j];
            }
            if(answer < sum) answer = sum;
        }

        for(int i=0; i<n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += plate[j][i];
            }
            if(answer < sum) answer = sum;
        }

        sum = 0;
        for(int i=0; i<n; i++) {
            sum += plate[i][i];
        }
        if(answer < sum) answer = sum;

        sum = 0;
        for(int i=0; i<n; i++) {
            sum += plate[i][n-1-i];
        }
        if(answer < sum) answer = sum;

        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        gratingSum T = new gratingSum();
        int n = in.nextInt();
        int[][] plate = new int[n][n];
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                plate[i][j] = in.nextInt();
            }
        }
        System.out.println(T.solution(n, plate));
    }
}
