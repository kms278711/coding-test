package inflearn.String;

import java.util.Scanner;

public class palindromeByStringBuilder {
    public String solution(String str) {
        String answer="NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args) {
        palindromeByStringBuilder T = new palindromeByStringBuilder();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
