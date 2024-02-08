package br.com.administrador.desktop.frm;

import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.com.administrador.entidade.EContato;
import br.com.administrador.negocio.NUsuario;

public class FrmManterUsuario extends JInternalFrame {

	private static final long serialVersionUID = -1253581582615361395L;
	
	private JPanel jContentPaneManterUsuarios = null;
	private JLabel jLabelNomeUsuario = null;
	private JLabel jLabelStatusUsuario = null;
	private JLabel jLabelApelidoUsuario = null;
	private JLabel jLabelSenhaUsuario = null;
	private JTextField jTextFieldNomeUsuario = null;
	private JComboBox jComboBoxStatusUsuario = null;
	private JTextField jTextFieldApelidoUsuario = null;
	private JPasswordField jPasswordFieldSenhaUsuario = null;
	private JButton jButtonConsultarUsuario = null;
	private JButton jButtonAlterarUsuario = null;
	private JButton jButtonIncluirUsuario = null;
	private JButton jButtonLimparCampos = null;
	private String pathImagens = null;
	private JButton jButtonExcluirUsuario = null;
	private JButton jButtonConsultar = null;
	private JDesktopPane jDesktopPane;

	/**
	 * This is the xxx default constructor
	 */
	public FrmManterUsuario(JDesktopPane jDesktopPane) {
		super("Manter Usuários",false, true, false, false);
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
		this.setSize(new Dimension(424, 300));
		this.setLocation(200, 100);
		this.setContentPane(getJContentPaneManterUsuarios());
		this.setResizable(false);
	}

