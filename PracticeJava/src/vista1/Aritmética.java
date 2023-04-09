package vista1;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aritmética extends JPanel {
	private JTextField txtnum1;
	private JTextField txtnum2;
	private int numero1;
	private int numero2;
	private int suma,resta,producto,division;

	/**
	 * Create the panel.
	 */
	public Aritmética() {
		setBackground(new Color(242, 225, 13));
		setLayout(null);
		
		JLabel lblNumero1 = new JLabel("Numero 1");
		lblNumero1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumero1.setBounds(59, 43, 91, 23);
		add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Numero 2");
		lblNumero2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumero2.setBounds(59, 89, 91, 23);
		add(lblNumero2);
		
		txtnum1 = new JTextField();
		txtnum1.setBounds(160, 47, 125, 19);
		add(txtnum1);
		txtnum1.setColumns(10);
		
		txtnum2 = new JTextField();
		txtnum2.setColumns(10);
		txtnum2.setBounds(160, 93, 125, 19);
		add(txtnum2);
		JTextArea txtresultado = new JTextArea();
		txtresultado.setBounds(105, 136, 180, 176);
		add(txtresultado);
		JButton btncalcular = new JButton("Calcular");
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ingreso y capturamos datos
				numero1= Integer.parseInt(txtnum1.getText());
				numero2= Integer.parseInt(txtnum2.getText());
               //proceso
				suma = numero1 + numero2 ;
				resta = numero1 - numero2;
				producto = numero1 * numero2;
				division = numero1 / numero2;
				//salida
				txtresultado.setText("Resultado\n");
				txtresultado.append("***********************\n");
				txtresultado.append("Numero 1: " +numero1+"\n");
				txtresultado.append("Numero 2: " +numero2+"\n");
				txtresultado.append("----------------------\n");
				txtresultado.append("SUMA \n");
				txtresultado.append(String.valueOf(suma) +"\n");
				txtresultado.append("RESTA \n");
				txtresultado.append(String.valueOf(resta) +"\n");
				txtresultado.append("PRODUCTO \n");
				txtresultado.append(String.valueOf(producto) +"\n");
				txtresultado.append("DIVISION \n");
				txtresultado.append(String.valueOf(division) +"\n");

			}
		});
		btncalcular.setBounds(329, 112, 85, 21);
		add(btncalcular);
		
		

	}
}
