package vista1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JSeparator;

public class Boleta extends JFrame {

	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtdireccion;
	private JTextField txtapellido;
	private JTextField textField;
	private JTextField txtprecio;
	private JTextField txtcantidad;
	private JTextField txtpagar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Boleta frame = new Boleta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Boleta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 569);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOLETA DE VENTA");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(182, 25, 143, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Datos del cliente");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(59, 51, 109, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setForeground(new Color(255, 255, 255));
		lblnombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblnombre.setBounds(59, 84, 56, 13);
		contentPane.add(lblnombre);
		
		JLabel lbldireccion = new JLabel("Direccion");
		lbldireccion.setForeground(Color.WHITE);
		lbldireccion.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbldireccion.setBounds(59, 121, 64, 13);
		contentPane.add(lbldireccion);
		
		JLabel lblapellido = new JLabel("Apellido");
		lblapellido.setForeground(Color.WHITE);
		lblapellido.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblapellido.setBounds(311, 84, 56, 13);
		contentPane.add(lblapellido);
		
		JLabel lbltelefono = new JLabel("Telefono");
		lbltelefono.setForeground(Color.WHITE);
		lbltelefono.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbltelefono.setBounds(311, 121, 64, 13);
		contentPane.add(lbltelefono);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(136, 82, 89, 19);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setColumns(10);
		txtdireccion.setBounds(136, 119, 148, 19);
		contentPane.add(txtdireccion);
		
		txtapellido = new JTextField();
		txtapellido.setColumns(10);
		txtapellido.setBounds(374, 82, 89, 19);
		contentPane.add(txtapellido);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(374, 119, 89, 19);
		contentPane.add(textField);
		
		JLabel lbl = new JLabel("Datos del producto");
		lbl.setForeground(Color.WHITE);
		lbl.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl.setBounds(59, 170, 143, 13);
		contentPane.add(lbl);
		
		JLabel lblproducto = new JLabel("Producto");
		lblproducto.setForeground(Color.WHITE);
		lblproducto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblproducto.setBounds(59, 205, 56, 13);
		contentPane.add(lblproducto);
		
		JLabel lblprecio = new JLabel("Precio");
		lblprecio.setForeground(Color.WHITE);
		lblprecio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblprecio.setBounds(59, 240, 56, 13);
		contentPane.add(lblprecio);
		
		JLabel lblcantidad = new JLabel("Cantidad");
		lblcantidad.setForeground(Color.WHITE);
		lblcantidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblcantidad.setBounds(59, 277, 56, 13);
		contentPane.add(lblcantidad);
		
		txtprecio = new JTextField();
		txtprecio.setBounds(182, 238, 96, 19);
		contentPane.add(txtprecio);
		txtprecio.setColumns(10);
		
		txtcantidad = new JTextField();
		txtcantidad.setColumns(10);
		txtcantidad.setBounds(182, 275, 96, 19);
		contentPane.add(txtcantidad);
		
		JLabel lblNewLabel_2 = new JLabel("Total a pagar");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(59, 319, 96, 13);
		contentPane.add(lblNewLabel_2);
		
		txtpagar = new JTextField();
		txtpagar.setColumns(10);
		txtpagar.setBounds(182, 317, 96, 19);
		contentPane.add(txtpagar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(110, 383, 303, 139);
		contentPane.add(textArea);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 149, 483, 13);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 48, 483, 13);
		contentPane.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 344, 483, 13);
		contentPane.add(separator_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(182, 202, 172, 21);
		contentPane.add(comboBox);
		
		JButton btncalcular = new JButton("Calcular");
		btncalcular.setFont(new Font("Tahoma", Font.BOLD, 12));
		btncalcular.setBounds(311, 274, 85, 21);
		contentPane.add(btncalcular);
		
		JButton btnimprimir = new JButton("Imprimir Boleta");
		btnimprimir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnimprimir.setBounds(192, 352, 133, 21);
		contentPane.add(btnimprimir);
	}
}
