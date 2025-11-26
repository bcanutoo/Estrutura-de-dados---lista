public class Ex8 {
    static class Seq {
        int[] data; int size;
        Seq(int cap){ data = new int[cap]; size=0; }
        void insert(int v){ data[size++]=v; }
        void transferirMaior(){
            if(size==0){ System.out.println("Lista vazia"); return; }
            if(size==1){ System.out.println("Lista com um só nó"); return; }
            int pos=0, max=data[0];
            for(int i=1;i<size;i++) if(data[i]>max){ max=data[i]; pos=i; }
            if(pos==0){ System.out.println("Maior valor já está no início da lista."); return; }
            for(int i=pos;i>0;i--) data[i]=data[i-1];
            data[0]=max;
            System.out.println("Maior valor " + max + " transferido para início.");
        }
        public String toString(){
            StringBuilder sb=new StringBuilder("[");
            for(int i=0;i<size;i++){ sb.append(data[i]); if(i<size-1) sb.append(", "); }
            sb.append("]"); return sb.toString();
        }
    }

    public static void main(String[] args) {
        Seq s = new Seq(10);
        s.insert(5); s.insert(9); s.insert(3); s.insert(12); s.insert(7);
        System.out.println("Antes: " + s);
        s.transferirMaior();
        System.out.println("Depois: " + s);
    }
}
