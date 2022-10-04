package inflearn.String.mine;

import java.util.Scanner;

public class stringCompression {
    public void solution(String s) {
        String answer = "";
        char current = s.charAt(0);
        int count = 0;
        System.out.print(current);
        for(char x : s.toCharArray()) {
            if (current == x) count++;
            else {
                if (count != 1) System.out.print(count);
                System.out.print(x);
                count = 1;
                current = x;
            }
        }
        if (count != 1) System.out.print(count);
    }

    public static void main(String[] args) {
        stringCompression T = new stringCompression();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        T.solution(str);
    }
}