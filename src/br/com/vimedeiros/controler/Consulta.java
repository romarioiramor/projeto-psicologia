package br.com.vimedeiros.controler;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name="consulta")
public class Consulta extends Cliente{
	
		private Date dataConsulta;
		private double valorConsulta;
		private double valorTotal;
		
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
		
		
	
}
