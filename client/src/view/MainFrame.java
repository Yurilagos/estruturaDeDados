package view;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

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
		setLayout(new GridBagLayout());
		buildComponents();
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
	 * Constrói componentes da janela.
	 */

	private void buildComponents() {
		buildSearchPanel();
		buildButtonPanel();

	}

	/**
	 * Constrói Painel de Pesquisa.
	 */
	private void buildSearchPanel() {
		JPanel panel = new JPanel(new GridBagLayout());

		String[] items = { "Nome", "CPF" };
		JComboBox<String> comboBox = new JComboBox<>(items);
		panel.add(comboBox, new GBC(0, 0));

		JTextField searchField = new JTextField(20);
		panel.add(searchField, new GBC(1, 0).horizontal());

		JScrollPane scrollPane = new JScrollPane();
		JTable table = new JTable();
		scrollPane.add(table);
		panel.add(scrollPane, new GBC(0, 1).gridwh(2, 1).both());

		add(panel, new GBC(0, 0).both());

	}

	/**
	 * Constrói Painel de Botões.
	 */
	private void buildButtonPanel() {
		JPanel panel = new JPanel(new GridBagLayout());
		JButton newBotton = new JButton("Novo");
		panel.add(newBotton, new GBC(0, 0));
		newBotton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new AddClientDialog(MainFrame.this);
			}
		});
		
		JButton editBotton = new JButton("Alterar");
		panel.add(editBotton, new GBC(0, 1));
		
		JButton removeBotton = new JButton("Excluir");
		panel.add(removeBotton, new GBC(0, 2));
		
		
		add(panel, new GBC(1, 0));

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
