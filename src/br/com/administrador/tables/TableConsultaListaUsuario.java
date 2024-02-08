/**
 * 
 */
package br.com.administrador.tables;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import br.com.administrador.entidade.EContato;

/**
 * @author Heider
 *
 */
public class TableConsultaListaUsuario extends AbstractTableModel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -180553985039108206L;

	private String[] colunas = {"Nome","Status","Apelido"};
	
	private ArrayList<EContato> linhas;
	
	public TableConsultaListaUsuario() {
		linhas = new ArrayList<EContato>();
		
		EContato usuario1 = new EContato();
		usuario1.setId(1);
		usuario1.setNome("Heider Taguatinga Farias");
		usuario1.setApelido("heider23");
		usuario1.setStatus('A');
		usuario1.setSenha("123456");
		try {
			linhas.add(usuario1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return linhas.size();
	}
	
	@Override
	public Class<?> getColumnClass(int coluna) {
		// TODO Auto-generated method stub
		switch (coluna) {
		case 0: return String.class;
		case 1: return String.class;
		case 2: return String.class;
		default:
				throw new IndexOutOfBoundsException("Coluna esta fora da faixa");
		}
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		// TODO Auto-generated method stub
		EContato usuario = linhas.get(linha);
		switch (coluna) {
			case 0: return usuario.getNome();
			case 1: return usuario.getStatus();
			case 2: return usuario.getApelido();
			default:
					throw new IndexOutOfBoundsException("Coluna esta fora da faixa");
		}		
	}
	
	public String getColumnName(int col) {
        return colunas[col];
    }
	
	public boolean isCellEditable(int linha, int coluna) {
		return false;
	}	

}
