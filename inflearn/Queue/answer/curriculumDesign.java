package inflearn.Queue.answer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class curriculumDesign {
    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x : need.toCharArray()) Q.offer(x);
        for (char x : plan.toCharArray()) {
            if(Q.contains(x)) {
                if(x!=Q.poll()) return "NO";
            }
        }
        if(!Q.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        curriculumDesign T = new curriculumDesign();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.println(T.solution(a, b));
    }
}
