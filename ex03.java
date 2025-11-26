class SequentialList3 {
    protected int[] data = new int[50];
    protected int size = 0;

    public void insertAt(int value, int pos) {
        for (int i = size; i > pos; i--) data[i] = data[i - 1];
        data[pos] = value;
        size++;
    }

    public void print() {
        System.out.print("Lista: ");
        for (int i = 0; i < size; i++) System.out.print(data[i] + " ");
        System.out.println();
    }
}

class ListaOrdenada3 extends SequentialList3 {

    @Override
    public void insertAt(int value, int ignoredPos) {
        int pos = 0;
        while (pos < size && data[pos] < value) pos++;
        super.insertAt(value, pos);
    }
}

public class Ex3 {
    public static void main(String[] args) {
        ListaOrdenada3 lista = new ListaOrdenada3();
        lista.insertAt(10, 0);
        lista.insertAt(5, 0);
        lista.insertAt(7, 0);
        lista.insertAt(20, 0);

        lista.print();
    }
}
