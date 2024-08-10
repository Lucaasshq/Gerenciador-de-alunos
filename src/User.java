public class User {
    public static void main(String[] args) {
        AlunoRepository alunoRepository = new AlunoRepository();



        alunoRepository.adicionarAluno("Lucas", 486321, 10);
        alunoRepository.adicionarAluno("Ruan", 852655, 6.5);
        alunoRepository.adicionarAluno("Aline", 475271, 9.5);
        alunoRepository.adicionarAluno("Zeca", 854655, 8.5);
        alunoRepository.adicionarAluno("Ruan", 825855, 7.5);
        alunoRepository.adicionarAluno("Paulo", 475124, 4.5);

        System.out.println(alunoRepository.exibirAlunos());

        alunoRepository.exibirAlunosPornota();
        alunoRepository.exibirAlunosPorNome();

    }
}
