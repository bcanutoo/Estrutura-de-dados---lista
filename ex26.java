import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Ex26 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        s.push(2); s.push(3);
        q.add(1); q.add(2); q.add(4);
        System.out.println("Inicial s: " + s + " q: " + q);

        s.push(q.remove());
        System.out.println("a) s: " + s + " q: " + q);

        s.push(q.peek());
        System.out.println("b) s: " + s + " q: " + q);

        q.add(q.remove());
        System.out.println("c) s: " + s + " q: " + q);

        s.push(s.pop());
        System.out.println("d) s: " + s);

        q.add(s.pop());
        System.out.println("e) s: " + s + " q: " + q);
    }
}
