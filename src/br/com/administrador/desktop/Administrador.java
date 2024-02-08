package br.com.administrador.desktop;


import java.awt.Dimension;
import java.awt.Event;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import br.com.administrador.desktop.frm.FrmManterCompromisso;
import br.com.administrador.desktop.frm.FrmManterUsuario;
import br.com.administrador.desktop.util.WindowUtilities;

public class Administrador {

	/*
	 * Configurações
	 */
	final String pathRoot = new java.io.File("").getAbsolutePath();
	final String pathImagemArquivo = pathRoot + "\\imagem\\arquivo\\"; 
	final String pathImagemEvento = pathRoot + "\\imagem\\evento\\";
	final String pathImagemIcone = pathRoot + "\\imagem\\icone\\";
	final String pathImagemImpressora = pathRoot + "\\imagem\\impressora\\";	
	/*
	 * Componentes
	 */	
	private JFrame jFrame;
	private JMenuBar jJMenuBar;
	private JMenu arquivoMenu;
	private JMenuItem sairArquivoMenuItem;
	private JMenu jManterMenuItem;
	private JMenuItem jManterUsuarioMenuItem;
	private JMenuItem jManterAplicacaoMenuItem;
	private JMenuItem jManterAcessoMenuItem;
	private JMenu editarMenu;
	private JMenuItem cortarEditarMenuItem;
	private JMenuItem copiarEditarMenuItem;
	private JMenuItem passarEditarMenuItem;
	private JMenu ajudaMenu;
	private JMenuItem sobreAjudaMenuItem;
	private JDesktopPane jDesktopPane = null;
	private JToolBar jToolBar = null;
	private JButton jButtonSair = null;

	/**
	 * This method initializes jDesktopPane	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JDesktopPane getJDesktopPane() {
		if (jDesktopPane == null) {
			jDesktopPane = new JDesktopPane();
			jDesktopPane.add(getJToolBar(), null);
		}
		return jDesktopPane;
	}

	/**
	 * This method initializes jToolBar	
	 * 	
	 * @return javax.swing.JToolBar	
	 */
	private JToolBar getJToolBar() {
		if (jToolBar == null) {
			jToolBar = new JToolBar();
			jToolBar.setLayout(null);
			jToolBar.setBounds(new Rectangle(0, 0, 792, 32));
			Point loc = new Point();
			loc.setLocation(SwingConstants.TOP,SwingConstants.LEFT);
			jToolBar.setLocation(loc);
			jToolBar.setRollover(true);
			jToolBar.setFloatable(false);
			jToolBar.add(getJButtonSair());
		}
		return jToolBar;
	}

