package br.com.administrador.negocio;

import br.com.administrador.Administrador;
import br.com.administrador.io.Banco;

public abstract class Negocio extends Administrador {
  
	Banco oBanco;
	
	public Negocio() {
		if (this.oBanco == null) {
			oBanco = new Banco();
		}
	}
	
}
