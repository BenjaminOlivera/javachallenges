package vista1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtusuario;
	private JPasswordField txtcon;
	private String usuario;
	private String contrasena;
	private int error;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("INGRESO AL SISTEMA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(38, 28, 71, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblContrasea.setBounds(38, 88, 85, 13);
		contentPane.add(lblContrasea);
		
		txtusuario = new JTextField();
		txtusuario.setBounds(149, 25, 96, 19);
		contentPane.add(txtusuario);
		txtusuario.setColumns(10);
		
		txtcon = new JPasswordField();
		txtcon.setBounds(149, 86, 98, 19);
		contentPane.add(txtcon);
		
		JButton btnaceptar = new JButton("Aceptar");
		btnaceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//capturar datos enviados
				usuario = txtusuario.getText();
				contrasena = txtcon.getText();
				if(usuario.equals("Admin") && contrasena.equals("1234")){
					Login.this.dispose();
					JOptionPane.showMessageDialog(null, "Bienvenidos al sistema");
					Menuprincipal abrirMenu = new Menuprincipal();
					abrirMenu.setExtendedState(MAXIMIZED_BOTH);
					abrirMenu.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Usuario y Contraseña incorrecta");
					txtusuario.setText("");
					txtcon.setText("");
					txtusuario.requestFocus();
					error = error +1;
					if(error ==3) {
						JOptionPane.showMessageDialog(null, "Comuniquese con el servicio técnico");
						Login.this.dispose();
					}
					
					
				}
			}
		});
		btnaceptar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnaceptar.setBounds(96, 176, 85, 21);
		contentPane.add(btnaceptar);
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btncancelar.setBounds(225, 177, 85, 21);
		contentPane.add(btncancelar);
	}
}
