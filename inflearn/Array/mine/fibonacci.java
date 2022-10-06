package inflearn.Array.mine;

import java.util.ArrayList;
import java.util.Scanner;

public class fibonacci {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(1);
        for(int i=0; i<n-2; i++) {
            answer.add(answer.get(i) + answer.get(i+1));
        }
        return answer;
    }

    public static void main(String[] args){
        fibonacci T = new fibonacci();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int x : T.solution(n)) System.out.print(x + " ");
    }
}