	/**
	 * This method initializes jContentPaneManterUsuarios	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPaneManterUsuarios() {
		if (jContentPaneManterUsuarios == null) {
			jLabelSenhaUsuario = new JLabel();
			jLabelSenhaUsuario.setBounds(new Rectangle(7, 143, 39, 16));
			jLabelSenhaUsuario.setText("SENHA");
			jLabelApelidoUsuario = new JLabel();
			jLabelApelidoUsuario.setBounds(new Rectangle(7, 104, 50, 16));
			jLabelApelidoUsuario.setText("APELIDO");
			jLabelStatusUsuario = new JLabel();
			jLabelStatusUsuario.setBounds(new Rectangle(7, 65, 46, 16));
			jLabelStatusUsuario.setText("STATUS");
			jLabelNomeUsuario = new JLabel();
			jLabelNomeUsuario.setBounds(new Rectangle(7, 26, 34, 16));
			jLabelNomeUsuario.setText("NOME");
			jContentPaneManterUsuarios = new JPanel();
			jContentPaneManterUsuarios.setLayout(null);
			jContentPaneManterUsuarios.add(jLabelNomeUsuario, null);
			jContentPaneManterUsuarios.add(jLabelStatusUsuario, null);
			jContentPaneManterUsuarios.add(jLabelApelidoUsuario, null);
			jContentPaneManterUsuarios.add(jLabelSenhaUsuario, null);
			jContentPaneManterUsuarios.add(getJTextFieldNomeUsuario(), null);
			jContentPaneManterUsuarios.add(getJComboBoxStatusUsuario(), null);
			jContentPaneManterUsuarios.add(getJTextFieldApelidoUsuario(), null);
			jContentPaneManterUsuarios.add(getJPasswordFieldSenhaUsuario(), null);
			jContentPaneManterUsuarios.add(getJButtonConsultarUsuario(), null);
			jContentPaneManterUsuarios.add(getJButtonAlterarUsuario(), null);
			jContentPaneManterUsuarios.add(getJButtonIncluirUsuario(), null);
			jContentPaneManterUsuarios.add(getJButtonLimparCampos(), null);
			jContentPaneManterUsuarios.add(getJButtonExcluirUsuario(), null);
			jContentPaneManterUsuarios.add(getJButtonConsultar(), null);
		}
		return jContentPaneManterUsuarios;
	}

	/**
	 * This method initializes jTextFieldNomeUsuario	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNomeUsuario() {
		if (jTextFieldNomeUsuario == null) {
			jTextFieldNomeUsuario = new JTextField();
			jTextFieldNomeUsuario.setBounds(new Rectangle(65, 24, 295, 20));
		}
		return jTextFieldNomeUsuario;
	}

	/**
	 * This method initializes jComboBoxStatusUsuario	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxStatusUsuario() {
		if (jComboBoxStatusUsuario == null) {
			jComboBoxStatusUsuario = new JComboBox();
			jComboBoxStatusUsuario.addItem("Selecione...");
			jComboBoxStatusUsuario.addItem("Bloqueado");
			jComboBoxStatusUsuario.addItem("Desbloqueado");
			jComboBoxStatusUsuario.setBounds(new Rectangle(65, 61, 119, 25));
		}
		return jComboBoxStatusUsuario;
	}

	/**
	 * This method initializes jTextFieldApelidoUsuario	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldApelidoUsuario() {
		if (jTextFieldApelidoUsuario == null) {
			jTextFieldApelidoUsuario = new JTextField();
			jTextFieldApelidoUsuario.setBounds(new Rectangle(65, 102, 119, 20));
		}
		return jTextFieldApelidoUsuario;
	}

	/**
	 * This method initializes jPasswordFieldSenhaUsuario	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getJPasswordFieldSenhaUsuario() {
		if (jPasswordFieldSenhaUsuario == null) {
			jPasswordFieldSenhaUsuario = new JPasswordField();
			jPasswordFieldSenhaUsuario.setBounds(new Rectangle(65, 141, 295, 20));
		}
		return jPasswordFieldSenhaUsuario;
	}

	/**
	 * This method initializes jButtonConsultarUsuario	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonConsultarUsuario() {
		if (jButtonConsultarUsuario == null) {
			jButtonConsultarUsuario = new JButton();
			jButtonConsultarUsuario.setBounds(new Rectangle(24, 206, 89, 26));
			jButtonConsultarUsuario.setText("Consultar");
			jButtonConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					EContato eUsuario = new EContato();
					if (jTextFieldNomeUsuario.getText().equals("")) {
						JOptionPane.showMessageDialog(jContentPaneManterUsuarios, "Informe o ID do usuário.");
						jTextFieldNomeUsuario.requestFocus();
					} else {
						eUsuario.setId(new Integer(jTextFieldNomeUsuario.getText()));
						NUsuario nUsuario = new NUsuario();
						try {
							eUsuario = nUsuario.consultar(eUsuario);
							if (eUsuario != null && eUsuario.getNome() != null) {
								jTextFieldNomeUsuario.setEditable(false);
								jTextFieldNomeUsuario.setText(eUsuario.getNome());
								int opcao;
								if (eUsuario.getStatus() == 'A') {
									opcao = 2;
								} else {
									opcao = 1;
								}
								jComboBoxStatusUsuario.setSelectedIndex(opcao);
								jTextFieldApelidoUsuario.setText(eUsuario.getApelido());
								jPasswordFieldSenhaUsuario.setText(eUsuario.getSenha());
							} else {
								JOptionPane.showMessageDialog(jContentPaneManterUsuarios, "Usuário não foi encontrado!");
								jTextFieldNomeUsuario.requestFocus();
							}
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
				}
			});
		}
		return jButtonConsultarUsuario;
	}

	/**
	 * This method initializes jButtonAlterarUsuario	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAlterarUsuario() {
		if (jButtonAlterarUsuario == null) {
			jButtonAlterarUsuario = new JButton();
			jButtonAlterarUsuario.setBounds(new Rectangle(119, 206, 89, 26));
			jButtonAlterarUsuario.setText("Alterar");
			jButtonAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					EContato eUsuario = new EContato();
					eUsuario.setId(Integer.valueOf(jTextFieldNomeUsuario.getText()));
					eUsuario.setNome(jTextFieldNomeUsuario.getText());
					if (jComboBoxStatusUsuario.getSelectedIndex() == 2) {
						eUsuario.setStatus('A');
					} else {
						eUsuario.setStatus('B');
					}
					eUsuario.setApelido(jTextFieldApelidoUsuario.getText());
					eUsuario.setSenha(jPasswordFieldSenhaUsuario.getPassword().toString());
					NUsuario nUsuario = new NUsuario();
					try {
						nUsuario.alterar(eUsuario);
						JOptionPane.showMessageDialog(jContentPaneManterUsuarios, "Alteração efetuada com sucesso!");
						jTextFieldNomeUsuario.requestFocus();
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(jContentPaneManterUsuarios, e1.getMessage());
						jTextFieldNomeUsuario.requestFocus();
					}
				}
			});
		}
		return jButtonAlterarUsuario;
	}

	/**
	 * This method initializes jButtonIncluirUsuario	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonIncluirUsuario() {
		if (jButtonIncluirUsuario == null) {
			jButtonIncluirUsuario = new JButton();
			jButtonIncluirUsuario.setBounds(new Rectangle(214, 206, 89, 26));
			jButtonIncluirUsuario.setText("Incluir");
			jButtonIncluirUsuario.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					EContato eUsuario = new EContato();
					eUsuario.setId(null);
					eUsuario.setNome(jTextFieldNomeUsuario.getText());
					if (jComboBoxStatusUsuario.getSelectedIndex() == 1) { 
						eUsuario.setStatus('B');
					} else {
						eUsuario.setStatus('A');
					}
					eUsuario.setApelido(jTextFieldApelidoUsuario.getText());
					eUsuario.setSenha(new String(jPasswordFieldSenhaUsuario.getPassword()));
					NUsuario nUsuario = new NUsuario();
					try {
						nUsuario.incluir(eUsuario);						
						JOptionPane.showMessageDialog(jContentPaneManterUsuarios, "Inclusão efetuada com sucesso!");
						jTextFieldNomeUsuario.requestFocus();
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(jContentPaneManterUsuarios, e1.getMessage());
						jTextFieldNomeUsuario.requestFocus();
					}

				}
			});
		}
		return jButtonIncluirUsuario;
	}

	/**
	 * This method initializes pathImagens	
	 * 	
	 * @return java.lang.String	
	 */
	private String getPathImagens() {
		if (pathImagens == null) {
			pathImagens = new String(
					"C:\\Documents and Settings\\heider-tf\\Heider\\fasam\\turmas\\javaweb\\projeto\\sistema\\financas\\src\\br\\com\\financas\\desktop\\imagens\\");
		}
		return pathImagens;
	}

