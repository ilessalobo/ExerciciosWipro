package alunos;

public class AlunosMatriculados {

	private String nomeAluno;
	private Integer matricula;
	private Double notaP1, notaP2, notaT1, media, recuperacao;

	public AlunosMatriculados(String nomeAluno, Integer matricula, Double notaP1, Double notaP2, Double notaT1) {
		super();
		this.nomeAluno = nomeAluno;
		this.matricula = matricula;
		this.notaP1 = notaP1;
		this.notaP2 = notaP2;
		this.notaT1 = notaT1;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Double getNotaP1() {
		return notaP1;
	}

	public void setNotaP1(Double notaP1) {
		this.notaP1 = notaP1;
	}

	public Double getNotaP2() {
		return notaP2;
	}

	public void setNotaP2(Double notaP2) {
		this.notaP2 = notaP2;
	}

	public Double getNotaT1() {
		return notaT1;
	}

	public void setNotaT1(Double notaT1) {
		this.notaT1 = notaT1;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public Double getRecuperacao() {
		return recuperacao;
	}

	public void setRecuperacao(Double recuperacao) {
		this.recuperacao = recuperacao;
	}

	public double calcularMedia(Double media) {
		media = (((notaP1 * 1.5) + (notaP2 * 1.5) + (notaT1 * 2)) / 5);
		return media;
	}

	public String recuperacao(Double media) {
		if (calcularMedia(media) > 7) {
			return "0";
	} else {
		return "Aluno(a) " + nomeAluno + " ficou de recuperação!";
	}
}

	@Override
	public String toString() {
		return "AlunosMatriculados [nomeAluno=" + nomeAluno + ", matricula=" + matricula + ", notaP1=" + notaP1
				+ ", notaP2=" + notaP2 + ", notaT1=" + notaT1 + ", media=" + media + ", recuperacao=" + recuperacao
				+ "]";
	}

}
