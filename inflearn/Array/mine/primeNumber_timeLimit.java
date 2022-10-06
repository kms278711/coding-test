package inflearn.Array.mine;

import java.util.ArrayList;
import java.util.Scanner;

public class primeNumber_timeLimit {
    public int solution(int n) {
        ArrayList<Integer> prime = new ArrayList<>();
        prime.add(2);
        boolean isPrime = false;
        for(int i=3; i<=n; i++) {
            for(int x : prime) {
                isPrime = true;
                if(i % x == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) prime.add(i);
        }
        return prime.size();
    }

    public static void main(String[] args) {
        primeNumber_timeLimit T = new primeNumber_timeLimit();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(T.solution(n));
    }
}