	private JFrame getJFrame() {
		if (jFrame == null) {
			jFrame = new JFrame();
			Image img = Toolkit.getDefaultToolkit().getImage(pathImagemIcone + "\\user.gif");
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jFrame.setJMenuBar(getJJMenuBar());
			jFrame.setSize(new Dimension(800, 600));
			jFrame.setTitle("Administrador");
			jFrame.setContentPane(getJDesktopPane());
			jFrame.setResizable(false);
			jFrame.setIconImage(img);
		}
		return jFrame;
	}

	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getArquivoMenu());
			jJMenuBar.add(getEditarMenu());
			jJMenuBar.add(getAjudaMenu());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jButtonSair	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonSair() {
		if (jButtonSair == null) {
			ImageIcon imgBtnSair = new ImageIcon(pathImagemEvento + "\\close.gif");
			jButtonSair = new JButton("Sair",imgBtnSair);
			jButtonSair.setSize(60, 32);
			jButtonSair.setToolTipText("Sair");
			jButtonSair.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.exit(0);
				}
			});
		}
		return jButtonSair;
	}

	private JMenu getArquivoMenu() {
		if (arquivoMenu == null) {
			arquivoMenu = new JMenu();
			arquivoMenu.setText("Arquivo");
			arquivoMenu.add(getJManterMenuItem());
			arquivoMenu.add(getSairArquivoMenuItem());
		}
		return arquivoMenu;
	}

	private JMenu getJManterMenuItem() {
		if (jManterMenuItem == null) {
			jManterMenuItem = new JMenu("Manter");
			jManterMenuItem.add(getJManterUsuarioMenuItem());
			jManterMenuItem.add(getJManterAplicacaoMenuItem());
			jManterMenuItem.add(getJManterAcessoMenuItem());
		}
		return jManterMenuItem;
	}

	private JMenuItem getJManterUsuarioMenuItem() {
		if (jManterUsuarioMenuItem == null) {
			jManterUsuarioMenuItem = new JMenuItem();
			jManterUsuarioMenuItem.setText("Usuarios");			
			jManterUsuarioMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					/*
					 * Abre o formulário FrmManterUsuario
					 */
					JInternalFrame jInternalFrameManterUsuarios = new FrmManterUsuario(jDesktopPane);
					jInternalFrameManterUsuarios.setVisible(true);
					jInternalFrameManterUsuarios.requestFocus();
				}
			});
		}
		return jManterUsuarioMenuItem;
	}
	
	private JMenuItem getJManterAplicacaoMenuItem() {
		if (jManterAplicacaoMenuItem == null) {
			jManterAplicacaoMenuItem = new JMenuItem();
			jManterAplicacaoMenuItem.setText("Aplicações");
			jManterAplicacaoMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					/*
					 * Abre o formulário FrmManterCompromisso
					 */
					JInternalFrame jInternalFrameManterAplicacao = new FrmManterCompromisso();
					jInternalFrameManterAplicacao.setVisible(true);
					jDesktopPane.add(jInternalFrameManterAplicacao);
					jInternalFrameManterAplicacao.requestFocus();
					jDesktopPane.setSelectedFrame(jInternalFrameManterAplicacao);
					jDesktopPane.getDesktopManager().activateFrame(jInternalFrameManterAplicacao);
					
				}
			});
			
		}
		return jManterAplicacaoMenuItem;
	}
	
	private JMenuItem getJManterAcessoMenuItem() {
		if (jManterAcessoMenuItem == null) {
			jManterAcessoMenuItem = new JMenuItem();
			jManterAcessoMenuItem.setText("Acessos");
		}
		return jManterAcessoMenuItem;
	}	
	
	private JMenuItem getSairArquivoMenuItem() {
		if (sairArquivoMenuItem == null) {
			sairArquivoMenuItem = new JMenuItem();
			sairArquivoMenuItem.setText("Sair");
			sairArquivoMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
		}
		return sairArquivoMenuItem;
	}

	private JMenu getEditarMenu() {
		if (editarMenu == null) {
			editarMenu = new JMenu();
			editarMenu.setText("Editar");
			editarMenu.add(getCortarEditarMenuItem());
			editarMenu.add(getCopiarEditarMenuItem());
			editarMenu.add(getPassarEditarMenuItem());
		}
		return editarMenu;
	}

	private JMenuItem getCortarEditarMenuItem() {
		if (cortarEditarMenuItem == null) {
			cortarEditarMenuItem = new JMenuItem();
			cortarEditarMenuItem.setText("Cortar");
			cortarEditarMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,
					Event.CTRL_MASK, true));
		}
		return cortarEditarMenuItem;
	}

	private JMenuItem getCopiarEditarMenuItem() {
		if (copiarEditarMenuItem == null) {
			copiarEditarMenuItem = new JMenuItem();
			copiarEditarMenuItem.setText("Copiar");
			copiarEditarMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,
					Event.CTRL_MASK, true));
		}
		return copiarEditarMenuItem;
	}

	private JMenuItem getPassarEditarMenuItem() {
		if (passarEditarMenuItem == null) {
			passarEditarMenuItem = new JMenuItem();
			passarEditarMenuItem.setText("Passar");
			passarEditarMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,
					Event.CTRL_MASK, true));
		}
		return passarEditarMenuItem;
	}

	private JMenu getAjudaMenu() {
		if (ajudaMenu == null) {
			ajudaMenu = new JMenu();
			ajudaMenu.setText("Ajuda");
			ajudaMenu.add(getSobreAjudaMenuItem());
		}
		return ajudaMenu;
	}

	private JMenuItem getSobreAjudaMenuItem() {
		if (sobreAjudaMenuItem == null) {
			sobreAjudaMenuItem = new JMenuItem();
			sobreAjudaMenuItem.setText("Sobre");
			sobreAjudaMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(jFrame, "Versão 1.5","Atenção",JOptionPane.PLAIN_MESSAGE);
				}
			});
		}
		return sobreAjudaMenuItem;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WindowUtilities.setNativeLookAndFeel();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Administrador application = new Administrador();
				application.getJFrame().setVisible(true);
			}
		});
	}

}
