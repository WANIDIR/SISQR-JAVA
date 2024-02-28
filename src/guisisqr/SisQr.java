package guisisqr;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;// IMPORTO EL PAQUETE TODO LO QUE NECESITO DE SWING PARA LOS GRAFICOS
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.ComponentOrientation;
import java.awt.Panel;
import java.awt.TextField;

public class SisQr extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentsisqr;
	private JPasswordField passwordField;
	private JTextField Datos_Usuario;
	private JTextField OlvidadoSucontra;
	private JTextField NoTienesCuenta;
	private JTextField txtRegstrese;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SisQr frame = new SisQr();
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
	public SisQr() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 515, 471);
		Toolkit mipantalla=Toolkit.getDefaultToolkit(); // USO METODO TOOLKTI �RA DETECTAR LA RESOLUCION DE PANTALLA PRINCIPAL
		Dimension tamanoPantalla=mipantalla.getScreenSize();// REVISO EN MI DISPOSITIVO QUE DIMENSION DE PANTALLA TENGO
		int altoPantalla=tamanoPantalla.height;//BUSCO VALOR DEL ALTO GRABADO EN tama�oPantalla Y GUARDO EN LA VBLE
		int anchoPantalla=tamanoPantalla.width;//BUSCO VALOR DEL ANCHO GRABADO EN tama�oPantalla Y GUARDO EN LA VBLE
		setSize(836, 683);// MARCO A MITAD DE LA DIMENSION REAL DEL DISPOSITIVO
		setLocation(altoPantalla/2, anchoPantalla/20);// UBICO MARCO AL CUARTO DE LA DIMENSION REAL DEL DISPOSITIVO
		setTitle("SISQR");//COLOCARLE UN NOMBRE AL MARCO
		Image miIcono=mipantalla.getImage("src/img/Logo_1.png");// VBLE CON EL LOGO DE SISQR GIF, JPEG O PNG
		setIconImage(miIcono);// CONFIGURO LOGO SISQR EN EL MARCO
		contentsisqr = new JPanel();
		contentsisqr.setForeground(new Color(0, 0, 0));
		contentsisqr.setBackground(new Color(253, 233, 213));
		contentsisqr.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentsisqr);
		contentsisqr.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(432, 432, 95, 20);
		contentsisqr.add(passwordField);
		
		JLabel Contrasena = new JLabel("CONTRASE\u00D1A");
		Contrasena.setBounds(345, 433, 79, 14);
		contentsisqr.add(Contrasena);
		
		JLabel Usuario = new JLabel("USUARIO");
		Usuario.setBounds(346, 395, 55, 14);
		contentsisqr.add(Usuario);
		
		Datos_Usuario = new JTextField();
		Datos_Usuario.setBounds(432, 391, 95, 20);
		contentsisqr.add(Datos_Usuario);
		Datos_Usuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(249, 203, 156));
		lblNewLabel_1.setIcon(new ImageIcon(SisQr.class.getResource("/img/Logo.png")));
		lblNewLabel_1.setBounds(250, 100, 338, 238);
		contentsisqr.add(lblNewLabel_1);
		
		JCheckBox Recordar_Usua = new JCheckBox("Recordar Ususario");
		Recordar_Usua.setBackground(new Color(253, 233, 213));
		Recordar_Usua.setBounds(381, 494, 161, 23);
		contentsisqr.add(Recordar_Usua);
		
		JLabel ICONOWASAP = new JLabel("");
		ICONOWASAP.setDisabledIcon(null);
		ICONOWASAP.setIconTextGap(0);
		ICONOWASAP.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		ICONOWASAP.setIcon(new ImageIcon(SisQr.class.getResource("/img/whatsapp64.png")));
		ICONOWASAP.setBounds(50, 520, 64, 64);
		contentsisqr.add(ICONOWASAP);
		
		JLabel Inicio_Sesion = new JLabel("INICIO DE SESI\u00D3N");
		Inicio_Sesion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Inicio_Sesion.setBounds(356, 329, 171, 20);
		contentsisqr.add(Inicio_Sesion);
		
		JButton Boton_ingresar = new JButton("INGRESAR");
		Boton_ingresar.setForeground(new Color(64, 0, 64));
		Boton_ingresar.setBackground(new Color(255, 255, 255));
		Boton_ingresar.setBounds(381, 560, 120, 23);
		contentsisqr.add(Boton_ingresar);
		
		OlvidadoSucontra = new JTextField();
		OlvidadoSucontra.setForeground(new Color(0, 128, 255));
		OlvidadoSucontra.setCaretColor(new Color(0, 128, 255));
		OlvidadoSucontra.setBorder(null);
		OlvidadoSucontra.setSelectionColor(new Color(255, 255, 255));
		OlvidadoSucontra.setBackground(new Color(253, 233, 213));
		OlvidadoSucontra.setHorizontalAlignment(SwingConstants.CENTER);
		OlvidadoSucontra.setText("\u00BFHa olvidado su contrase\u00F1a?");
		OlvidadoSucontra.setBounds(371, 463, 156, 20);
		contentsisqr.add(OlvidadoSucontra);
		OlvidadoSucontra.setColumns(10);
		
		Panel panel_superior = new Panel();
		panel_superior.setBackground(new Color(249, 203, 156));
		panel_superior.setBounds(0, 0, 820, 64);
		contentsisqr.add(panel_superior);
		panel_superior.setLayout(null);
		
		JLabel ICONOSISQR = new JLabel("");
		ICONOSISQR.setIcon(new ImageIcon(SisQr.class.getResource("/img/Logo1.png")));
		ICONOSISQR.setBounds(24, 0, 95, 64);
		panel_superior.add(ICONOSISQR);
		
		JLabel ICONOCASA = new JLabel("");
		ICONOCASA.setBounds(720, 0, 60, 64);
		panel_superior.add(ICONOCASA);
		ICONOCASA.setHorizontalTextPosition(SwingConstants.CENTER);
		ICONOCASA.setIcon(new ImageIcon(SisQr.class.getResource("/img/hogar64.png")));
		
		NoTienesCuenta = new JTextField();
		NoTienesCuenta.setText("\u00BFNo tienes una cuenta?");
		NoTienesCuenta.setSelectionColor(Color.WHITE);
		NoTienesCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		NoTienesCuenta.setColumns(10);
		NoTienesCuenta.setBorder(null);
		NoTienesCuenta.setBackground(new Color(253, 233, 213));
		NoTienesCuenta.setBounds(308, 594, 156, 20);
		contentsisqr.add(NoTienesCuenta);
		
		txtRegstrese = new JTextField();
		txtRegstrese.setForeground(new Color(0, 128, 255));
		txtRegstrese.setText("Reg\u00EDstrese");
		txtRegstrese.setSelectionColor(Color.WHITE);
		txtRegstrese.setHorizontalAlignment(SwingConstants.CENTER);
		txtRegstrese.setColumns(10);
		txtRegstrese.setBorder(null);
		txtRegstrese.setBackground(new Color(253, 233, 213));
		txtRegstrese.setBounds(421, 594, 156, 20);
		contentsisqr.add(txtRegstrese);

	}
}
