package inflearn.Stack.mine;

import java.util.Scanner;
import java.util.Stack;

public class craneGame {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int x : moves) {
            for (int i = 0; i < board.length; i++) {
                if(board[i][x-1] != 0) {
                    if(stack.isEmpty()) {
                        stack.push(board[i][x-1]);
                    } else {
                        if(stack.peek() == board[i][x-1]) {
                            stack.pop();
                            answer += 2;
                        } else {
                            stack.push(board[i][x-1]);
                        }
                    }
                    board[i][x-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        craneGame T = new craneGame();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = in.nextInt();
            }
        }
        int movesCnt = in.nextInt();
        int[] moves = new int[movesCnt];
        for (int i = 0; i < movesCnt; i++) {
            moves[i] = in.nextInt();
        }
        System.out.println(T.solution(board, moves));
    }
}
