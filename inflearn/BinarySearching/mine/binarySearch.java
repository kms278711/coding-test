package inflearn.BinarySearching.mine;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public int solution(int n, int m, int[] arr) {
        Arrays.sort(arr);
        int answer = 0;
        int start = 0;
        int end = n - 1;
        while(end-start != 1) {
            int idx = (start + end)/2;
            if(m > arr[idx]) {
                start = idx;
                answer = end+1;
            } else if(m < arr[idx]) {
                end = idx-1;
                answer = start+1;
            } else {
                answer = idx + 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        binarySearch T = new binarySearch();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}
