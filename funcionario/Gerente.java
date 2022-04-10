package funcionario;

public class Gerente extends Funcionario {

	private Integer matricula;
	private Integer funcionariosEmGestao;

	public Gerente() {
		super();
	}

	public Gerente(String nome, String cpf, Double salario, Double bonus, Integer matricula,
			Integer funcionariosEmGestao) {
		super(nome, cpf, salario, bonus);
		this.matricula = matricula;
		this.funcionariosEmGestao = funcionariosEmGestao;
	}

	@Override
	public double calcularBonus() {
		return 10000;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Integer getFuncionariosEmGestao() {
		return funcionariosEmGestao;
	}

	public void setFuncionariosEmGestao(Integer funcionariosEmGestao) {
		this.funcionariosEmGestao = funcionariosEmGestao;
	}

	@Override
	public String toString() {
		return "Gerente [matricula=" + matricula + ", funcionariosEmGestao=" + funcionariosEmGestao + "]";
	}

}
