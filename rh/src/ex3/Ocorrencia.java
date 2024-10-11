package ex3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ocorrencia {

	private Long id;
	private Calendar data;
	private Long idAluno;
	private String nomeAluno;
	private Long idTurma;
	private String turma;
	private String descricao;
	private Usuario usuario;
	private boolean restrita;
	// tipos de ocorrência podem ser Frequência, Comportamento, Saúde Mental, Administrativa ou Outras.
	private TipoOcorrencia tipo;

	public boolean isRestrita() {
		return restrita;
	}

	public void setRestrita(boolean restrita) {
		this.restrita = restrita;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Long idAluno) {
		this.idAluno = idAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public Long getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(Long idTurma) {
		this.idTurma = idTurma;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuarios) {
		this.usuario = usuarios;
	}

	public String getDataFormatada() {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		return formatador.format(getData().getTime());
	}

	public TipoOcorrencia getTipo() {
		return tipo;
	}

	public void setTipo(TipoOcorrencia tipo) {
		this.tipo = tipo;
	}

}
