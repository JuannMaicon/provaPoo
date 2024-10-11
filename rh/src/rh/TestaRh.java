package rh;

public class TestaRh {
	public static void main(String[] args) {
		// Criando um cargo
		Cargo cargoDev = new Cargo("Desenvolvedor", "Desenvolve sistemas e soluções");

		// Criando empregados
		Empregado emp1 = new Empregado("Juan", "123.456.789-10", "2024-01-10", 3000.00, "1999-05-15", cargoDev,
				Nivel.JUNIOR);
		Empregado emp2 = new Empregado("Maria", "987.654.321-00", "2022-03-15", 5000.00, "1995-02-28", cargoDev,
				Nivel.PLENO);

		// Criando um departamento
		Departamento deptTI = new Departamento("Tecnologia da Informação", "TI01");
		deptTI.adicionarEmpregado(emp1);
		deptTI.adicionarEmpregado(emp2);

		// Exibindo informações
		System.out.println("Departamento: " + deptTI.getNome());
		for (Empregado emp : deptTI.listarEmpregados()) {
			System.out.println("Empregado: " + emp.getNome() + ", Cargo: " + emp.getCargo().getTitulo() + ", Nível: "
					+ emp.getNivel());
		}
	}

}
