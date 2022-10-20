package inflearn.Stack.mine;

import java.util.Scanner;
import java.util.Stack;

public class ironStick {
    public int solution(String str) {
        int answer = 0;
        char pre = '(';
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if(x=='(') {
                stack.push(x);
                pre = x;
            } else {
                if(pre == ')') {
                    answer += 1;
                    stack.pop();
                } else {
                    stack.pop();
                    answer += stack.size();
                }
                pre = x;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        ironStick T = new ironStick();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }
}
