package br.salaoEveris.app.response;

import java.util.Calendar;
import br.salaoEveris.app.model.*;

public class AgendamentoResponse extends BaseResponse{
	
	private Long id;
	private Calendar data;
	private Servico servico;
	private Cliente cliente;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
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
