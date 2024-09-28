package br.com.fiap.DigitalTraining.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "treinamentos")
public class Treinamento {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "treinamento_id")
	private Long treinamentoId;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "horas", nullable = false, length = 4)
	private int horas;
	
	@Column(name = "data_lancamento", nullable = false)
	private String dataLancamento;
	
	@Column(name = "relevancia", nullable = false, length = 100)
	private String relevancia;
	
	@Column(name = "descricao", nullable = false, length = 1000)
	private String descricao;

	// construtores
	
	public Treinamento() {
		
	}
	
	public Treinamento(Long treinamentoId, String nome, int horas, String dataLancamento, String relevancia,
			String descricao) {
		this.treinamentoId = treinamentoId;
		this.nome = nome;
		this.horas = horas;
		this.dataLancamento = dataLancamento;
		this.relevancia = relevancia;
		this.descricao = descricao;
	}
	
	// getters e setters

	public Long getTreinamentoId() {
		return treinamentoId;
	}

	public void setTreinamentoId(Long treinamentoId) {
		this.treinamentoId = treinamentoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getRelevancia() {
		return relevancia;
	}

	public void setRelevancia(String relevancia) {
		this.relevancia = relevancia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	// to String

	@Override
	public String toString() {
		return "Treinamento [treinamentoId=" + treinamentoId + ", nome=" + nome + ", horas=" + horas
				+ ", data_lancamento=" + dataLancamento + ", relevancia=" + relevancia + ", descricao=" + descricao
				+ "]";
	}
}
