package inflearn.String;

import java.util.Scanner;

public class extractNumByCharacter {
    public int solution(String s){
        String answer = "";
        for(char x : s.toCharArray()) {
            if(Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        extractNumByCharacter T = new extractNumByCharacter();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
