package inflearn;

import java.util.Scanner;

public class wordInSentence {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len=x.length();
            if(m < len) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        wordInSentence T = new wordInSentence();
        Scanner kb=new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
        return ;
    }
}
