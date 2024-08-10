import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private Long matricula;
    private Double media;

    public Aluno(String nome, Long matricula, Double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareTo(a.getNome());
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public Double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return  "{ " + nome +", " + matricula + ", " + media + " }" ;
    }

}

class CompararPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}


