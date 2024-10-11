package rh;
public class Empregado extends Funcionario {
    private double salario;
    private String dataNascimento;
    private Cargo cargo;
    private Nivel nivel;

    public Empregado(String nome, String cpf, String dataAdmissao, double salario, String dataNascimento, Cargo cargo, Nivel nivel) {
        super(nome, cpf, dataAdmissao);
        this.salario = salario;
        this.dataNascimento = dataNascimento;
        this.cargo = cargo;
        this.nivel = nivel;
    }

    
	// Getters e Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }
}

