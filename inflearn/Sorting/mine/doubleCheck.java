package inflearn.Sorting.mine;

import java.util.ArrayList;
import java.util.Scanner;

public class doubleCheck {
    public char solution(int n, int[] arr) {
        char answer = 'U';
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : arr) {
            if(list.contains(x)) {
                answer = 'D';
                break;
            }
            list.add(x);
        }
        return  answer;
    }

    public static void main(String[] args) {
        doubleCheck T = new doubleCheck();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = in.nextInt();
        System.out.println(T.solution(n, arr));
    }
}
