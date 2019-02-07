package br.com.glassfish.ejb;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.com.glassfish.java.model.Contato;

/**
 * Session Bean implementation class ContatoEJB
 */
@Stateless
@LocalBean
public class ContatoEJB {

	Logger logger = Logger.getLogger(Contato.class.getCanonicalName());
	
    /**
     * Default constructor. 
     */
    public ContatoEJB() {
        // TODO Auto-generated constructor stub
    }

    public void salvar(Contato contato) {
    	logger.log(Level.INFO, "chamando método do ejb");
    }
    
}
