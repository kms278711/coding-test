package inflearn.Array.mine;

import java.util.Scanner;

public class scoreCalculate {
    public int solution(int[] arr) {
        int answer = 0;
        int score = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 1) {
                score ++;
                answer += score;
            } else {
                score = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        scoreCalculate T = new scoreCalculate();
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
