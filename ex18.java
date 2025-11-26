import java.util.LinkedList;
import java.util.Queue;

public class Ex18 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>()
        q.add(3); q.add(8); q.remove(); q.add(3); q.remove();
        q.add(7); q.remove(); q.add(6); q.add(5);
        System.out.println("Estado final (Ex18): " + q);
    }
}
