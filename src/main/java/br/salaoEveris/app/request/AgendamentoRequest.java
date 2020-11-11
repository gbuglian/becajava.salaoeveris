package br.salaoEveris.app.request;

import java.util.Calendar;

import br.salaoEveris.app.model.Cliente;
import br.salaoEveris.app.model.Servico;

public class AgendamentoRequest {
	
	private Calendar dataHora;
	private Servico servico;
	private Cliente cliente;

	public Calendar getDataHora() {
		return dataHora;
	}

	public void setDataHora(Calendar dataHora) {
		this.dataHora = dataHora;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
