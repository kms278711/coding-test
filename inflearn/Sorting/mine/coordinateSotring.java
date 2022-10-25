package inflearn.Sorting.mine;

import java.util.ArrayList;
import java.util.Scanner;

class coordinate {
    int x, y;
    coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class coordinateSotring {
    public ArrayList<coordinate> solution(int n, ArrayList<coordinate> arr) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr.get(j).x > arr.get(j+1).x || ((arr.get(j).x == arr.get(j+1).x) && arr.get(j).y > arr.get(j+1).y)) {
                    int tmpX = arr.get(j).x;
                    int tmpY = arr.get(j).y;
                    arr.set(j, new coordinate(arr.get(j+1).x, arr.get(j+1).y));
                    arr.set(j+1, new coordinate(tmpX, tmpY));
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        coordinateSotring T = new coordinateSotring();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<coordinate> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new coordinate(in.nextInt(), in.nextInt()));
        }
        for (coordinate x : T.solution(n, arr)) System.out.println(x.x + " " + x.y);
    }
}
