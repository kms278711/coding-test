package inflearn.Array.mine;

import java.util.ArrayList;
import java.util.Scanner;

public class primeNumberReverse {
    public ArrayList<Integer> solution(int[] num) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] prime = new int[100000];
        prime[0] = 1;
        prime[1] = 1;
        for(int i=2; i<100000; i++) {
            if(prime[i] == 0) {
                for(int j=i+i; j<100000; j=j+i) {
                    prime[j] = 1;
                }
            }
        }
        for (int i : num) {
            if(prime[i] == 0) answer.add(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        primeNumberReverse T = new primeNumberReverse();
        int n = in.nextInt();
        int[] num = new int[n];

        for(int i=0; i<n; i++) {
            StringBuffer sb = new StringBuffer(in.next());
            num[i] = Integer.parseInt(sb.reverse().toString());
        }
        for(Integer x : T.solution(num)) System.out.print(x + " ");
    }
}
