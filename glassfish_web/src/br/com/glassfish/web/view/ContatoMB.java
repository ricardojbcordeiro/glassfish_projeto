package br.com.glassfish.web.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.estudo.java.ejb.remoto.ContatoEjbRemoto;
import br.com.estudo.java.model.Contato;

@Named
@RequestScoped
public class ContatoMB implements Serializable {

	private static final long serialVersionUID = -9197790443536535874L;

	private Contato model;
	private List<Contato> dataModel;

	@EJB
	private ContatoEjbRemoto contatoEjb;

	public ContatoMB() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void init() {
		this.model = new Contato();
		this.iniciarBanco();
		this.dataModel = this.contatoEjb.listar();
	}

	private void iniciarBanco() {
		for (int i = 0; i < 100; i++) {
			Contato contato = new Contato();
			contato.setNome("contato " + i);
		}

	}

	public Contato getModel() {
		return model;
	}

	public void setModel(Contato model) {
		this.model = model;
	}

	public List<Contato> getDataModel() {
		return dataModel;
	}

	public void setDataModel(List<Contato> dataModel) {
		this.dataModel = dataModel;
	}

	public void actionSalvar() {
		this.contatoEjb.salvar(this.getModel());
	}

	public void actionAlterar() {

	}

	public void actionExcluir() {

	}

	public void actionPesquisar() {

	}

}
