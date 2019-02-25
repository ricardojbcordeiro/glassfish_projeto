package br.com.estudo.java.dao;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import br.com.estudo.java.model.Contato;

@Named("daoContatoList")
@ApplicationScoped
public class DaoContatoList implements DaoContato {

	private List<Contato> bancoList;
	private Integer id = 0;
	
	public List<Contato> getBancoList() {
		if(this.bancoList == null) {
			this.bancoList = new ArrayList<Contato>();
		}
		return bancoList;
	}
	
	@Override
	public void salvar(Contato model) {
		model.setId(++id);
		this.getBancoList().add(model);
	}

	@Override
	public Contato alterar(Contato model) {
		return null;
	}

	@Override
	public void excluir(Contato model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Contato> listar() {
		return this.getBancoList();
	}

	@Override
	public void salvar(List<Contato> lista) {
		for(Contato contato : lista) {
			this.salvar(contato);
		}
	}

}
