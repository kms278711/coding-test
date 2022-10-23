package inflearn.Sorting.mine;

import java.util.Scanner;

public class bubbleSorting {
    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        bubbleSorting T = new bubbleSorting();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i]=in.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
