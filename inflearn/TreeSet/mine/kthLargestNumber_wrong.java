package inflearn.TreeSet.mine;

import java.util.Scanner;
import java.util.TreeSet;

public class kthLargestNumber_wrong {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        TreeSet<Integer> treeSet= new TreeSet<>();
        for (int i = 0; i < n; i++) {
            treeSet.add(arr[i]);
        }
        answer += treeSet.last();
        treeSet.remove(treeSet.last());
        answer += treeSet.last();
        for (int i = 0; i < k; i++) {
            treeSet.remove(treeSet.last());
        }
        answer += treeSet.last();
        return answer;
    }

    public static void main(String[] args) {
        kthLargestNumber_wrong T = new kthLargestNumber_wrong();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        System.out.println(T.solution(n, k, arr));
    }
}