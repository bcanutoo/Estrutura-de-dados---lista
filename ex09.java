import java.util.Scanner;
import java.util.Arrays;

public class Ex9 {
    static class Seq {
        int[] data; int size;
        Seq(int cap){ data=new int[cap]; size=0; }
        void insertAt(int v,int pos){
            if(pos<0||pos>size) throw new IndexOutOfBoundsException();
            for(int i=size;i>pos;i--) data[i]=data[i-1];
            data[pos]=v; size++;
        }
        void print(){ System.out.println(Arrays.toString(Arrays.copyOf(data,size))); }
    }

    public static void main(String[] args) {
        Seq s = new Seq(20);
        s.insertAt(5,0); s.insertAt(8,1); s.insertAt(20,2); s.insertAt(30,3);
        System.out.print("Inicial: "); s.print();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 valores para inserir mantendo ordenação:");
        for(int k=0;k<5;k++){
            int v = sc.nextInt();
            int pos = 0;
            while(pos < s.size && s.data[pos] < v) pos++;
            s.insertAt(v,pos);
            System.out.print("Após inserir " + v + ": "); s.print();
        }
    }
}
