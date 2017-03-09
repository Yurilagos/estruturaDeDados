package view;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddClientDialog extends JDialog {

	private JLabel name;

	/**
	 * Construtor
	 * 
	 * @param mainFrame
	 */
	public AddClientDialog(MainFrame mainFrame) {
		setLayout(new GridBagLayout());
		addClientComponents();
		pack();
		setResizable(false);
		setIconImage();
		setLocationRelativeTo(mainFrame); // Define a posição da janela.
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);

	}

	/**
	 * Constrói componentes do ClientDialog.
	 */

	private void addClientComponents() {
		JPanel panel = new JPanel(new GridBagLayout());

		JLabel name = new JLabel("Nome");
		panel.add(name, new GBC(0, 0).left().insets(10, 10, 0, 10));

		JLabel CPF = new JLabel("CPF");
		panel.add(CPF, new GBC(0, 1).left().insets(10, 10, 0, 10));
		
		JLabel birthday = new JLabel("Nascimento");
		panel.add(birthday, new GBC(0, 2).left().insets(10, 10, 0, 10));

		JTextField nameTextField = new JTextField(20);
		panel.add(nameTextField, new GBC(1, 0).right().insets(10, 10, 10, 10));

		JTextField CPFTextField = new JTextField(20);
		panel.add(CPFTextField, new GBC(1, 1).right().insets(10, 10, 10, 10));
		
		JTextField birthdayTextField = new JTextField(20);
		panel.add(birthdayTextField, new GBC(1, 2).right().insets(10, 10, 10, 10));
		
		JButton saveButton = new JButton("Salvar");
		panel.add(saveButton, new GBC(1, 3).right().insets(10, 10, 10, 10));

		add(panel);

	}

	private void setIconImage() {
		URL iconURL = getClass().getResource("/images/logo.png");
		ImageIcon icon = new ImageIcon(iconURL);
		setIconImage(icon.getImage());
	}

}
