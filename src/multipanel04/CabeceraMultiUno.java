package multipanel04;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class CabeceraMultiUno extends JPanel {
	public JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public CabeceraMultiUno() {
		setLayout(new MigLayout("", "[][grow][][]", "[][]"));
		
		textField = new JTextField();
		add(textField, "cell 0 0 1 2,alignx left,growy");
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel, "cell 1 0 1 2,alignx center");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		add(lblNewLabel_1, "cell 2 0,alignx trailing");
		
		textField_1 = new JTextField();
		add(textField_1, "cell 3 0,growx");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		add(lblNewLabel_2, "cell 2 1,alignx trailing");
		
		textField_2 = new JTextField();
		add(textField_2, "cell 3 1,growx");
		textField_2.setColumns(10);

	}

}
