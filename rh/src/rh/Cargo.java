package rh;

public class Cargo {
    private String titulo;
    private String descricao;

    // Construtor
    public Cargo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cargo [titulo=" + titulo + ", descricao=" + descricao + "]";
    }
}