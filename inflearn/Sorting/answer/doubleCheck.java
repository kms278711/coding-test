package inflearn.Sorting.answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class doubleCheck {
    public String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]) return "D";
        }
        return  answer;
    }

    public static void main(String[] args) {
        doubleCheck T = new doubleCheck();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, arr));
    }
}
