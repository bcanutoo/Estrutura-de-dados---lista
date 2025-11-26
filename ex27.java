import java.util.Arrays;

public class Ex27 {
    static class Deque {
        int[] a; int front, size;
        Deque(int cap){ a=new int[cap]; front=0; size=0; }
        boolean isFull(){ return size==a.length; }
        boolean isEmpty(){ return size==0; }
        void insertFront(int v){ if(isFull()) throw new IllegalStateException("overflow"); front=(front-1+a.length)%a.length; a[front]=v; size++; }
        void insertRear(int v){ if(isFull()) throw new IllegalStateException("overflow"); a[(front+size)%a.length]=v; size++; }
        int removeFront(){ if(isEmpty()) throw new IllegalStateException("underflow"); int v=a[front]; front=(front+1)%a.length; size--; return v; }
        int removeRear(){ if(isEmpty()) throw new IllegalStateException("underflow"); int idx=(front+size-1)%a.length; int v=a[idx]; size--; return v; }
        public String toString(){
            int[] out = new int[size];
            for(int i=0;i<size;i++) out[i]=a[(front+i)%a.length];
            return Arrays.toString(out);
        }
    }

    public static void main(String[] args) {
        Deque d = new Deque(10);
        d.insertRear(1); d.insertRear(2); d.insertFront(0);
        System.out.println("Deque: " + d);
        d.removeRear(); d.removeFront();
        System.out.println("Deque after removes: " + d);
    }
}
