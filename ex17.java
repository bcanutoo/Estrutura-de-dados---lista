import java.util.LinkedList;
import java.util.Queue;

public class Ex17 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(3); q.add(8); q.remove(); q.add(3); q.remove();
        System.out.println("Estado final (Ex17): " + q);
    }
}
