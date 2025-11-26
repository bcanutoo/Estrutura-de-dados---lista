import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;

public class Ex16 {
    public static void main(String[] args) {
        Stack<Integer> p1 = new Stack<>(); 
        Stack<Integer> p2 = new Stack<>();
        p1.push(5); p1.push(3); p1.push(1);
        p2.push(6); p2.push(4); p2.push(2);

        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        while(!p1.isEmpty()) a1.add(p1.pop());
        while(!p2.isEmpty()) a2.add(p2.pop());
        Collections.sort(a1); Collections.sort(a2); 
        ArrayList<Integer> merged = new ArrayList<>();
        int i=0,j=0;
        while(i<a1.size() && j<a2.size()){
            if(a1.get(i) < a2.get(j)) merged.add(a1.get(i++));
            else merged.add(a2.get(j++));
        }
        while(i<a1.size()) merged.add(a1.get(i++));
        while(j<a2.size()) merged.add(a2.get(j++));

        Stack<Integer> result = new Stack<>();
        for(int v: merged) result.push(v);

        System.out.println("Resultado (top = maior): " + result);
    }
}
