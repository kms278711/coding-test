package inflearn.Recursive.BFS.answer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class tomato {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;
    static int m,n;
    static Queue<Point> Q = new LinkedList<>();
    public void BFS() {
        while(!Q.isEmpty()) {
            Point tmp = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && nx< n && ny>=0 && ny< m && board[nx][ny]==0) {
                    board[nx][ny]=1;
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny]=dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main (String[] args) {
        tomato T = new tomato();
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        board = new int[n][m];
        dis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = in.nextInt();
                if(board[i][j]==1) Q.offer(new Point(i, j));
            }
        }
        T.BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j]==0) flag=false;
            }
        }
        if(flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer=Math.max(answer, dis[i][j]);
                }
            }
        }
        else System.out.println(-1);
    }
}
