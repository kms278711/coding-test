package inflearn.Sorting.mine;

import java.util.Scanner;

public class insertSorting {
    public int[] solution(int n, int[] arr) {
        for(int i=1; i<n; i++) {
            int target = arr[i];
            for (int j = i-1; j >= 0 ; j--) {
                if(arr[j]>target) {
                    arr[j+1] = arr[j];
                    arr[j] = target;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        insertSorting T = new insertSorting();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i]=in.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
