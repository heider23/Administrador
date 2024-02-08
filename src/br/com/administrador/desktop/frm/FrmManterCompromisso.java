package br.com.administrador.desktop.frm;

import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrmManterCompromisso extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel jContentPaneManterAplicacao = null;
	private JLabel jLabelNome = null;
	private JLabel jLabelRecurso = null;
	private JLabel jLabelDescricao = null;
	private JTextField jTextFieldNome = null;
	private JTextField jTextFieldRecurso = null;
	private JTextField jTextFieldDescricao = null;
	private JButton jButtonConsultar = null;
	/**
	 * This is the xxx default constructor
	 */
	public FrmManterCompromisso() {
		super("Manter Aplicação",false, true, false, false);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(new Dimension(400, 300));
		this.setLocation(200, 100);
		this.setContentPane(getJContentPaneManterAplicacao());
		this.setResizable(false);
	}

	/**
	 * This method initializes jContentPaneManterAplicacao	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPaneManterAplicacao() {
		if (jContentPaneManterAplicacao == null) {
			jLabelDescricao = new JLabel();
			jLabelDescricao.setBounds(new Rectangle(4, 122, 67, 16));
			jLabelDescricao.setText("DESCRIÇÃO");
			jLabelRecurso = new JLabel();
			jLabelRecurso.setBounds(new Rectangle(4, 71, 56, 16));
			jLabelRecurso.setText("RECURSO");
			jLabelNome = new JLabel();
			jLabelNome.setBounds(new Rectangle(4, 20, 40, 16));
			jLabelNome.setText("NOME");
			jContentPaneManterAplicacao = new JPanel();
			jContentPaneManterAplicacao.setLayout(null);
			jContentPaneManterAplicacao.add(jLabelNome, null);
			jContentPaneManterAplicacao.add(jLabelRecurso, null);
			jContentPaneManterAplicacao.add(jLabelDescricao, null);
			jContentPaneManterAplicacao.add(getJTextFieldNome(), null);
			jContentPaneManterAplicacao.add(getJTextFieldRecurso(), null);
			jContentPaneManterAplicacao.add(getJTextFieldDescricao(), null);
			jContentPaneManterAplicacao.add(getJButtonConsultar(), null);
		}
		return jContentPaneManterAplicacao;
	}

	/**
	 * This method initializes jTextFieldNome	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNome() {
		if (jTextFieldNome == null) {
			jTextFieldNome = new JTextField();
			jTextFieldNome.setBounds(new Rectangle(78, 18, 297, 20));
		}
		return jTextFieldNome;
	}

	/**
	 * This method initializes jTextFieldRecurso	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldRecurso() {
		if (jTextFieldRecurso == null) {
			jTextFieldRecurso = new JTextField();
			jTextFieldRecurso.setBounds(new Rectangle(78, 69, 297, 20));
		}
		return jTextFieldRecurso;
	}

	/**
	 * This method initializes jTextFieldDescricao	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldDescricao() {
		if (jTextFieldDescricao == null) {
			jTextFieldDescricao = new JTextField();
			jTextFieldDescricao.setBounds(new Rectangle(78, 120, 297, 20));
		}
		return jTextFieldDescricao;
	}

	/**
	 * This method initializes jButtonConsultar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonConsultar() {
		if (jButtonConsultar == null) {
			jButtonConsultar = new JButton();
			jButtonConsultar.setBounds(new Rectangle(17, 202, 89, 26));
			jButtonConsultar.setText("Consultar");
		}
		return jButtonConsultar;
	}

}
