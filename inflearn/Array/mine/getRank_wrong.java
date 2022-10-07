package inflearn.Array.mine;

import java.util.Arrays;
import java.util.Scanner;

public class getRank_wrong {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        Integer[] sorted = new Integer[n];
        for(int i=0; i<n; i++) {
            sorted[i] = arr[i];
        }

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] < arr[j]) {
                    int tmp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = tmp;
                }
            }
        }
        for(int i=0; i<n; i++) {
            answer[i] = Arrays.asList(sorted).indexOf(arr[i]) + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        getRank_wrong T = new getRank_wrong();
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        for(int x: T.solution(n, arr)) System.out.print(x + " ");
    }
}
