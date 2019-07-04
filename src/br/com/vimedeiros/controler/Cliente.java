package br.com.vimedeiros.controler;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name="cliente")
public class Cliente {

	private String nome;
	private String cpf;
	private String email;
	private String dataNascimento;
	private String telefone;
	private String celular;
	private String encPsiquiatrico;
	private String anotacoes;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cpf, String email, String dataNascimento, String telefone, String celular,
			String encPsiquiatrico, String anotacoes) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.celular = celular;
		this.encPsiquiatrico = encPsiquiatrico;
		this.anotacoes = anotacoes;
	}

	public String salvar() {
		List<String> s = new ArrayList<>();
		s.add(getNome());
		s.add(getEmail());
		s.add(getCpf());
		s.add(getDataNascimento());
		s.add(getTelefone());
		s.add(getCelular());

		
		
		return"";
	}
	

	public String getAnotacoes() {
		return anotacoes;
	}
	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEncPsiquiatrico() {
		return encPsiquiatrico;
	}
	public void setEncPsiquiatrico(String encPsiquiatrico) {
		this.encPsiquiatrico = encPsiquiatrico;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", dataNascimento=" + dataNascimento
				+ ", telefone=" + telefone + ", celular=" + celular + ", encPsiquiatrico=" + encPsiquiatrico
				+ ", anotacoes=" + anotacoes + "]";
	}
	
}
