package alunos;

public class MainAlunosDaDisciplina {

	public static void main(String[] args) {

		AlunosMatriculados aM = new AlunosMatriculados("Joao Paulo", 7894, 5.0, 7.0, 5.0);
		AlunosMatriculados aM2 = new AlunosMatriculados("Maria Clara", 7294, 6.0, 8.0, 10.0);
		
		System.out.println("Aluno(a): " + aM.getNomeAluno() + " de matricula: " + aM.getMatricula() + " obteve a média "
				+ aM.calcularMedia(aM.getMedia()) + "\n");
		
		System.out.println("Caso Aluno(a) NÃO esteja em recuperação retorno será = 0, caso esteja será confirmada a recuperação! \n"
						+ aM.recuperacao(aM.getRecuperacao()) + "\n");
		
		System.out.println("=======================================================================================================\n");
		
		System.out.println("Aluno(a): " + aM2.getNomeAluno() + " de matricula: " + aM2.getMatricula() + " obteve a média "
				+ aM2.calcularMedia(aM2.getMedia()) + "\n");
		
		System.out.println("Caso Aluno(a) NÃO esteja em recuperação retorno será = 0, caso esteja será confirmada a recuperação! \n"
						+ aM2.recuperacao(aM2.getRecuperacao()) + "\n");

	}

}
