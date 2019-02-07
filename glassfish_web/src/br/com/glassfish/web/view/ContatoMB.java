package br.com.glassfish.web.view;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ContatoMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private String hello = "Hello JSF!!!";

	public ContatoMB() {
		// TODO Auto-generated constructor stub
	}
	
	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	
}
