package inflearn.Recursive.BFS.mine;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//class Point {
//    public int x, y;
//    Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}
public class island {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] board;
    static int n, answer=0;

    public void BFS() {
        Queue<Point> Q = new LinkedList<>();
        while(true) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 1) {
                        Q.offer(new Point(i, j));
                        break;
                    }
                }
                if(!Q.isEmpty()) break;
            }
            if(Q.isEmpty()) break;
            while (!Q.isEmpty()) {
                Point tmp = Q.poll();
                board[tmp.x][tmp.y] = 0;
                for (int k = 0; k < 8; k++) {
                    int nx = tmp.x + dx[k];
                    int ny = tmp.y + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                        board[nx][ny] = 0;
                        Q.offer(new Point(nx, ny));
                    }
                }
            }
            answer ++;
        }
    }

    public static void main (String[] args) {
        island T = new island();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = in.nextInt();
            }
        }
        T.BFS();
        System.out.println(answer);
    }
}
