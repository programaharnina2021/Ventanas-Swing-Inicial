package contenedor01;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HolaMundo {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Ventana Hola Mundo");
		// cada elemento que puede ir dentro de un frame o contenedor
		// se llama componente swing
		JLabel etiqueta = new JLabel("etiqueta Hola mundo");
		JLabel etiquetaDos = new JLabel("La segunda etiqueta");
		// Como introducimos este componente en la ventana
		ventana.add(etiqueta);
		ventana.add(etiquetaDos);
		//Como si hay elementos dentro de la ventana podemos 
		//usar el metodo pack()
		ventana.pack();
		ventana.setVisible(true);
	}

}
