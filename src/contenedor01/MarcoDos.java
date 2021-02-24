package contenedor01;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JFrame;

public class MarcoDos {

	public static void main(String[] args) {
		JFrame ventanuca = new JFrame("Mi Segunda Ventana");
		int y = 400;
		int x = 100;
		int alto = 300;
		int ancho = 100;
		
		Dimension dimension = new Dimension(alto, x);
		ventanuca.setSize(dimension);
		// se puede hacer asi pero cuidado con la obsesion de
		// tipos primitivos
//		ventanuca.setSize(300,100);
		ventanuca.setVisible(true);
		JFrame ventanucaDos=new JFrame("Mi Tercera Ventana");
		Rectangle rectangle=new Rectangle(x, y, ancho, alto);
		//Poner los numeros directamente se llama hardcodear
		//y es evitable y no deseable.
//		Rectangle rectangle=new Rectangle(100, 300, 100, 300;
		Rectangle rectangled=new Rectangle(new Point(x, y),new Dimension(ancho, alto));
		ventanucaDos.setBounds(rectangled);
		ventanucaDos.setVisible(true);
	}

}
