import java.util.Stack;

public class Ex22 {
    public static void main(String[] args) {
        Stack<Integer> p1 = new Stack<>(); 
        Stack<Integer> p2 = new Stack<>();
        Stack<Integer> p3 = new Stack<>();

        p1.push(9); p1.push(8); p1.push(7); p1.push(6);
        System.out.println("Inicial p1: " + p1 + " p2: " + p2 + " p3: " + p3);

        int temp = p1.pop();
        p2.push(temp);
        p3.push(p1.pop());
        p2.push(p1.pop());
        temp = p1.pop();
        p3.push(temp);
        p1.push(p2.pop());
        p3.push(p2.pop());
        p3.push(p1.pop());

        System.out.println("Final p1: " + p1 + " p2: " + p2 + " p3: " + p3);
    }
}
