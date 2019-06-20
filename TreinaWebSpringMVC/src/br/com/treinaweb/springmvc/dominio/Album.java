package br.com.treinaweb.springmvc.dominio;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Album {
	@NotNull(message=" O nome é obrigatório")
	@Max(value=2030,message ="O nome deve conter no maximo 20caracteres")
	@Min(value=1990,message ="O nome deve conter no minimo 4 caracteres")
	private int anoLancamento;
	@NotNull(message=" O nome é obrigatório")
	@Size(min=4, max=10,message="O nome do album deve conter entre 4 a 10 caracteres ")
	@NotEmpty(message=" O nome é obrigatório")
	private String nome;
	
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
