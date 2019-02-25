package br.com.estudo.java.ejb.remoto;

import java.util.List;

import br.com.estudo.java.model.Contato;

public interface ContatoEjbRemoto {

	public void salvar(Contato model);
	
	public void salvar(List<Contato> lista);
	
	public Contato alterar(Contato model);
	
	public void excluir(Contato model);
	
	public List<Contato> listar();
	
}
