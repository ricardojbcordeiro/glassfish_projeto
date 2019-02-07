package br.com.glassfish.ejb;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.com.glassfish.java.ejb.remoto.TesteEjbRemoto;

/**
 * Session Bean implementation class TesteEjb
 */
@Stateless
@Remote(TesteEjbRemoto.class)
public class TesteEjb implements TesteEjbRemoto {

    /**
     * Default constructor. 
     */
    public TesteEjb() {
        // TODO Auto-generated constructor stub
    }

}
