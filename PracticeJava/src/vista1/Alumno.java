package vista1;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.TextArea;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;

public class Alumno extends JPanel {
	private JTextField textnombre;
	private JTextField txtapellido;
	private JTextField txtnota1;
	private JTextField txtnota2;

	/**
	 * Create the panel.
	 */
	public Alumno() {
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(240, 240, 240));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Código");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(107, 21, 66, 24);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(60, 77, 66, 13);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(60, 113, 66, 13);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nota1");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(60, 147, 66, 13);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Nota2");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(60, 180, 66, 13);
		add(lblNewLabel_1_3);
		
		textnombre = new JTextField();
		textnombre.setBounds(155, 75, 96, 19);
		add(textnombre);
		textnombre.setColumns(10);
		
		txtapellido = new JTextField();
		txtapellido.setColumns(10);
		txtapellido.setBounds(155, 111, 96, 19);
		add(txtapellido);
		
		txtnota1 = new JTextField();
		txtnota1.setColumns(10);
		txtnota1.setBounds(155, 145, 96, 19);
		add(txtnota1);
		
		txtnota2 = new JTextField();
		txtnota2.setColumns(10);
		txtnota2.setBounds(155, 178, 96, 19);
		add(txtnota2);
		
		JRadioButton rdbtnM = new JRadioButton("Mañana");
		rdbtnM.setBounds(302, 74, 103, 21);
		add(rdbtnM);
		
		JRadioButton rdbtnT = new JRadioButton("Tarde");
		rdbtnT.setBounds(302, 110, 103, 21);
		add(rdbtnT);
		
		JCheckBox chckbecado = new JCheckBox("Becado");
		chckbecado.setBounds(302, 144, 93, 21);
		add(chckbecado);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(72, 297, 352, 150);
		add(textArea);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(72, 55, 363, 2);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(72, 248, 363, 2);
		add(separator_1);
		
		JComboBox cmbcodigo = new JComboBox();
		cmbcodigo.setBounds(183, 25, 142, 21);
		add(cmbcodigo);
		
		JButton btnagregar = new JButton("Agregar");
		btnagregar.setBounds(113, 260, 85, 21);
		add(btnagregar);
		
		JButton btnnuevo = new JButton("Nuevo");
		btnnuevo.setBounds(240, 260, 85, 21);
		add(btnnuevo);

	}
}
