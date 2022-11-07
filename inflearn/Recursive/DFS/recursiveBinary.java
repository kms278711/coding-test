package inflearn.Recursive.DFS;

public class recursiveBinary {
    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }

    public static void main(String[] args) {
        recursiveBinary T = new recursiveBinary();
        T.DFS(11);
    }
}
