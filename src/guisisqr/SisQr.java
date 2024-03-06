package guisisqr;

import java.awt.*;
import javax.swing.*;// IMPORTO EL PAQUETE TODO LO QUE NECESITO DE SWING PARA LOS GRAFICOS
import javax.swing.border.*;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//CONFIGURO EL CIERRE DE VENTANA Y RECURSO
		Toolkit mipantalla=Toolkit.getDefaultToolkit(); // USO METODO TOOLKTI PARA DETECTAR LA RESOLUCION DE PANTALLA PRINCIPAL
		Dimension tamanoPantalla=mipantalla.getScreenSize();// REVISO EN MI DISPOSITIVO QUE DIMENSION DE PANTALLA TENGO
		int altoPantalla=tamanoPantalla.height;//BUSCO VALOR DEL ALTO GRABADO EN tamañoPantalla Y GUARDO EN LA VBLE
		int anchoPantalla=tamanoPantalla.width;//BUSCO VALOR DEL ANCHO GRABADO EN tamañoPantalla Y GUARDO EN LA VBLE
		setSize(836, 683);// MARCO A MITAD DE LA DIMENSION REAL DEL DISPOSITIVO
		setLocation(altoPantalla/2, anchoPantalla/20);// UBICO MARCO AL CUARTO DE LA DIMENSION REAL DEL DISPOSITIVO
		setTitle("SISQR");//COLOCARLE UN NOMBRE AL MARCO
		Image miIcono=mipantalla.getImage("src/img/Logo_1.png");// VBLE CON EL LOGO DE SISQR GIF, JPEG O PNG
		setIconImage(miIcono);// CONFIGURO LOGO SISQR EN EL MARCO
		//CREO EL MARCO
		contentsisqr = new JPanel();
		contentsisqr.setLayout(null);
		contentsisqr.setForeground(new Color(0, 0, 0));
		contentsisqr.setBackground(new Color(253, 233, 213));
		contentsisqr.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentsisqr);
			//CREO EL PANEL SUPERIOR
			Panel panel_superior = new Panel();
			panel_superior.setLayout(null);
			panel_superior.setBounds(0, 0, 820, 64);
			panel_superior.setBackground(new Color(249, 203, 156));
			getContentPane().add(panel_superior);
				//INSERTO ICONO SISQR
				JLabel ICONOSISQR = new JLabel("");
				ICONOSISQR.setBounds(24, 0, 95, 64);
				ICONOSISQR.setIcon(new ImageIcon(SisQr.class.getResource("/img/Logo1.png")));
				panel_superior.add(ICONOSISQR);
					//INSERTO ICONO INICIO
					JLabel ICONOCASA = new JLabel("");
					ICONOCASA.setBounds(650, 0, 60, 64);
					ICONOCASA.setHorizontalTextPosition(SwingConstants.CENTER);
					ICONOCASA.setIcon(new ImageIcon(SisQr.class.getResource("/img/hogar64.png")));
					panel_superior.add(ICONOCASA);
						//CREO EL ICONO DE WASAP
						JLabel ICONOWASAP = new JLabel("");
						ICONOWASAP.setDisabledIcon(null);
						ICONOWASAP.setIconTextGap(0);
						ICONOWASAP.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
						ICONOWASAP.setIcon(new ImageIcon(SisQr.class.getResource("/img/whatsapp64.png")));
						ICONOWASAP.setBounds(24, 520, 64, 64);
						contentsisqr.add(ICONOWASAP);
							//INSERTO ICONO SISQR CENTRAL
							JLabel ICOSISQRCENTRAL = new JLabel("");
							ICOSISQRCENTRAL.setBounds(250, 100, 338, 238);
							ICOSISQRCENTRAL.setHorizontalAlignment(SwingConstants.CENTER);
							ICOSISQRCENTRAL.setBackground(new Color(249, 203, 156));
							ICOSISQRCENTRAL.setIcon(new ImageIcon(SisQr.class.getResource("/img/Logo.png")));
							getContentPane().add(ICOSISQRCENTRAL);
								//INSERTO TITULO INICIO DE SESIÓN
								JLabel Inicio_Sesion = new JLabel("INICIO DE SESIÓN");
								Inicio_Sesion.setFont(new Font("Tahoma", Font.PLAIN, 20));
								Inicio_Sesion.setBounds(356, 329, 171, 20);
								getContentPane().add(Inicio_Sesion);
									//INSERTO TEXTO DE USUARIO
									JLabel Usuario = new JLabel("USUARIO");
									Usuario.setBounds(346, 395, 55, 14);
									getContentPane().add(Usuario);
										//INSERTO CAMPOS DATOS DE USUARIO
										Datos_Usuario = new JTextField();
										Datos_Usuario.setBounds(432, 391, 95, 20);
										Datos_Usuario.setColumns(10);
										getContentPane().add(Datos_Usuario);
											//INSERTO TEXTO DE CONTRASEÑA
											JLabel Contrasena = new JLabel("CONTRASEÑA");
											Contrasena.setBounds(345, 433, 79, 14);
											getContentPane().add(Contrasena);
												//INSERTO CAMPO DE CONTRASEÑA
												passwordField = new JPasswordField();
												passwordField.setBounds(432, 432, 95, 20);
												getContentPane().add(passwordField);
													//INSERTO TEXTO DE OLVIDO DE CONTRASEÑA
													OlvidadoSucontra = new JTextField();
													OlvidadoSucontra.setBorder(null);
													OlvidadoSucontra.setBounds(371, 463, 156, 20);
													OlvidadoSucontra.setColumns(10);
													OlvidadoSucontra.setForeground(new Color(0, 128, 255));
													OlvidadoSucontra.setCaretColor(new Color(0, 128, 255));
													OlvidadoSucontra.setSelectionColor(new Color(255, 255, 255));
													OlvidadoSucontra.setBackground(new Color(253, 233, 213));
													OlvidadoSucontra.setHorizontalAlignment(SwingConstants.CENTER);
													OlvidadoSucontra.setText("¿Ha olvidado su contraseña?");
													getContentPane().add(OlvidadoSucontra);
														//INSERTO CHECBKBOX DE RECORDAR USUARIO
														JCheckBox Recordar_Usua = new JCheckBox("Recordar Ususario");
														Recordar_Usua.setBackground(new Color(253, 233, 213));
														Recordar_Usua.setBounds(381, 494, 161, 23);
														getContentPane().add(Recordar_Usua);
															//CREO EL BOTON INGRESAR
															JButton Boton_ingresar = new JButton("INGRESAR");
															Boton_ingresar.setBounds(381, 542, 120, 23);
															Boton_ingresar.setForeground(new Color(64, 0, 64));
															Boton_ingresar.setBackground(new Color(255, 255, 255));
															getContentPane().add(Boton_ingresar);
																//INSERTO EL CAMPO CON EL TEXTO NO TIENES CUENTA
																NoTienesCuenta = new JTextField();
																NoTienesCuenta.setBackground(new Color(253, 233, 213));
																NoTienesCuenta.setBounds(308, 576, 156, 20);
																NoTienesCuenta.setSelectionColor(Color.WHITE);
																NoTienesCuenta.setHorizontalAlignment(SwingConstants.CENTER);
																NoTienesCuenta.setColumns(10);
																NoTienesCuenta.setBorder(null);
																NoTienesCuenta.setText("¿No tienes una cuenta?");
																getContentPane().add(NoTienesCuenta);
																	//INSERTO EL CAMPO CON EL TEXTO REGÍSTRESE
																	txtRegstrese = new JTextField();
																	txtRegstrese.setBorder(null);
																	txtRegstrese.setColumns(10);
																	txtRegstrese.setBounds(421, 576, 156, 20);
																	txtRegstrese.setBackground(new Color(253, 233, 213));
																	txtRegstrese.setForeground(new Color(0, 128, 255));
																	txtRegstrese.setSelectionColor(Color.WHITE);
																	txtRegstrese.setHorizontalAlignment(SwingConstants.CENTER);
																	txtRegstrese.setText("Regístrese");
																	getContentPane().add(txtRegstrese);					
	}
}
