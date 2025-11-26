import java.util.Arrays;

public class Ex7 {
    static class SequentialList {
        int[] data; int size;
        SequentialList(int cap){ data = new int[cap]; size = 0; }
        void insert(int v){ data[size++] = v; }
        void concat(SequentialList l){
            if (data.length < size + l.size) data = Arrays.copyOf(data, size + l.size);
            for(int i=0;i<l.size;i++) data[size++] = l.data[i];
        }
        public String toString(){
            StringBuilder sb = new StringBuilder("[");
            for(int i=0;i<size;i++){ sb.append(data[i]); if(i<size-1) sb.append(", "); }
            sb.append("]"); return sb.toString();
        }
    }

    public static void main(String[] args) {
        SequentialList a = new SequentialList(5);
        a.insert(1); a.insert(2);
        SequentialList b = new SequentialList(5);
        b.insert(3); b.insert(4); b.insert(5);
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        a.concat(b);
        System.out.println("A concat B -> " + a);
    }
}
