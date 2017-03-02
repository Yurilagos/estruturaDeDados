package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * Janela principal do sistema.
 */

public class MainFrame extends JFrame {
	/**
	 * Construtor.
	 */
	public MainFrame() {
		build();
	}

	/**
	 * Constrói a janela.
	 */
	private void build() {
		buildMenu();
		setSize(400, 300); // Define tamanho da janela.
		setIconImage();
		setMinimumSize(new Dimension(400, 300));
		setLocationRelativeTo(null); // Define a posição da janela.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define o enceramento
														// da aplicação.
		setVisible(true);

	}

	/**
	 * Constrói o Menu.
	 */
	private void buildMenu() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu helpMenu = new JMenu("Ajuda");
		menuBar.add(helpMenu);
		JMenuItem aboutItem = new JMenuItem("Sobre");
		helpMenu.add(aboutItem);

		aboutItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Código para aparecer a frame do about.
				new AboutDialog(MainFrame.this);
			}

		});

		JMenuItem exitItem = new JMenuItem("Sair");
		helpMenu.add(exitItem);

		exitItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Código para sair do programa.
				System.exit(0);
			}
		});

	}

	/**
	 * Define a Imagem da logo.
	 */

	private void setIconImage() {
		URL iconURL = getClass().getResource("/images/logo.png");
		ImageIcon icon = new ImageIcon(iconURL);
		setIconImage(icon.getImage());
	}
}
