package inflearn.twoPointers.mine;

import java.util.Scanner;

public class sumOfConsecutiveNumber {
    public int solution(int n) {
        int answer = 0, sum = 3, lt = 1, rt = 2;
        while(lt < n/2+1) {
             if(sum == n) {
                 answer ++;
                 lt++;
                 rt = lt + 1;
                 sum = lt + rt;
             } else if (sum > n) {
                 lt++;
                 rt = lt + 1;
                 sum = lt + rt;
             } else {
                 rt++;
                 sum += rt;
             }
        }
        return answer;
    }

    public static void main(String[ ] args) {
        Scanner in = new Scanner(System.in);
        sumOfConsecutiveNumber T = new sumOfConsecutiveNumber();
        int n = in.nextInt();
        System.out.println(T.solution(n));
    }
}
