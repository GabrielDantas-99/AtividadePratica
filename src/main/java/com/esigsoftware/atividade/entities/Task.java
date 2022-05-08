package com.esigsoftware.atividade.entities;

import java.io.Serializable;
import java.util.Objects;

public class Task implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String titulo;
	private String descricao;
	private String responsavel;
	private String prioridade;
	private String data;
	
	public Task() {
	}

	public Task(Long id, String titulo, String descricao, String responsavel, String prioridade, String data) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.responsavel = responsavel;
		this.prioridade = prioridade;
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(id, other.id);
	}
	
}
