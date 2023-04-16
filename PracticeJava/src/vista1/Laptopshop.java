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
import javax.swing.DefaultComboBoxModel;

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
		setTitle("Laptopshop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 346);
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
		
		JComboBox cmbmodelo = new JComboBox();
		cmbmodelo.setModel(new DefaultComboBoxModel(new String[] {"GAMER ASUS TUF F15", "ASUS TUF GAMING A 15", "ASUS CI3 ", "ASUS X1502ZA-BQ704W 15.6", " LENOVO V14 INTEL", "HP 15-EF2501LA 15.6", "HP 14' HD 240G7 CELERON ", "ADVANCE PS7085,15.6' FHD", "HP 15.6' 15-DY5010LA ", "HP 15-DY2505LA 15.6", "HP 14-cf2513 ", "THINK PAD  P1 5ta Generacion 16"}));
		cmbmodelo.setBounds(122, 38, 190, 21);
		contentPane.add(cmbmodelo);
		
		JButton btnagregar = new JButton("Agregar");
		btnagregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item;  //here
				item = cmbmodelo.getSelectedItem().toString();
				/*String[] txtProcesador;
				txtProcesador = new String[0];
				txtProcesador[0] = "Intel Core i7 ";
				txtProcesador[1] = "Ryzen 7";
				txtProcesador[2] = "Intel Core I5";
				txtProcesador[3] =  "Ryzen 5";
				txtProcesador[4] =  "CELERON N4020";
				txtProcesador[5] =   "Core I3";
				txtProcesador[6] = "Core I9 serie H";
				//txtProcesador[] = {"Intel Core i7 12va","Ryzen 7","Intel Core I5","Ryzen 5","CELERON N4020","Core I3","Core I9 serie H"};
				*/
				//String[]  txtRam = {"4GB","8GB","12GB","16GB",};
				//String[] txtUnidad = {"500GB SSD","1TB HDD","500GB HDD","256GB SSD","500GB SSD" };	
				//String[] txtTarjeta= {"NVIDIA GeForce RTX 3050","Intel Iris Xe Graphics","Geforce MX350 2GB GDDR5","RTX3050"," NVIDIA GeForce GTX 1650","AMD Radeon", "Integrada","Intel UHD Graphics"};
				
				switch(item) {
				case "GAMER ASUS TUF F15" :{
					txtPrecio.setText("7500");
					txtProcesador.setText("Intel Core I5");
					txtRam.setText("8GB");
					txtUnidad.setText("512GB SSD");
					txtTarjeta.setText("NVIDIA GeForce RTX 3050");
					break;
				}
				case "ASUS TUF GAMING A 15" : {
					txtPrecio.setText("3000");
					txtProcesador.setText("Ryzen 7");
					txtRam.setText("16GB");
					txtUnidad.setText("500GB SSD");
					txtTarjeta.setText(" RTX3050");
					break;
				}
				case "ASUS CI3": {
					txtPrecio.setText("1399");
					txtProcesador.setText("Core I3");
					txtRam.setText("8GB");
					txtUnidad.setText("256GB SSD");
					txtTarjeta.setText("Intel UHD Graphics");
					break;
				}
				case "ASUS X1502ZA-BQ704W 15.6":{
					txtPrecio.setText("3299");
					txtProcesador.setText("Intel Core I7 12va");
					txtRam.setText("12GB");
					txtUnidad.setText("500GB SSD");
					txtTarjeta.setText("Intel Iris Xe Graphics");
					break;
				}
				case "LENOVO V14 INTEL":{
					txtPrecio.setText("2489");
					txtProcesador.setText("Intel Core I7");
					txtRam.setText("20GB");
					txtUnidad.setText("1TB HDD");
					txtTarjeta.setText("Geforce MX350 2GB GDDR5");
					break;
				}
				case "HP 15-EF2501LA 15.6":{
					txtPrecio.setText("2500");
					txtProcesador.setText(" Ryzen 5");
					txtRam.setText("12GB");
					txtUnidad.setText("500GB SSD");
					txtTarjeta.setText("AMD RADEON");
					break;
				}
				case "HP 14' HD 240G7 ":{
					txtPrecio.setText("893");
					txtProcesador.setText("Celeron");
					txtRam.setText("4GB");
					txtUnidad.setText("1TB");
					txtTarjeta.setText("Intel UHD Graphics");
					break;
				}
				case "ADVANCE PS7085,15.6' FHD":{
					txtPrecio.setText("1250");
					txtProcesador.setText("Intel Core I7 ");
					txtRam.setText("8GB");
					txtUnidad.setText("256 GBSSD");
					txtTarjeta.setText("Intel UHD Graphics");
					break;
				}
				case "HP 15.6' 15-DY5010LA ":{
					txtPrecio.setText("3500");
					txtProcesador.setText("Intel Core I7 ");
					txtRam.setText("12GB");
					txtUnidad.setText("500GB SSD");
					txtTarjeta.setText("Intel UHD Graphics");
					break;
				}
				case "HP 15-DY2505LA 15.6 ":{
					txtPrecio.setText("2900");
					txtProcesador.setText("Intel Core I5");
					txtRam.setText("12GB");
					txtUnidad.setText("500GB SSD");
					txtTarjeta.setText("Intel UH Graphics");
					break;
				}
				case"HP 14-cf2513 ":{
					txtPrecio.setText("2149");
					txtProcesador.setText("Intel Core I3 10ma");
					txtRam.setText("4GB");
					txtUnidad.setText("500GB HDD");
					txtTarjeta.setText("Intel UH Graphics");
					break;
				}
				case"THINK PAD  P1 5ta Generacion 16":{
					txtPrecio.setText("8500");
					txtProcesador.setText("Serie H");
					txtRam.setText("16 GB DDR5");
					txtUnidad.setText("1 TB SSD M.2 ");
					txtTarjeta.setText("NVIDIA® RTX™ A1000 4 GB GDDR6");
					break;
				}
				}
			
				
			}
		});
		btnagregar.setBounds(122, 229, 85, 21);
		contentPane.add(btnagregar);
		
		JButton btnlimpiar = new JButton("Limpiar");
		btnlimpiar.setBounds(227, 232, 85, 21);
		contentPane.add(btnlimpiar);
	}
}
