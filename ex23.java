import java.util.Stack;

public class Ex23 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>(); s1.push(1); s1.push(2); s1.push(3);
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> aux = new Stack<>();
 
        while(!s1.isEmpty()) aux.push(s1.pop());
        
        while(!aux.isEmpty()){
            int v = aux.pop();
            s2.push(v);
            s1.push(v); 
        }
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
    }
}
