package inflearn.Stack.mine;

import java.util.Scanner;
import java.util.Stack;

public class correctBracket {
    public String solution(char[] arr) {
        String answer = "NO";
        Stack<Character> stack = new Stack<>();
        for (char c : arr) {
            try{
                if(c=='(') stack.push(c);
                else stack.pop();
            } catch (Exception e) {
                return answer;
            }
        }
        if(stack.isEmpty()) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        correctBracket T = new correctBracket();
        Scanner in = new Scanner(System.in);
        char[] arr = in.next().toCharArray();
        System.out.println(T.solution(arr));
    }
}
