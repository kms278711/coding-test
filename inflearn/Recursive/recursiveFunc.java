package inflearn.Recursive;

public class recursiveFunc {
    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        recursiveFunc T = new recursiveFunc();
        T.DFS(3);
    }

}
