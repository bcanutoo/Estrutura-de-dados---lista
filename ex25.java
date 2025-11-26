import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Ex25 {
    public static void invertQueue(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()) s.push(q.remove());
        while(!s.isEmpty()) q.add(s.pop());
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); q.add(2); q.add(3); q.add(4);
        System.out.println("Antes: " + q);
        invertQueue(q);
        System.out.println("Depois: " + q);
    }
}
