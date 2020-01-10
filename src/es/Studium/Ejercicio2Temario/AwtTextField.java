package es.Studium.Ejercicio2Temario;
import java.awt.*;
/**
 * @author alvaro
 *
 */
public class AwtTextField extends Frame
{
	private static final long serialVersionUID = 1L;
	// Crear un TextField con 20 de ancho
	TextField txtTexto = new TextField(20);//Tamaño visual del campo, ojo no es el tamaño de los datos.
	public AwtTextField()
	{
		setLayout(new FlowLayout());
		setTitle("TextField");//Ponemos el titulo de la ventana
		add(txtTexto);//Añadimos el campo de texto
		txtTexto.requestFocus();//pincha automaticamente el campo de texto
		setLocationRelativeTo(null); //Ponemos la ventana en el centro de la pantalla
		setSize(250,100);//Ponemos el tamaño de la ventana
		setVisible(true);//Indicamos si es visible o no
	}
	public static void main(String[] args)
	{
		new AwtTextField(); //mostramos el trxtfield
	}
}