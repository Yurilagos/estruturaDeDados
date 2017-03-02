package view;

import java.awt.Dimension;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * 
 * Di�logo Sobre.
 *
 */
public class AboutDialog extends JDialog{
	
	private JLabel jLabel ;

	/**
	 * Construtor.
	 * @param mainFrame
	 */
	
	public AboutDialog(MainFrame mainFrame) {
		build(mainFrame);
	}

	/**
	 * Constr�i a janela.
	 * @param mainFrame Janela Principal
	 */
	private void build(MainFrame mainFrame) {
		addComponents();
		setSize(300, 200); // Define tamanho da janela.
		setIconImage();
		setMinimumSize(new Dimension(300, 200));
		setLocationRelativeTo(mainFrame); // Define a posi��o da janela.
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);

	}
	
	/**
	 * Adiciona componentes ao Di�logo.
	 */
	
	private void addComponents() {
		String s = "Programa de Gest�o de Clientes - Vers�o 1.0";
		JLabel label = new JLabel(s);
		add(label);
		
	}

	private void setIconImage() {
		URL iconURL = getClass().getResource("/images/logo.png");
		ImageIcon icon = new ImageIcon(iconURL);
		setIconImage(icon.getImage());
	}

}
