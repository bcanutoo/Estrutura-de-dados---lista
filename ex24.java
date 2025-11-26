import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Ex24 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        s.push(3); s.push(12);
        q.add(5); q.add(8);
        int x = s.pop();
        s.push(2);
        q.add(x);
        s.push(x);
        System.out.println("s: " + s);
        System.out.println("q: " + q);
    }
}
