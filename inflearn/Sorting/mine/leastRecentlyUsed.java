package inflearn.Sorting.mine;

import java.util.Scanner;

public class leastRecentlyUsed {
    public int[] solution(int s, int n, int[] arr) {
        int[] answer = new int[s];
        for (int i = 0; i < n; i++) {
            int idx = s-1;
            int tmp = arr[i];
            for (int j = 0; j < s; j++) {
                if(answer[j] == tmp) idx = j;
            }
            for (int j = idx; j > 0; j--) {
                answer[j] = answer[j-1];
            }
            answer[0] = tmp;
        }
        return answer;
    }

    public static void main(String[] args) {
        leastRecentlyUsed T = new leastRecentlyUsed();
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)  arr[i] = in.nextInt();
        for (int x : T.solution(s, n, arr)) System.out.print(x + " ");
    }
}
