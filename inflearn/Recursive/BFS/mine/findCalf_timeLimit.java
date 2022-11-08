package inflearn.Recursive.BFS.mine;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node lt, mid, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class findCalf_timeLimit {
    public int BFS(int s, int e) {
        int answer = 0;
        boolean check = false;
        Node node = new Node(s);
        Queue<Node> Q = new LinkedList<>();
        Q.offer(node);
        int L = 0;
        while(!check) {
            L++;
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                Node cur = Q.poll();
                cur.lt = new Node(cur.data + 1);
                cur.mid = new Node(cur.data - 1);
                cur.rt = new Node(cur.data + 5);
                if(cur.lt.data < e) Q.offer(cur.lt);
                if(cur.lt.data <= e && cur.lt.data > s) Q.offer(cur.mid);
                Q.offer(cur.rt);
            }
            for (int i = 0; i < Q.size(); i++) {
                Node cur = Q.poll();
                if(cur.data == e) {
                    answer = L;
                    check = true;
                    break;
                }
                Q.offer(cur);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        findCalf_timeLimit T = new findCalf_timeLimit();
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();
        System.out.println(T.BFS(s, e));
    }
}



