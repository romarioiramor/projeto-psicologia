package br.com.vimedeiros.controler;



import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name="consulta")
public class Consulta extends Cliente{
	
		private String dataConsulta;
		private String valorConsulta;
		private String valorTotal;
		private String horario;
		
		public Consulta() {
			
		}
			
		public Consulta(String dataConsulta, String valorConsulta, String valorTotal, String horario) {
			super();
			this.dataConsulta = dataConsulta;
			this.valorConsulta = valorConsulta;
			this.valorTotal = valorTotal;
			this.horario = horario;
		}

		public String listar() {
			List<String> c = new ArrayList<>();
			c.add(getNome());
			c.add(getEmail());
			c.add(getCpf());
			c.add(getDataNascimento());
			c.add(getTelefone());
			c.add(getCelular());
			c.add(getAnotacoes());
			c.add(getDataConsulta());
			c.add(getHorario());
			c.add(getValorConsulta());
			c.add(getValorTotal());
			c.add(getEncPsiquiatrico());
			
			return"";
		}
		
		public String getDataConsulta() {
			return dataConsulta;
		}
		public void setDataConsulta(String dataConsulta) {
			this.dataConsulta = dataConsulta;
		}
		public String getValorConsulta() {
			return valorConsulta;
		}
		public void setValorConsulta(String valorConsulta) {
			this.valorConsulta = valorConsulta;
		}
		public String getValorTotal() {
			return valorTotal;
		}
		public void setValorTotal(String valorTotal) {
			this.valorTotal = valorTotal;
		}
		public String getHorario() {
			return horario;
		}
		public void setHorario(String horario) {
			this.horario = horario;
		}
		@Override
		public String toString() {
			return "Consulta [dataConsulta=" + dataConsulta + ", valorConsulta=" + valorConsulta + ", valorTotal="
					+ valorTotal + ", horario=" + horario + "]";
		}
		
		
	
}
