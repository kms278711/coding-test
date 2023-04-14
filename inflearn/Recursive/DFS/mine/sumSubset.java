package inflearn.Recursive.DFS.mine;

import java.util.Scanner;

public class sumSubset {
    public static int n, cur, sum, curSum;
    public static String answer;
    public static int[] arr;
    public int DFS(int e) {
        if(sum == curSum) {
            answer = "YES";
            return 0;
        } else if(sum < curSum + e) {
            cur --;
            DFS(arr[cur]);
        } else {
            curSum += e;
            cur--;
            DFS(arr[cur]);
        }
        return 0;
    }
    public static void main(String[] args) {
        answer = "NO";
        Scanner in = new Scanner(System.in);
        sumSubset T = new sumSubset();
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i : arr) {
            sum += i;
        }
        cur=n-1;
        curSum = 0;
        System.out.println("cur : " + cur);
        System.out.println("curSum : " + curSum);
        T.DFS(arr[cur]);
        System.out.println(answer);
    }
}
