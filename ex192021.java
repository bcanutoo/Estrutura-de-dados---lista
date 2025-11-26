// QUESTÃO 19/20/21
import java.util.NoSuchElementException;
import java.util.Arrays;

class CircularQueue {
    int[] q; int first, last, size;
    CircularQueue(int cap){ q=new int[cap]; first=0; last=0; size=0; }
    void enqueue(int v){
        if(size==q.length) throw new IllegalStateException("overflow");
        q[last]=v; last=(last+1)%q.length; size++;
    }
    int dequeue(){
        if(size==0) throw new NoSuchElementException("underflow");
        int v=q[first]; first=(first+1)%q.length; size--; return v;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("q="). + "";
        sb.append(Arrays.toString(q));
        sb.append(" first=").append(first).append(" last=").append(last).append(" size=").append(size);
        return sb.toString();
    }
}

public class Ex19_20_21 {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(8);
        try { System.out.println(q.dequeue()); }
        catch(Exception e){ System.out.println("Initial dequeue -> underflow ("+e.getMessage()+")"); }

        q.enqueue(1); q.enqueue(2); q.enqueue(3); q.enqueue(4); q.enqueue(5);
        System.out.println("dequeue -> " + q.dequeue());
        System.out.println("dequeue -> " + q.dequeue());
        System.out.println("dequeue -> " + q.dequeue());
        System.out.println("dequeue -> " + q.dequeue());
        q.enqueue(6); q.enqueue(7); q.enqueue(8); q.enqueue(9);
        System.out.println("Estado final interno do array (q): " + Arrays.toString(q.q));
        System.out.println("first=" + q.first + " last=" + q.last + " size=" + q.size);
    }
}
