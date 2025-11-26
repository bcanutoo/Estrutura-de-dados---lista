import java.util.Stack;

public class Ex14 {
    public static void main(String[] args) {
        int[] inputs = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        Stack<Integer> st = new Stack<>();
        for(int v: inputs){
            if(v % 2 == 0){
                st.push(v);
                System.out.println("lido par " + v + " -> push");
            } else {
                if(!st.isEmpty()){
                    int r = st.pop();
                    System.out.println("lido ímpar " + v + " -> pop removeu " + r);
                } else {
                    System.out.println("lido ímpar " + v + " -> pilha vazia");
                }
            }
        }
        System.out.println("Esvaziando pilha:");
        while(!st.isEmpty()) System.out.println(st.pop());
    }
}
