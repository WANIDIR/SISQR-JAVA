package guisisqr;

import java.awt.*;// IMPORTO EL PAQUETE TODO LO QUE NECESITO DE AWT PARA LOS GRAFICOS
import java.awt.event.*;

import javax.swing.*;// IMPORTO EL PAQUETE TODO LO QUE NECESITO DE SWING PARA LOS GRAFICOS
import javax.swing.border.*;
import javax.swing.table.*;
import com.toedter.calendar.*;


public class Transacciones extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentTranscSisQr;
	private JTable tablaMovimientos;
	private JDateChooser fecha;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transacciones frame = new Transacciones();
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
	public Transacciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// CONFIGURO EL CIERRE DEL MARCO PARA QUE NO CONSUMa RECURSOS
		Toolkit mipantalla=Toolkit.getDefaultToolkit(); // USO METODO TOOLKTI ï¿½RA DETECTAR LA RESOLUCION DE PANTALLA PRINCIPAL
		Dimension tamanoPantalla=mipantalla.getScreenSize();// REVISO EN MI DISPOSITIVO QUE DIMENSION DE PANTALLA TENGO
		int altoPantalla=tamanoPantalla.height;//BUSCO VALOR DEL ALTO GRABADO EN tamañoPantalla Y GUARDO EN LA VBLE
		int anchoPantalla=tamanoPantalla.width;//BUSCO VALOR DEL ANCHO GRABADO EN tamañoPantalla Y GUARDO EN LA VBLE
		setSize(836, 683);// MARCO A MITAD DE LA DIMENSION REAL DEL DISPOSITIVO
		setLocation(altoPantalla/2, anchoPantalla/20);// UBICO MARCO AL CUARTO DE LA DIMENSION REAL DEL DISPOSITIVO
		setTitle("SISQR");//COLOCARLE UN NOMBRE AL MARCO
		Image miIcono=mipantalla.getImage("src/img/Logo_1.png");// VBLE CON EL LOGO DE SISQR GIF, JPEG O PNG
		setIconImage(miIcono);// CONFIGURO LOGO SISQR EN EL MARCO
			//CREO EL MARCO
			contentTranscSisQr = new JPanel();
			contentTranscSisQr.setForeground(new Color(0, 0, 0));
			contentTranscSisQr.setBackground(new Color(253, 233, 213));
			contentTranscSisQr.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentTranscSisQr.setLayout(null);
			setContentPane(contentTranscSisQr);
				//CREO EL PANEL SUPERIOR
				Panel panel_superior = new Panel();
				panel_superior.setBackground(new Color(249, 203, 156));
				panel_superior.setBounds(0, 0, 820, 64);
				panel_superior.setLayout(null);
				getContentPane().add(panel_superior);
					//INSERTO ICONO WASAP
					JLabel ICONOWASAP = new JLabel("");
					ICONOWASAP.setIcon(new ImageIcon(SisQr.class.getResource("/img/whatsapp64.png")));
					ICONOWASAP.setBounds(24, 520, 64, 64);
					getContentPane().add(ICONOWASAP);
						//INSERTO ICONO LOGO SISQR
						JLabel ICONOSISQR = new JLabel("");
						ICONOSISQR.setIcon(new ImageIcon(SisQr.class.getResource("/img/Logo1.png")));
						ICONOSISQR.setBounds(24, 0, 95, 64);
						panel_superior.add(ICONOSISQR);
							//INSERTO ICONO INICIO
							JLabel ICONOCASA = new JLabel("");
							ICONOCASA.setBounds(650, 0, 60, 64);
							ICONOCASA.setHorizontalTextPosition(SwingConstants.CENTER);
							ICONOCASA.setIcon(new ImageIcon(SisQr.class.getResource("/img/hogar64.png")));
							panel_superior.add(ICONOCASA);
								//INSERTO ICONO CERRAR SESIÓN
								JLabel ICONOCERRAR = new JLabel("");
								ICONOCERRAR.setIcon(new ImageIcon(Transacciones.class.getResource("/img/CerrarSesi\u00F3n.png")));
								ICONOCERRAR.setBounds(730, 0, 64, 64);
								panel_superior.add(ICONOCERRAR);
										//INSERTO TEXTO ÚLTIMOS MOVIMIENTOS
										JLabel Nombre_Tabla = new JLabel("Últimos movimientos");
										Nombre_Tabla.setHorizontalTextPosition(SwingConstants.CENTER);
										Nombre_Tabla.setHorizontalAlignment(SwingConstants.CENTER);
										Nombre_Tabla.setFont(new Font("Tahoma", Font.BOLD, 20));
										Nombre_Tabla.setBounds(302, 130, 215, 50);
											// CREO LA TABLA PARA LA INFORMACIÓN DE MOVIMIENTOS
											tablaMovimientos = new JTable();
											tablaMovimientos.setModel(new DefaultTableModel(
												new Object[][] {
													{null, null, null},
													{null, null, null},
													{null, null, null},
													{null, null, null},
													{null, null, null},
													{null, null, null},
													{null, null, null},
													{null, null, null},
													{null, null, null},
													{null, null, null},
													{null, null, null},
													{null, null, null},
													{null, null, null},
													{null, null, null},
													{null, null, null},
													{null, null, null},
													{null, null, null},
													{null, null, null},
												},
												new String[] {
													"Fecha", "Transacci\u00F3n", "Valor"
												}
											));
												//CREO EL SCROLL PARA LA TABLA DE MOVIMIENTOS
												JScrollPane scrollPane = new JScrollPane();
												scrollPane.setBounds(237, 190, 360, 280);
												scrollPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
												scrollPane.setViewportView(tablaMovimientos);
													//CREO EL NUEVO PANEL CENTRAL DONDE VISUALIZO EL SCROLL, TABLA Y TEXTO DE ULTIMOS MOVIMIENTOS
													JPanel panel = new JPanel();
													panel.setBorder(new LineBorder(new Color(0, 0, 0)));
													panel.setBackground(new Color(249, 203, 156));
													panel.setBounds(185, 110, 450, 450);
														getContentPane().add(Nombre_Tabla);
														getContentPane().add(scrollPane);
														getContentPane().add(panel);
														
	}
}
