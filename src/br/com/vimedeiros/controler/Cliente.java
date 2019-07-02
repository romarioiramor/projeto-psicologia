package br.com.vimedeiros.controler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name="cliente")
public class Cliente {

	private String nome;
	private String cpf;
	private String email;
	private Date dataNascimento;
	private String telefone;
	private String celular;
	private byte encPsiquiatrico;
	private String anotacoes;
	
	public String salvar() {
		List<String> s = new ArrayList<>();
		s.add(getNome());
		s.add(getEmail());
		s.add(getCpf());
		//s.add(getDataNascimento());
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
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
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
	public byte getEncPsiquiatrico() {
		return encPsiquiatrico;
	}
	public void setEncPsiquiatrico(byte encPsiquiatrico) {
		this.encPsiquiatrico = encPsiquiatrico;
	}
	
	
	
}
