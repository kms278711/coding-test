package inflearn.TwoPointers.mine;

import java.util.Scanner;

public class arrayMerge {
    public int[] solution(int n, int m, int arr1[], int arr2[]) {
        int[] answer = new int[n+m];
        int p1 = 0, p2 = 0;
        for (int i = 0; i < n+m; i++) {
            if(p1 == n) {
                answer[i] = arr2[p2];
                p2++;
            } else if(p2 == m) {
                answer[i] = arr1[p1];
                p1++;
            } else {
                if(arr1[p1] > arr2[p2]) {
                    answer[i] = arr2[p2];
                    p2++;
                } else {
                    answer[i] = arr1[p1];
                    p1++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        arrayMerge T = new arrayMerge();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }
        for (int x : T.solution(n, m, arr1, arr2)) System.out.print(x + " ");
    }
}
