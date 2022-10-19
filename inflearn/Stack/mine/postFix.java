package inflearn.Stack.mine;

import java.util.Scanner;
import java.util.Stack;

public class postFix {
    public int solution(String str) {
        int tmp = 0, a = 0, b = 0;
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                switch (c) {
                    case '+' :
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b+a);
                        break;
                    case '-' :
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b-a);
                        break;
                    case '*' :
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b*a);
                        break;
                    case '/' :
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b/a);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        postFix T = new postFix();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }
}
