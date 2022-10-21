package inflearn.Queue.mine;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class curriculumDesign {
    public String solution(String s1, String s2) {
        String answer = "NO";
        Queue<Character> Q = new LinkedList<>();
        for (char c : s1.toCharArray()) {
            Q.offer(c);
        }
        for (char c : s2.toCharArray()) {
            if(Q.peek() == c) {
                Q.poll();
            } else if(Q.contains(c)) {
                return "NO";
            }
            if(Q.size() == 0) {
                answer = "YES";
                return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        curriculumDesign T = new curriculumDesign();
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        System.out.println(T.solution(s1, s2));
    }
}
