import java.util.Stack;

public class Ex15 {
    public static void main(String[] args) {
        Stack<Integer> N = new Stack<>();
        Stack<Integer> P = new Stack<>();
        int[] inputs = {5, -3, 0, 7, -1, 0, 0, 12}; 
        for(int v: inputs){
            if(v > 0){ P.push(v); System.out.println(v + " -> P.push"); }
            else if(v < 0){ N.push(v); System.out.println(v + " -> N.push"); }
            else {
                System.out.println("lido 0 -> retirar de cada pilha:");
                if(!P.isEmpty()) System.out.println(" P.pop = " + P.pop()); else System.out.println(" P vazia");
                if(!N.isEmpty()) System.out.println(" N.pop = " + N.pop()); else System.out.println(" N vazia");
            }
        }
        System.out.println("Estado final P: " + P);
        System.out.println("Estado final N: " + N);
    }
}
