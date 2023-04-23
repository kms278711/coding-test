package inflearn.Recursive.DFS.mine;

import java.util.Scanner;
import java.util.Stack;

public class miro_wrong {
    static int[][] arr = new int[9][9];
    static Stack<coordinate> stack = new Stack<>();
    static int answer = 0;
    public void DFS(int x, int y) {
        if(x==7 && y ==7) {
            answer ++;
        }
        else {
            if(arr[x][y-1] == 0) {
                arr[x][y] = 1;
                stack.push(new coordinate(x, y));
                DFS(x, y-1);
            } else if(arr[x+1][y] == 0) {
                arr[x][y] = 1;
                stack.push(new coordinate(x, y));
                DFS(x+1, y);
            } else if(arr[x][y+1] == 0) {
                arr[x][y] = 1;
                stack.push(new coordinate(x, y));
                DFS(x, y+1);
            } else if(arr[x-1][y] == 0) {
                arr[x][y] = 1;
                stack.push(new coordinate(x, y));
                DFS(x-1, y);
            } else {
                int px = stack.peek().getX();
                int py = stack.peek().getY();
                stack.pop();
                DFS(px, py);
            }

        }

    }
    public static void main(String[] args) {
        miro_wrong T = new miro_wrong();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <= 8; i++) {
            arr[i][0] = 1;
            arr[0][i] = 1;
            arr[8][i] = 1;
            arr[i][8] = 1;
        }
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        T.DFS(1, 1);
        System.out.println(answer);
    }
}
class coordinate {
    private int x, y;
    public coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
