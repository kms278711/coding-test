package inflearn.HashMap.mine;

import java.util.HashMap;
import java.util.Scanner;

public class anagram {
    public String solution(String[] arr) {
        String answer = "NO";
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : arr[0].toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : arr[1].toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        if(map.equals(map2)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        anagram T = new anagram();
        Scanner in = new Scanner(System.in);
        String[] arr = new String[2];
        arr[0] = in.nextLine();
        arr[1] = in.nextLine();
        System.out.println(T.solution(arr));
    }
}
