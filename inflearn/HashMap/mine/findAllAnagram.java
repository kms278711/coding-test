package inflearn.HashMap.mine;

import java.util.HashMap;
import java.util.Scanner;

public class findAllAnagram {
    public int solution(String s1, String s2) {
        int answer = 0, lt = 0;
        int rt = s2.length() - 1;
        char[] arr = s1.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>(); // abc
        HashMap<Character, Integer> map2 = new HashMap<>(); // 비교
        for (char c : s2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s2.length()-1; i++) {
            map2.put(arr[i], map2.getOrDefault(arr[i], 0) + 1);
        }
        while(rt< s1.length()) {
            map2.put(arr[rt], map2.getOrDefault(arr[rt], 0) + 1);
            if(map.equals(map2)) answer ++;
            map2.put(arr[lt], map2.get(arr[lt]) - 1);
            if(map2.get(arr[lt]) == 0) map2.remove(arr[lt]);
            lt++;
            rt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        findAllAnagram T = new findAllAnagram();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();
        System.out.println(T.solution(s, t));
    }
}
