public class Ex4 {

    static class Aluno {
        int matricula;
        String nome;
        int idade;

        public Aluno(int m, String n, int i) {
            this.matricula = m;
            this.nome = n;
            this.idade = i;
        }

        @Override
        public String toString() {
            return matricula + " - " + nome + " - " + idade + " anos";
        }
    }

    public static void main(String[] args) {
        Aluno a = new Aluno(101, "Ana", 20);
        System.out.println(a);
    }
}
