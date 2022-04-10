package funcionario;

public abstract class Funcionario {

	private String nome;
	private String cpf;
	private Double salario;

	public Funcionario() {

	}

	public Funcionario(String nome, String cpf, Double salario, Double bonus) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public abstract double calcularBonus();

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}

}
