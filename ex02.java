class SequentialList2 {
    private int[] data = new int[50];
    private int size = 0;

    public boolean insertNoDuplicate(int value) {
        for (int i = 0; i < size; i++)
            if (data[i] == value) return false; 

        data[size++] = value;
        return true;
    }

    public void print() {
        System.out.print("Lista: ");
        for (int i = 0; i < size; i++) System.out.print(data[i] + " ");
        System.out.println();
    }
}

public class Ex2 {
    public static void main(String[] args) {
        SequentialList2 lista = new SequentialList2();

        System.out.println(lista.insertNoDuplicate(10)); 
        System.out.println(lista.insertNoDuplicate(10)); 
        lista.insertNoDuplicate(20);
        lista.print();
    }
}
