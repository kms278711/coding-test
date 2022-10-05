package inflearn.Array.mine;

import java.util.Scanner;

public class printBiggest {
    public String solution(String[] num) {
        String answer = num[0] + " ";
        for(int i=1; i<num.length; i++) {
            if(Integer.parseInt(num[i-1]) < Integer.parseInt(num[i])) answer += num[i] + " ";
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printBiggest T = new printBiggest();
        int size = in.nextInt();
        in.nextLine();
        String[] number = in.nextLine().split(" ");
        System.out.println(T.solution(number));
    }
}
