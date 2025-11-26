import java.util.Scanner;

class ListaAlunos5 {
    private Ex4.Aluno[] arr = new Ex4.Aluno[100];
    private int size = 0;

    public int indexOf(int matricula) {
        for (int i = 0; i < size; i++)
            if (arr[i].matricula == matricula) return i;
        return -1;
    }

    public void insert(Ex4.Aluno a) {
        arr[size++] = a;
    }

    public Ex4.Aluno removeAt(int pos) {
        Ex4.Aluno removed = arr[pos];
        for (int i = pos; i < size - 1; i++) arr[i] = arr[i + 1];
        size--;
        return removed;
    }
}

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaAlunos5 lista = new ListaAlunos5();

        for (int i = 0; i < 40; i++) {
            System.out.print("Matrícula: ");
            int m = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();

            int pos = lista.indexOf(m);

            if (pos >= 0) {
                System.out.println("Aluno já existe – removido:");
                System.out.println(lista.removeAt(pos));
            } else {
                lista.insert(new Ex4.Aluno(m, nome, idade));
                System.out.println("Aluno inserido!");
            }
        }
    }
}
