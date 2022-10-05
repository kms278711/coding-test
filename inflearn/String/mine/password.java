package inflearn.String.mine;

import java.util.Scanner;

public class password {
    public String solution(int num, String password) {
        String answer = "";
        String word = "";
        char alp = 'A';
        for(int i=0; i<num; i++) {
            word = password.substring(i*7,i*7+7);
            word = word.replace("#", "1");
            word = word.replace("*", "0");
            alp = (char)Integer.parseInt(word, 2);
            answer += alp;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        password T = new password();
        int num = in.nextInt();
        String password = in.next();
        System.out.println(T.solution(num, password));
    }
}
