package inflearn.HashMap.mine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class typeOfSales {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int pt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        answer.add(map.size());
        while(pt < n-k) {
            map.put(arr[pt], map.get(arr[pt]) - 1);
            if(map.get(arr[pt]) == 0) {
                map.remove(arr[pt]);
            }
            map.put(arr[pt+k], map.getOrDefault(arr[pt+k], 0 ) + 1);
            answer.add(map.keySet().size());
            pt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        typeOfSales T = new typeOfSales();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : T.solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }
}
