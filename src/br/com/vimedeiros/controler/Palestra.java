package br.com.vimedeiros.controler;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@SessionScoped
@ManagedBean(name="palestra")
public class Palestra extends Oficina{

	
	
	public Palestra() {
		
	}
	
	

	public String inscrever() {

		
		List<String> insc = new ArrayList<>();
		insc.add(getTema());
		insc.add(getNome());
		insc.add(getEmail());
		insc.add(getTelefone());
		insc.add(getData());
		
		return"";
		
			
		
	}
	
}
