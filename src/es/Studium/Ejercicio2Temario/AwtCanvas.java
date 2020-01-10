package es.Studium.Ejercicio2Temario;
import java.awt.*;
/**
 * @author alvaro
 *
 */
public class AwtCanvas extends Frame
{
	private static final long serialVersionUID = 1L;
	// Creación del Canvas
	Canvas cnvC1 = new Canvas();
	public AwtCanvas()
	{
		setLayout(new FlowLayout());
		setTitle("Canvas"); //Pone el titulo de la pantalla
		add(cnvC1);
		setLocationRelativeTo(null);//hace que al ejecutarlo la ventana aparezca justo en el centro de la pantalla
		setSize(100, 100);//Tamaño
		// Obtener el foco para el canvas
		cnvC1.requestFocus(); 
		setVisible(true); //Lo hace visible
	}
	public static void main(String[] args)
	{
		new AwtCanvas(); //Muestra el Canvas
	}
}