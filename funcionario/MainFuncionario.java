package funcionario;

public class MainFuncionario {

	public static void main(String[] args) {
		
		Estagiario estg = new Estagiario("Joao Paulo da Silva", "045.877.995-30", 1000.00, 200.00, 4684, "Analise e Desenvolvimento de Sistemas");
		
		//Outra forma de puxar dados do "Estagiário"

		/*estg.setNome("Joao Paulo da Silva");
		estg.setCpf("045.877.995-30");
		estg.setMatricula(4684);
		estg.setCurso("Analise e Desenvolvimento de Sistemas");
		estg.setSalario(1000.00);*/

		Gerente gt = new Gerente("Ana Luisa Junqueira", "125.787.745-40", 10000.00, 10000.00, 3474, 20);

		//Outra forma de puxar dados do "Gerente"
		
		/*gt.setNome("Ana Luisa Junqueira");
		gt.setCpf("125.787.745-40");
		gt.setMatricula(3474);
		gt.setFuncionariosEmGestao(20);
		gt.setSalario(10000.00);*/

		System.out.printf("\t Primeiro Funcionário: \n");
		System.out.println("-------------------------------------------------");
		System.out.printf("Nome: " + estg.getNome() + "\n" + "Cpf: " + estg.getCpf() + "\n" + "Matricula: "
				+ estg.getMatricula() + "\n" + "Curso: " + estg.getCurso() + "\n" + "Salário: R$"
				+ (String.format("%.2f", estg.getSalario())) + "\n");
		
		System.out.println("Possui um bônus de R$" + (String.format("%.2f", estg.calcularBonus())));
		System.out.println("Salário Total: R$" + ((String.format("%.2f", estg.getSalario() + estg.calcularBonus()))) + "\n");
		
		System.out.printf("\t Segundo Funcionário: \n");
		System.out.println("-------------------------------------------------");
		System.out.printf("Nome: " + gt.getNome() + "\n" + "Cpf: " + gt.getCpf() + "\n" + "Matricula: "
				+ gt.getMatricula() + "\n" + "Funcionários em Gestão: " + gt.getFuncionariosEmGestao() + "\n" + "Salário: R$"
				+ (String.format("%.2f", gt.getSalario())) + "\n");

		System.out.println("Possui um bônus de R$" + (String.format("%.2f", gt.calcularBonus())));
		System.out.println("Salário Total: R$" + ((String.format("%.2f", gt.getSalario() + gt.calcularBonus()))));
	}
}
