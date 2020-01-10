package es.Studium.Ejercicio2Temario;

import java.awt.*;
public class AwtGrid extends Frame
{
	private static final long serialVersionUID = 1L; 
	Button btnBoton1 = new Button("1");
	Button btnBoton2 = new Button("2");
	Button btnBoton3 = new Button("3");
	Button btnBoton4 = new Button("4");
	Button btnBoton5 = new Button("5");
	Button btnBoton6 = new Button("6");
	//Creamos el panel
	Panel pnlPanel1 = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	Panel pnlPanel4 = new Panel();
	Panel pnlPanel5 = new Panel();
	Panel pnlPanel6 = new Panel();
	public AwtGrid() {
		// Establecer la distribución con 3 filas y 2 columnas 
		setLayout( new GridLayout( 3,2 ) );
		//añadimos los botones dentro del panel
		pnlPanel1.add(btnBoton1);
		pnlPanel2.add(btnBoton2);
		pnlPanel3.add(btnBoton3); 
		pnlPanel4.add(btnBoton4); 
		pnlPanel5.add(btnBoton5); 
		pnlPanel6.add(btnBoton6);
		add(pnlPanel1);
		add(pnlPanel2);
		add(pnlPanel3);
		add(pnlPanel4);
		add(pnlPanel5);
		add(pnlPanel6);
		setSize(200,200); 
		setLocationRelativeTo(null); 
		setVisible(true);
	}
	// Fin del Constructor
	public static void main(String[] args) {
		new AwtGrid(); }
	// Fin del main 
}
// Fin de la clase