package img;

import javax.swing.*;// importo todo lo que necesito de swing para los gráficos

public class MarcoSisqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miMarco marco1=new miMarco();
		marco1.setVisible(true);// QUE SE HAGA VISIBLE EL MARCO POR DEFECTO NO SE VISUALIZA
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// SE ACTIVA QUE HACE AL CERRAR LA VENTANA O MARCO Y NO SIGA FUNCIONANDO O CONSUMA RECURSOS

	}

}

class miMarco extends JFrame{ // CLASE PARA HEREDAR DE JFRAME Y UTILIZAR SUS TODOS SUS METODOS
	public miMarco() { // CREO EL CONSTRUCTOR
		//setSize(500,300);// ESTABLECE EL TAMAÑO DEL MARCO YQ QUE POR DEFECTO ES O PX, NO SE VERIA
		//setLocation(500,300);// SE AJUSTA LA POSICION DEL MARCO EN PANTALLA
		setBounds(500,300,250,250); // ESTABLEZCO POSICION Y ANCHO Y LARGO (TAMAÑO)
		//setResizable(false);// PARA BLOQUEAR EL MARCO PARA QUE NO SE CAMBIE EL TAMAÑO O SE MAXIMICE
		//setExtendedState(MAXIMIZED_BOTH);//SE AMPLIA EL MARCO A PANTALLA COMPLETA
		setTitle("SISQR");//COLOCARLE UN NOMBRE AL MARCO
	}
	 
}