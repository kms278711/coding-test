package inflearn.Stack.mine;


import java.util.Scanner;
import java.util.Stack;

public class deleteBracket {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(x=='(') stack.push(x);
            else if(x==')'){
                stack.pop();
            } else {
                if(stack.isEmpty()) answer += x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        deleteBracket T = new deleteBracket();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }
}
