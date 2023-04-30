package inflearn.Recursive.BFS.mine;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class miro_wrong {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;

    public int BFS() {
        int L = 0;
        Queue<coordinate> q = new LinkedList<>();
        q.offer(new coordinate(1,1));
        while(!q.isEmpty()) {

        }
        return -1;
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        miro_wrong T = new miro_wrong();
        board = new int[8][8];
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                board[i][j]= in.nextInt();
            }
        }
        System.out.println(T.BFS());
    }
}

class coordinate{
    int x, y;
    public coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