	/**
	 * This method initializes jButtonLimparCampos	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonLimparCampos() {
		if (jButtonLimparCampos == null) {
			ImageIcon imgBtnLimpar = new ImageIcon(getPathImagens() + "paste_edit.gif");
			jButtonLimparCampos = new JButton("Limpar",imgBtnLimpar);
			jButtonLimparCampos.setHorizontalTextPosition(SwingConstants.RIGHT);
			jButtonLimparCampos.setBounds(new Rectangle(166, 238, 89, 26));
			jButtonLimparCampos.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jTextFieldNomeUsuario.setText("");
					jTextFieldNomeUsuario.setEditable(true);
					jTextFieldNomeUsuario.setText("");
					jTextFieldApelidoUsuario.setText("");
					jPasswordFieldSenhaUsuario.setText("");
					jComboBoxStatusUsuario.setSelectedIndex(0);
					jTextFieldNomeUsuario.requestFocus();
				}
			});
		}
		return jButtonLimparCampos;
	}

	/**
	 * This method initializes jButtonExcluirUsuario	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonExcluirUsuario() {
		if (jButtonExcluirUsuario == null) {
			jButtonExcluirUsuario = new JButton();
			jButtonExcluirUsuario.setBounds(new Rectangle(309, 206, 89, 26));
			jButtonExcluirUsuario.setText("Excluir");
			jButtonExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					EContato eUsuario = new EContato(Integer.valueOf(jTextFieldNomeUsuario.getText()));
					NUsuario nUsuario = new NUsuario();
					try {
						nUsuario.excluir(eUsuario);
						JOptionPane.showMessageDialog(jContentPaneManterUsuarios, "Exclusão efetuada com sucesso!");
						jButtonLimparCampos.doClick();
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(jContentPaneManterUsuarios, e1.getMessage());
						jTextFieldNomeUsuario.requestFocus();
					}
				}
			});
		}
		return jButtonExcluirUsuario;
	}

	/**
	 * This method initializes jButtonConsultar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonConsultar() {
		if (jButtonConsultar == null) {
			jButtonConsultar = new JButton();
			jButtonConsultar.setBounds(new Rectangle(368, 21, 35, 26));
			jButtonConsultar.setText("...");
			jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JInternalFrame jInternalFrameConsultaListaUsuario = new FrmConsultaListaUsuario(jDesktopPane);
					jInternalFrameConsultaListaUsuario.setVisible(true);
					jInternalFrameConsultaListaUsuario.requestFocus();
				}
			});
		}
		return jButtonConsultar;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
