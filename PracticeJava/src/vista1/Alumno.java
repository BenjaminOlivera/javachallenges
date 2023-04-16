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

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Alumno extends JPanel {
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txtnota1;
	private JTextField txtnota2;
	private JComboBox cmbcodigo;
	ButtonGroup grupo= new ButtonGroup();
	private String[] arr_codigo = {"Selecciona codigo","x001","x002","x003"};
	private String[] arr_nombre = {"--", "Rosa", "Mario","Ana"};
	private String[] arr_apellido = {"--","Torres", "Herrera","Perez"};
	private float[] arr_nota1 = {0,15,17,14};
	private float[] arr_nota2 = {0,16,11,13};


	/**
	 * Create the panel.
	 */
	public Alumno() {
		setForeground(new Color(0, 0, 0));
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
		
		txtnombre = new JTextField();
		txtnombre.setBounds(155, 75, 96, 19);
		add(txtnombre);
		txtnombre.setColumns(10);
		
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
		grupo.add(rdbtnM);
		grupo.add(rdbtnT);
		JCheckBox chckbecado = new JCheckBox("Becado");
		chckbecado.setBounds(302, 144, 93, 21);
		add(chckbecado);
		
		TextArea txtdatos = new TextArea();
		txtdatos.setBounds(72, 297, 352, 150);
		add(txtdatos);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(72, 55, 363, 2);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(72, 248, 363, 2);
		add(separator_1);
		
		JComboBox cmbcodigo = new JComboBox();
		cmbcodigo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(cmbcodigo.getSelectedItem()=="x001") {
					txtnombre.setText(arr_nombre[1]);
					txtapellido.setText(arr_apellido[1]);
					txtnota1.setText(String.valueOf(arr_nota1[1]));
					txtnota2.setText(String.valueOf(arr_nota2[1]));
				}else if(cmbcodigo.getSelectedItem()=="x002") {
					txtnombre.setText(arr_nombre[2]);
					txtapellido.setText(arr_apellido[2]);
					txtnota1.setText(String.valueOf(arr_nota1[2]));
					txtnota2.setText(String.valueOf(arr_nota2[2]));


				}else {
					txtnombre.setText(arr_nombre[3]);
					txtapellido.setText(arr_apellido[3]);
					txtnota1.setText(String.valueOf(arr_nota1[3]));
					txtnota2.setText(String.valueOf(arr_nota2[3]));
				}
			}
		});
		cmbcodigo.setBounds(183, 25, 142, 21);
		add(cmbcodigo);
		for (int x= 0; x< arr_codigo.length; x++)
			cmbcodigo.addItem(arr_codigo[x]);
		
		
		txtnombre.setText("");
		txtapellido.setText("");
		txtnota1.setText("");
		txtnota2.setText("");
		
		JButton btnagregar = new JButton("Agregar");
		btnagregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdatos.setText("");
				txtdatos.append("*****DATOS DEL ALUMNO*****\n");
				txtdatos.append("--------------------------\n");
				txtdatos.append("Codigo   : "+cmbcodigo.getSelectedItem().toString()+ "\n");
				txtdatos.append("Nombre   : " +txtnombre.getText()+"\n");
				txtdatos.append("Apellido : "+ txtapellido.getText()+"\n");
				txtdatos.append("Nota 1 : "+ txtnota1.getText()+"\n");
				txtdatos.append("Nota 2 : "+ txtnota2.getText()+"\n");
				//radio button
				if(rdbtnM.isSelected()) {
					txtdatos.append("Matricula   :500.00"+"\n");
				}else if(rdbtnT.isSelected()){
					txtdatos.append("Matrícula   :300.00"+"\n");
				}

				
			}
		});
		btnagregar.setBounds(113, 260, 85, 21);
		add(btnagregar);
		
		JButton btnnuevo = new JButton("Nuevo");
		btnnuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    cmbcodigo.setSelectedIndex(0);
			    txtdatos.setText("");
			    txtnombre.setText("");
			    txtapellido.setText("");
			    txtnota1.setText("");
			    txtnota2.setText("");
			    
			}
		});
		btnnuevo.setBounds(240, 260, 85, 21);
		add(btnnuevo);

	}
}
