package br.com.vimedeiros.controler;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name="oficina")
public class Oficina extends Cliente {
	private String tema;
	private String data;
	private String palestrante;
	
	
	List<String> lista = new ArrayList<String>();
	public Oficina() {
		lista.add(tema);
		lista.add(data);
		lista.add(palestrante);
	}
	
	public String salvar() {
		if (tema.equals(tema) && data.equals(data) && palestrante.equals(palestrante)) {
			System.out.println("Salvo com sucesso!!!");
		}
		
		return"";
	}
	
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getPalestrante() {
		return palestrante;
	}
	public void setPalestrante(String palestrante) {
		this.palestrante = palestrante;
	}

	@Override
	public String toString() {
		return "Oficina [tema=" + tema + ", data=" + data + ", palestrante=" + palestrante + ", lista=" + lista
				+ ", salvar()=" + salvar() + ", getTema()=" + getTema() + ", getData()=" + getData()
				+ ", getPalestrante()=" + getPalestrante() + ", getAnotacoes()=" + getAnotacoes() + ", getNome()="
				+ getNome() + ", getCpf()=" + getCpf() + ", getEmail()=" + getEmail() + ", getDataNascimento()="
				+ getDataNascimento() + ", getTelefone()=" + getTelefone() + ", getCelular()=" + getCelular()
				+ ", getEncPsiquiatrico()=" + getEncPsiquiatrico() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
