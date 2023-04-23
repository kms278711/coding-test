package inflearn.Recursive.BFS.mine;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class tomato {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] storage;
    static int m,n, answer = 0;
    static boolean flag = false;
    public void BFS() {
        Queue<Point> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(storage[i][j] == 1) Q.offer(new Point(i, j));
            }
        }

        while(!Q.isEmpty()) {
            int size = Q.size();
            for (int k=0; k < size; k++) {
                Point tmp = Q.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = tmp.x + dx[i];
                    int ny = tmp.y + dy[i];
                    if(nx>=1 && ny>=1 && nx<=n && ny<=m && storage[nx][ny]==0) {
                        storage[nx][ny] = 1;
                        Q.offer(new Point(nx, ny));
                    }
                }
            }
            answer ++;
            if(answer > 10) break;
        }
    }

    public static void main (String[] args) {
        tomato T = new tomato();
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        storage = new int[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                storage[i][j] = in.nextInt();
            }
        }
        T.BFS();

        flag = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(storage[i][j] == 0) flag = false;
            }
        }
        if(flag) System.out.println(answer-1);
        else System.out.println(-1);
    }
}
