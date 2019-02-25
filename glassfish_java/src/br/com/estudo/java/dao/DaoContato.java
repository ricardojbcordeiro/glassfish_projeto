package br.com.estudo.java.dao;

import java.util.List;

import br.com.estudo.java.model.Contato;

public interface DaoContato {

	public void salvar(Contato model);
	
	public void salvar(List<Contato> lista);
	
	public Contato alterar(Contato model);
	
	public void excluir(Contato model);
	
	public List<Contato> listar();
	
}
