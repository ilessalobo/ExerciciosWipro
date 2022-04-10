package funcionario;

public class Estagiario extends Funcionario {

	private Integer matricula;
	private String curso;

	public Estagiario() {
		super();
	}

	public Estagiario(String nome, String cpf, Double salario, Double bonus, Integer matricula, String curso) {
		super(nome, cpf, salario, bonus);
		this.matricula = matricula;
		this.curso = curso;
	}

	@Override
	public double calcularBonus() {
		return 200;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Estagiario [matricula=" + matricula + ", curso=" + curso + "]";
	}

}
