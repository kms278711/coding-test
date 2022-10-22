package inflearn.Queue.mine;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class emergencyRoom {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int patient = arr[m];
        boolean isMax = true;
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.offer(arr[i]);
        }

        while(Q.contains(patient)) {
            int tmp = Q.poll();
            for (int i = 0; i < Q.size(); i++) {
                int peek = Q.poll();
                if(peek > tmp) {
                    isMax = false;
                }
                Q.offer(peek);
            }
            if(!isMax) {
                Q.offer(tmp);
            } else {
                answer++;
                if(m==0 && tmp==patient) break;;
            }
            isMax = true;
            m--;
            if(m==-1) m= Q.size()-1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        emergencyRoom T = new emergencyRoom();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
