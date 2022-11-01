package inflearn.Recursive;

public class factorial {
    public int DFS(int n) {
        if(n==1) return 1;
        else return n*DFS(n-1);
    }
    public static void main(String[] args) {
        factorial T = new factorial();
        System.out.println(T.DFS(6));
    }
}
