package inflearn.HashMap.mine;

import java.util.*;

public class classPresident {
    public char solution(int n, String str) {
        char answer = 'A';
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('B', 0);
        map.put('C', 0);
        map.put('D', 0);
        map.put('E', 0);
        for (char c : str.toCharArray()) {
            int tmp = map.get(c) + 1;
            map.put(c, tmp);
        }

        int max = 0;
        for (Character c : map.keySet()) {
            if(max < map.get(c)) {
                max = map.get(c);
                answer = c;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        classPresident T = new classPresident();
        int n = in.nextInt();
        String str = in.next();
        System.out.println(T.solution(n, str));
    }
}
