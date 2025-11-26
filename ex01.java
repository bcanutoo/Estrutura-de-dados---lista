import java.util.Scanner;

class SequentialList1 {
    private int[] data;
    private int size;

    public SequentialList1(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public void insertEnd(int value) {
        data[size++] = value;
    }

    public void insertAtStart(int value) {
        for (int i = size; i > 0; i--) data[i] = data[i - 1];
        data[0] = value;
        size++;
    }

    public void print() {
        System.out.print("Lista: ");
        for (int i = 0; i < size; i++) System.out.print(data[i] + " ");
        System.out.println();
    }

    public int indexOf(int value) {
        for (int i = 0; i < size; i++)
            if (data[i] == value) return i;
        return -1;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        SequentialList1 lista = new SequentialList1(20);
        Scanner sc = new Scanner(System.in);

        lista.insertEnd(10);
        lista.insertEnd(20);
        lista.insertEnd(30);
        lista.insertEnd(40);
        lista.insertEnd(50);

        lista.print();

        lista.insertEnd(14);
        lista.print();

        System.out.print("Digite um número para inserir no início: ");
        int n = sc.nextInt();
        lista.insertAtStart(n);
        lista.print();

        System.out.print("Digite um número para buscar: ");
        int x = sc.nextInt();
        int pos = lista.indexOf(x);
        if (pos >= 0) System.out.println("Encontrado na posição " + pos);
        else System.out.println("Não encontrado.");

        System.out.println("Se a lista fosse alfabética, seria necessário inserir em ordem.");
    }
}
