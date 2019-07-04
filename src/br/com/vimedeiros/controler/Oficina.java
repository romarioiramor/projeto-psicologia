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
	
	public Oficina() {
		
	}
	
	public String listar() {
		List<String> lista = new ArrayList<>();
		lista.add(getTema());
		lista.add(getData());
		lista.add(getPalestrante());
		
		return "";
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
		return "Oficina [tema=" + tema + ", data=" + data + ", palestrante=" + palestrante + "]";
	}

	


}
