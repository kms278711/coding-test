package inflearn.HashMap.answer;

import java.util.HashMap;
import java.util.Scanner;

public class classPresident {
    public char solution(int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        //System.out.println(map.containsKey('F'));
        //System.out.println(map.size());
        //System.out.println(map.remove('A'));

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            //System.out.println(x+" "+map.get(x));
            if(map.get(key)>max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        classPresident T = new classPresident();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}
