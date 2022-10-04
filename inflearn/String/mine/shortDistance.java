package inflearn.String.mine;

import java.util.Scanner;

public class shortDistance {
    public String solution(String s, char t) {
        String answer = "";
        char[] arr = s.toCharArray();
        int dis = Integer.MAX_VALUE;
        for(int i=0; i<s.length(); i++) {
            if(arr[i] != t) {
                for(int j=0; j<s.length(); j++) {
                    if(arr[j] == t) {
                        if(dis > Math.abs(i-j)) dis = Math.abs(i-j);
                    }
                }
                answer += dis + " ";
                dis = Integer.MAX_VALUE;
            } else {
                answer += "0 ";
                dis = Integer.MAX_VALUE;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        shortDistance T = new shortDistance();
        String s = in.next();
        char t = in.next().charAt(0);
        System.out.println(T.solution(s, t));
    }
}
