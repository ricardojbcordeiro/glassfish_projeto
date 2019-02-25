package br.com.estudo.ejb;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.estudo.java.dao.DaoContato;
import br.com.estudo.java.ejb.remoto.ContatoEjbRemoto;
import br.com.estudo.java.model.Contato;

/**
 * Session Bean implementation class ContatoEJB
 */
@Stateless
@LocalBean
@Remote(ContatoEjbRemoto.class)
public class ContatoEJB implements ContatoEjbRemoto {

	Logger logger = Logger.getLogger(Contato.class.getCanonicalName());
	
	@Inject()
	private DaoContato daoContato;
	
    /**
     * Default constructor. 
     */
    public ContatoEJB() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void salvar(Contato model) {
    	logger.log(Level.INFO, "chamando método do ejb");
    	this.daoContato.salvar(model);
    }

	@Override
	public Contato alterar(Contato model) {
		return this.daoContato.alterar(model);
	}

	@Override
	public void excluir(Contato model) {
		this.daoContato.excluir(model);
	}

	@Override
	public List<Contato> listar() {
		return this.daoContato.listar();
	}

	@Override
	public void salvar(List<Contato> lista) {
		this.daoContato.salvar(lista);
	}
    
}
