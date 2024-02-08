package br.com.administrador.negocio;

import java.util.List;

import br.com.administrador.entidade.EAcesso;
import br.com.administrador.entidade.EContato;
import br.com.administrador.persistencia.PAcesso;

public class NAcesso extends Negocio implements IAcesso {
	
	public EAcesso consultar(Integer usuario, String recurso) throws Exception {
		PAcesso pAcesso = new PAcesso(super.oBanco);
		EAcesso oEAcesso = new EAcesso();
		super.oBanco.conectar();
		oEAcesso = pAcesso.consultar(usuario, recurso);
		super.oBanco.desconectar();
		return oEAcesso;
	}

	public int alterar(EAcesso acesso) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int excluir(EAcesso acesso) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int incluir(EAcesso acesso) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<EAcesso> listar(EContato usuario) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EAcesso> listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
