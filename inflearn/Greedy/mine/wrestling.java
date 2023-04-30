package inflearn.Greedy.mine;

import java.util.Scanner;

public class wrestling {
    static int[] length, weight;
    public int solution(int[] length, int[] weight) {
        int answer = length.length;
        for (int i = 0; i < length.length; i++) {
            int tmp1 = length[i];
            int tmp2 = weight[i];
            for (int j = 0; j < length.length; j++) {
                if(tmp1<length[j] && tmp2<weight[j]) {
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        wrestling T = new wrestling();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        length = new int[n];
        weight = new int[n];
        for (int i = 0; i < n; i++) {
            length[i] = in.nextInt();
            weight[i] = in.nextInt();
        }
        System.out.println(T.solution(length, weight));
    }
}
