package inflearn.Queue.mine;

import java.util.*;

public class savePrincess {
    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
             queue.offer(i);
        }
        while(queue.size() != 1) {
            for (int i = 0; i < k-1; i++) {
                int tmp = queue.poll();
                queue.offer(tmp);
            }
            queue.remove();
        }
        answer = queue.poll();
        return answer;
    }

    public static void main(String[] args) {
        savePrincess T = new savePrincess();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(T.solution(n, k));
    }
}
