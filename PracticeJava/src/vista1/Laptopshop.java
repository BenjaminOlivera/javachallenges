package vista1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Laptopshop extends JFrame {

	private JPanel contentPane;
	private JTextField txtProcesador;
	private JTextField txtRam;
	private JTextField txtUnidad;
	private JTextField txtTarjeta;
	private JTextField txtPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Laptopshop frame = new Laptopshop();
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
	public Laptopshop() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\eclipse-workspace\\Iconos\\piramide.png"));
		setTitle("Laptopshop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblModelo.setBounds(24, 36, 88, 21);
		contentPane.add(lblModelo);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 436, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Equipos");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Categoria");
		mnNewMenu.add(mnNewMenu_1);
		
		JMenuItem smnDesarrollo = new JMenuItem("Desarrollo Web");
		mnNewMenu_1.add(smnDesarrollo);
		
		JMenuItem smnDiseño = new JMenuItem("Diseño");
		mnNewMenu_1.add(smnDiseño);
		
		JMenuItem smnGamer = new JMenuItem("Gamer");
		mnNewMenu_1.add(smnGamer);
		
		JMenuItem smnEscolar = new JMenuItem("Escolar");
		mnNewMenu_1.add(smnEscolar);
		
		JLabel lblProcesador = new JLabel("Procesador");
		lblProcesador.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProcesador.setBounds(24, 67, 88, 21);
		contentPane.add(lblProcesador);
		
		JLabel lblRam = new JLabel("Ram");
		lblRam.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRam.setBounds(24, 98, 88, 21);
		contentPane.add(lblRam);
		
		JLabel lblUnidad = new JLabel("Unidad A.");
		lblUnidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUnidad.setBounds(24, 129, 88, 21);
		contentPane.add(lblUnidad);
		
		JLabel lblTarjeta = new JLabel("Tarjeta");
		lblTarjeta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTarjeta.setBounds(24, 163, 88, 21);
		contentPane.add(lblTarjeta);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrecio.setBounds(24, 200, 88, 21);
		contentPane.add(lblPrecio);
		
		txtProcesador = new JTextField();
		txtProcesador.setColumns(10);
		txtProcesador.setBounds(122, 70, 190, 19);
		contentPane.add(txtProcesador);
		
		txtRam = new JTextField();
		txtRam.setColumns(10);
		txtRam.setBounds(122, 101, 190, 19);
		contentPane.add(txtRam);
		
		txtUnidad = new JTextField();
		txtUnidad.setColumns(10);
		txtUnidad.setBounds(122, 132, 190, 19);
		contentPane.add(txtUnidad);
		
		txtTarjeta = new JTextField();
		txtTarjeta.setColumns(10);
		txtTarjeta.setBounds(122, 166, 190, 19);
		contentPane.add(txtTarjeta);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(122, 200, 190, 19);
		contentPane.add(txtPrecio);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgregar.setBounds(119, 232, 85, 21);
		contentPane.add(btnAgregar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(227, 232, 85, 21);
		contentPane.add(btnLimpiar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(122, 38, 190, 21);
		contentPane.add(comboBox);
	}
}
