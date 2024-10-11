package rh;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private String codigo;
    private List<Empregado> empregados;

    // Construtor
    public Departamento(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.empregados = new ArrayList<>();
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

    // Métodos de manipulação de empregados
    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public List<Empregado> listarEmpregados() {
        return empregados;
    }

    public boolean apagarEmpregado(Empregado empregado) {
        return empregados.remove(empregado);
    }

    public void alterarEmpregado(Empregado empregadoAtualizado) {
        for (int i = 0; i < empregados.size(); i++) {
            Empregado emp = empregados.get(i);
            if (emp.getCpf().equals(empregadoAtualizado.getCpf())) {
                empregados.set(i, empregadoAtualizado);
                break;
            }
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Departamento [nome=" + nome + ", codigo=" + codigo + ", empregados=" + empregados + "]";
    }
}