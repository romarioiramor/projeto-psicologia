package br.com.vimedeiros.controler;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name="consulta")
public class Consulta extends Cliente{
	
		private Date dataConsulta;
		private double valorConsulta;
		private double valorTotal;
		private String horario;
		
		
		public String listar() {
			List<String> c = new ArrayList<>();
			c.add(getNome());
			c.add(getEmail());
			c.add(getCpf());
			//c.add(getDataNascimento());
			c.add(getTelefone());
			c.add(getCelular());
			c.add(getAnotacoes());
			//c.add(getDataConsulta());
			c.add(getHorario());
			//c.add(getValorConsulta());
			//c.add(getValorTotal());
			//c.add(getEncPsiquiatrico());
			
			return"";
		}
		
		public Date getDataConsulta() {
			return dataConsulta;
		}
		public void setDataConsulta(Date dataConsulta) {
			this.dataConsulta = dataConsulta;
		}
		public double getValorConsulta() {
			return valorConsulta;
		}
		public void setValorConsulta(double valorConsulta) {
			this.valorConsulta = valorConsulta;
		}
		public double getValorTotal() {
			return valorTotal;
		}
		public void setValorTotal(double valorTotal) {
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
