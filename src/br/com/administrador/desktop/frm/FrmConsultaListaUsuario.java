package br.com.administrador.desktop.frm;

import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import br.com.administrador.tables.TableConsultaListaUsuario;

public class FrmConsultaListaUsuario extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8898692036937759683L;
	
	private JPanel jContentPane = null;
	private JDesktopPane jDesktopPane;
	private JLabel jLabelPesquisarNome = null;
	private JTextField jTextFieldPesquisarNome = null;
	private JScrollPane jScrollPaneListaNomes = null;
	private JTable jTablePesquisarNomes = null;

	/**
	 * This is the xxx default constructor
	 */
	public FrmConsultaListaUsuario(JDesktopPane jDesktopPane) {
		super("Consulta Lista de Usuários",false, true, false, false);
		this.jDesktopPane = jDesktopPane;
		this.jDesktopPane.add(this);
		this.jDesktopPane.setSelectedFrame(this);
		this.jDesktopPane.getDesktopManager().activateFrame(this);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setContentPane(getJContentPane());
		this.setSize(new Dimension(600, 300));
		this.setTitle("Pesquisar");
		this.setLocation(100, 200);
		this.setResizable(false);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelPesquisarNome = new JLabel();
			jLabelPesquisarNome.setText("Pesquisar nome:");
			jLabelPesquisarNome.setBounds(new Rectangle(14, 16, 96, 16));
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabelPesquisarNome, null);
			jContentPane.add(getJTextFieldPesquisarNome(), null);
			jContentPane.add(getJScrollPaneListaNomes(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTextFieldPesquisarNome	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPesquisarNome() {
		if (jTextFieldPesquisarNome == null) {
			jTextFieldPesquisarNome = new JTextField();
			jTextFieldPesquisarNome.setBounds(new Rectangle(119, 14, 431, 20));
		}
		return jTextFieldPesquisarNome;
	}

	/**
	 * This method initializes jScrollPaneListaNomes	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneListaNomes() {
		if (jScrollPaneListaNomes == null) {
			jScrollPaneListaNomes = new JScrollPane();
			jScrollPaneListaNomes.setBounds(new Rectangle(15, 50, 560, 210));
			jScrollPaneListaNomes.setViewportView(getJTablePesquisarNomes());
		}
		return jScrollPaneListaNomes;
	}

	/**
	 * This method initializes jTablePesquisarNomes	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTablePesquisarNomes() {
		if (jTablePesquisarNomes == null) {
			jTablePesquisarNomes = new JTable(new TableConsultaListaUsuario());
			
		}
	
		return jTablePesquisarNomes;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
