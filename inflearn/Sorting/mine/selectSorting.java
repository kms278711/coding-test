package inflearn.Sorting.mine;

import java.util.ArrayList;
import java.util.Scanner;

public class selectSorting {
    public int[] solution(int n, ArrayList<Integer> arr) {
        int[] answer = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j=0; j < arr.size(); j++) {
                if(min>arr.get(j)) {
                    min = arr.get(j);
                    index = j;
                }
            }
            arr.remove(index);
            answer[i] = min;
        }
        return answer;
    }

    public static void main(String[] args) {
        selectSorting T = new selectSorting();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
