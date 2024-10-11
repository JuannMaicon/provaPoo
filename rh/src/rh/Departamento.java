package rh;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private String nome;
	private String codigo;
	private List<Empregado> empregados; // Relacionamento 1 para muitos

	public Departamento(String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
		this.empregados = new ArrayList<>();
	}

	// Adiciona um empregado ao departamento
	public void adicionarEmpregado(Empregado empregado) {
		empregados.add(empregado);
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<Empregado> getEmpregados() {
		return empregados;
	}
}