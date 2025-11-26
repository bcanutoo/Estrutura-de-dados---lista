import java.util.ArrayList;
import java.util.Iterator;

public class Ex6 {
    static class Aluno {
        int matricula; String nome; int idade;
        Aluno(int m,String n,int i){ matricula=m; nome=n; idade=i; }
        public String toString(){ return matricula + " " + nome + " " + idade; }
    }

    public static void removeMenorQue(ArrayList<Aluno> lista, int N) {
        Iterator<Aluno> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next().idade < N) it.remove();
        }
    }

    public static void main(String[] args) {
        ArrayList<Aluno> lista = new ArrayList<>();
        lista.add(new Aluno(1,"Ana",18));
        lista.add(new Aluno(2,"Beto",21));
        lista.add(new Aluno(3,"Caio",17));
        System.out.println("Antes: " + lista);
        removeMenorQue(lista, 18);
        System.out.println("Depois (idade >= 18): " + lista);
    }
}
