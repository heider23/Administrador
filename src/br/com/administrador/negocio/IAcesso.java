package br.com.administrador.negocio;

import java.util.List;

import br.com.administrador.entidade.EAcesso;
import br.com.administrador.entidade.EContato;

public interface IAcesso {
	
	public EAcesso consultar(Integer usuario, String recurso) throws Exception;
	public int alterar(EAcesso oEAcesso) throws Exception;
	public int incluir(EAcesso oEAcesso) throws Exception;
	public int excluir(EAcesso oEAcesso) throws Exception;
	public List<EAcesso> listar(EContato oEUsuario) throws Exception;
	public List<EAcesso> listar() throws Exception;
	
}
