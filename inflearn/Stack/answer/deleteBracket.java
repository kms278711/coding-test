package inflearn.Stack.answer;

import java.util.Scanner;
import java.util.Stack;

public class deleteBracket {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if(x==')') {
                while(stack.pop()!='(');
            } else stack.push(x);
        }
        for (int i = 0; i < stack.size(); i++) answer+=stack.get(i);
        return answer;

    }

    public static void main(String[] args) {
        inflearn.Stack.mine.deleteBracket T = new inflearn.Stack.mine.deleteBracket();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
