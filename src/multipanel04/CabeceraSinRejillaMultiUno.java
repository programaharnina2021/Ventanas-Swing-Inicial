package multipanel04;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class CabeceraSinRejillaMultiUno extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public CabeceraSinRejillaMultiUno() {
		setLayout(new GridLayout(0, 3, 0, 0));
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Pedido");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);

	}

}
