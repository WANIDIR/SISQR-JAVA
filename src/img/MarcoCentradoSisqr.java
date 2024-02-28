package img;

import javax.swing.*;// IMPORTO EL PAQUETE TODO LO QUE NECESITO DE SWING PARA LOS GRAFICOS
//import java.awt.Toolkit;// IMORTO EL PAQUETE PARA USAR EL TOOLKIT
import java.awt.*;// IMPORTO ESE PAQUETE Y SE HABILITA EL USO DE TOOLKIT Y DIMENSION

public class MarcoCentradoSisqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentradoSisqr marco1=new CentradoSisqr();
		marco1.setVisible(true);// QUE SE HAGA VISIBLE EL MARCO POR DEFECTO NO SE VISUALIZA
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// SE ACTIVA QUE HACE AL CERRAR LA VENTANA O MARCO Y NO SIGA FUNCIONANDO O CONSUMA RECURSOS

	}

}

class CentradoSisqr extends JFrame{ // HAY QUE IMPORTAR EL PAQUETE javax.swing.* O SI NO DA ERROR
	
	public CentradoSisqr () {
		Toolkit mipantalla=Toolkit.getDefaultToolkit(); // USO METODO TOOLKTI �RA DETECTAR LA RESOLUCION DE PANTALLA PRINCIPAL
		Dimension tamanoPantalla=mipantalla.getScreenSize();// REVISO EN MI DISPOSITIVO QUE DIMENSION DE PANTALLA TENGO
		int altoPantalla=tamanoPantalla.height;//BUSCO VALOR DEL ALTO GRABADO EN tama�oPantalla Y GUARDO EN LA VBLE
		int anchoPantalla=tamanoPantalla.width;//BUSCO VALOR DEL ANCHO GRABADO EN tama�oPantalla Y GUARDO EN LA VBLE
		setSize(altoPantalla/2, anchoPantalla/2);// MARCO A MITAD DE LA DIMENSION REAL DEL DISPOSITIVO
		setLocation(altoPantalla/2, anchoPantalla/20);// UBICO MARCO AL CUARTO DE LA DIMENSION REAL DEL DISPOSITIVO
		setTitle("SISQR");//COLOCARLE UN NOMBRE AL MARCO
		Image miIcono=mipantalla.getImage("src/img/Logo.jpeg");// VBLE CON EL LOGO DE SISQR GIF, JPEG O PNG
		setIconImage(miIcono);// CONFIGURO LOGO SISQR EN EL MARCO
	}
}