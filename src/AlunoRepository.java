import java.util.Set;
import java.util.TreeSet;

public class AlunoRepository {

    Set<Aluno> alunos;

    public AlunoRepository() {
        this.alunos = new TreeSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                alunos.remove(aluno);
            }
        }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        if (!alunosPorNome.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("A lista esta vazia");
        }
    }

    public void exibirAlunosPornota(){
        Set<Aluno> alunosPornota = new TreeSet<>(new CompararPorNota());
        if (!alunos.isEmpty()) {
            alunosPornota.addAll(alunos);
            System.out.println(alunosPornota);
        } else {
            System.out.println("A lista esta vazia");
        }
    }

    public Set<Aluno> exibirAlunos() {
        Set<Aluno> alunosParaExibir = new TreeSet<>();

        if (!alunos.isEmpty()) {
            alunosParaExibir.addAll(alunos);
        } else {
            System.out.println("A lista esta vazia");
        }
        return alunosParaExibir;
    }

}
