package ex3;

import java.util.Base64;

public class Usuario {

	private Long id;

	private String nif;
	private String nome;
	private String senha;
	// usuário pode ser Comum, Coordenador ou Administrador
	private TipoUsuario tipoUsuario;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public void setSenhaCrip(String senha) {
		this.senha = senha;
	}


	public boolean isAdmin() {
		return this.getTipoUsuario() == TipoUsuario.ADMINISTRADOR;
	}

}
