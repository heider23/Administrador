package br.com.administrador.negocio;

import java.util.List;

import br.com.administrador.entidade.EContato;

public interface IUsuario {

	public EContato consultar(String usuario) throws Exception;
	public int alterar(EContato oEUsuario) throws Exception;
	public int incluir(EContato oEUsuario) throws Exception;
	public int excluir(EContato oEUsuario) throws Exception;
	public List<EContato> listar(EContato oEUsuario) throws Exception;
	public List<EContato> listar() throws Exception;
	
}
