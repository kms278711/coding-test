package inflearn.String;

import java.util.Scanner;

public class wordInSentenceByIndex {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        // 마지막 단어 전까지 확인
        while((pos=str.indexOf(" ")) != -1) { // 더 이상 띄어쓰기 발견을 못할시 -1
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(m < len) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }

        // 마지막 단어 확인
        if(str.length()>m) answer=str;
        return answer;
    }

    public static void main(String[] args){
        wordInSentenceByIndex T = new wordInSentenceByIndex();
        Scanner kb=new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
        return ;
    }
}
